package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
import javasmmr.zoowsome.services.animalfactories.Constants;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.animals.Aquatic.waterType;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;
import org.w3c.dom.Element;
import javasmmr.zoowsome.models.employees.Employee;
public class Caretaker extends Employee implements Caretaker_I{
	private double workingHours;
	
	public Caretaker(){
		super();		
	}

	public String takeCareOf(Animal a){
		if(a.kill()){
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if(this.workingHours < a.maintenanceCost){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		
		a.setTakenCareOf(true);
		workingHours = workingHours - a.maintenanceCost;
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(getWorkingHours()));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Employee.Caretaker);
		}
	public void decodeFromXml(Element element){
		setWorkingHours(Integer.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}
	public Caretaker(String name1, BigDecimal salary1, boolean dead, double workingHours){
		super(name1, salary1, dead);
		this.workingHours = workingHours;
	}
	public void setWorkingHours(double workingHours){
		this.workingHours = workingHours;
	}
	
	public double getWorkingHours(){
		return workingHours;
	}
	
}
