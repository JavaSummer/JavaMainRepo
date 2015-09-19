package javasmmr.zoowsome.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.Constants;

public class EntityController {

	private static EntityController instance = new EntityController();
	private ArrayList<Animal> animals = new ArrayList<>();
	private ArrayList<Employee> employees = new ArrayList<>();

	private EntityController() {
	}

	public static EntityController getInstance() {
		return instance;
	}
	
	public ArrayList<Animal> getAnimals(){
		return animals;
	}
	
	public ArrayList<Employee> getEmployees(){
		return employees;
	}

	public void addAnimal(Animal an) {
		instance.animals.add(an);
	}

	public void addEmployee(Employee em) {
		instance.employees.add(em);
	}

	public boolean takeCare() throws Exception {
		for (Employee c : employees) {
			for (Animal a : animals) {
				if (!c.getIsDead() && !a.getTakenCareOf()) {
					String result = c.takeCareOf(a);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						c.setIsDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						continue;
					} else {
						a.setTakenCareOf(true);
					}
				}
			}
		}
		boolean result = true;
		for (Animal a : animals) {
			if (a.getTakenCareOf() == false) {
				result = false;
			}
		}
		return result;
	}

	AnimalRepository animalRep = new AnimalRepository();
	EmployeeRepository employeeRep = new EmployeeRepository();

	public void saveToFile() throws FileNotFoundException, XMLStreamException {
		animalRep.save(animals);
		employeeRep.save(employees);
	}

	public void loadFromFile() throws ParserConfigurationException, SAXException, IOException {
		File an = new File("Animals.xml");
		File em = new File("Employees.xml");
		if(an.exists() && em.exists()){
		animals = animalRep.load();
		employees = employeeRep.load();
		}
		else return;
	}
}
