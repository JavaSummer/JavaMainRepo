package javasmmr.zoowsome.controllers;
import java.util.ArrayList;

import javasmmr.zoowsome.Constants;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.models.employees.Employee;

public class MainController {
	public static void main(String[] args) throws Exception {
		
		int nrOfAnimals=50;// nr of species we have at zoo
		int nrOfEmployees=20;
		CreationOfModels zoo=new CreationOfModels();
		Animal[] a=zoo.createAnimals(nrOfAnimals);
		Caretaker[] employees=zoo.createCaretakers(nrOfEmployees);

/// Assignment 4
	/*for (int i=0;i<nrOfEmployees;i++){
		for (int j=0;j<nrOfAnimals;j++)
		{
		if(!employees[i].getIsDead() && !a[j].getTakeCareOf()){
		String result = employees[i].takeCareOf(a[j]);
		if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
		employees[i].setIsDead(true);
		
		}
		else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
			continue;
		}
		else {
		a[j].setTakeCareOf(true);
		}
		}
		}
		}
	boolean allTakenCare=true;
	for (int j=0;j<nrOfAnimals;j++){
		System.out.println(a[j].getName());
		if (!a[j].getTakeCareOf()) 
			System.out.println(j+" The caretakers haven't take care of the "+ a[j].getName()+" yet.");
			allTakenCare=false;
		}
	
	if (allTakenCare) System.out.println("All the animals are fine.");
*/

	/// Assignment 5
	
	AnimalRepository animalRepo = new AnimalRepository();
			ArrayList<Animal> animals = new ArrayList<>();
		    for (int i=0;i<nrOfAnimals;i++)
			   animals.add(a[i]);
			 animalRepo.save(animals);
			 animalRepo.load();

    EmployeeRepository employeeRepo=new EmployeeRepository();
    ArrayList<Employee> employeesXML=new ArrayList<>();
    for (int i=0;i<nrOfEmployees;i++)
    	employeesXML.add(employees[i]);
       employeeRepo.save(employeesXML);
       employeeRepo.load();
          
	
}
}