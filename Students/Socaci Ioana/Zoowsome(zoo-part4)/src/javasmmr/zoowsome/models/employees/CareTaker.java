package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.interfaces.CareTaker_I;
import javasmmr.zoowsome.services.factories.*;

public class CareTaker extends Employee implements CareTaker_I{

	//constructors
	
	public CareTaker(){
		super();
	}
	public CareTaker(String theName, BigDecimal theSalary, boolean ifDead) {
		super(theName, theSalary, ifDead);
	}
	
	//instance variables

	private double workingHours;
	
	//getters/setters
	
	public double getWorkingHours(){
		return workingHours;
	}
	
	public void setWorkingHours(double theWorkingHours){
		workingHours = theWorkingHours;
	}
	
	//implement the method of the CareTaker interface
	
	public String takeCareOf(Animal a){
		if(a.kill()){
			return Constants.Employees.CareTakers.TCO_KILLED;
		}
		if(this.workingHours < a.getMaintenanceCost()){
			return Constants.Employees.CareTakers.TCO_NO_TIME;
		}
		a.setTakenCareOf(true);
		this.workingHours = this.workingHours - a.getMaintenanceCost();
		return Constants.Employees.CareTakers.TCO_SUCCESS;
	}

		//override the method encodeToXml
	
		public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
			super.encodeToXml(eventWriter);
			createNode(eventWriter, "workingHours", String.valueOf(this.workingHours));
		}
		
		//override the method decodeFromXml
		
		public void decodeFromXml(Element element){
			super.decodeFromXml(element);
			setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
		}
	
}
