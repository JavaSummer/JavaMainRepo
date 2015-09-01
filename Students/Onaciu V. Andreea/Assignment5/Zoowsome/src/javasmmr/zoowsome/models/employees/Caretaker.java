package javasmmr.zoowsome.models.employees;
import java.math.*;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.*;
import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;
public class Caretaker extends Employee implements Caretaker_I{
 private double workingHours;
 public void setWorkingHours(double hours){
	 this.workingHours=hours;
 }
 public double getWorkingHours(){
	 return workingHours;
 }
 
 public Caretaker(String name,Long id,BigDecimal salary,double workingHours){
 super(name,id,salary);
 this.workingHours=workingHours;
 }
 public String takeCareOf(Animal a){
		 if (a.kill()) {
		 return Constants.Employees.Caretakers.TCO_KILLED;
		 }
		 if (this.workingHours < a.getMaintenanceCost()){
		 return Constants.Employees.Caretakers.TCO_NO_TIME;
		 }
		 a.setTakeCareOf(true);
		 setWorkingHours(workingHours-a.getMaintenanceCost());
		 return Constants.Employees.Caretakers.TCO_SUCCESS;
		 }
 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
	 super.encodeToXml(eventWriter);
	 createNode(eventWriter, "workingHours", String.valueOf(getWorkingHours()));
	 createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
			 Constants.Employees.Employee.Caretaker);
	 }  
 public void decodeFromXml(Element element) {
	 setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	 }
 }
 



interface Caretaker_I{
	public String takeCareOf(Animal animal);
	
}