package javasmmr.zoowsome.models.employees;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;

public class Caretaker extends Employee implements Caretaker_I{
	
	double workingHours;
	
	public Caretaker(){
		
	}
	
	public void setWorkingHours(double workingH){
		workingHours = workingH;
	}
	
	public Double getWorkingHours(){
		return workingHours;
	}
	
	//implementing the method from the interface
	public String takeCareOf(Animal animal){
		
		if (animal.kill()){
			return Employees.Caretakers.TCO_KILLED;
		}
		else if(((Double.valueOf(this.workingHours)).compareTo(animal.maintenanceCost))<0){
			return Employees.Caretakers.TCO_NO_TIME;
		}
		else
		{
		animal.takenCareOf = true;
		workingHours-=animal.maintenanceCost;
		return Employees.Caretakers.TCO_SUCCESS;
		}
	}
	
	//encoding to xml
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		 
		 super.encodeToXml(eventWriter);  
		 createNode(eventWriter, "workingHours", String.valueOf(getWorkingHours()));  
		 super.encodeToXml(eventWriter);  
			createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.EmployeesType.Caretakers); 
			  
	 } 
		 
	//decoding from xml
		public void decodeFromXml(Element element) { 
			
          super.decodeFromXml(element);
          setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent())); 
			
	}	
	
		public void printAllAttributes(){
			
			System.out.println("Name: "+ getName());
			System.out.println("Id: "+getId());
			System.out.println("Salry "+getSalary());
			System.out.println((getIsDead())?"The employee is dead":"The employee is still alive");
			System.out.println("Working hours: "+getWorkingHours());
			
		}

}
