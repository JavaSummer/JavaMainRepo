package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.CareTaker_I;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;

abstract public class Employee implements CareTaker_I, XML_Parsable{
	//instance variables 
	private String name;
	private long id;
	private boolean isDead;
	private BigDecimal salary;
	
	//constructors
	
	public Employee(){
		name = "";
		id = (long)(Math.random() * Math.pow(10, 13));
		salary = new BigDecimal("0");
		isDead = false;
	}
	public Employee(String theName, BigDecimal theSalary, boolean ifDead){
		name = theName;
		id = (long)(Math.random() * Math.pow(10, 13));
		salary = theSalary;
		isDead = ifDead;
	}
	
	//getters/setters
	
	public String getName(){
		return name;
	}
	
	public void setName(String theName){
		name = theName;
	}
	
	public void setId(long theId){
		id = theId;
	}
	public boolean isDead(){
		return isDead;
	}
	
	public void setIsDead(boolean ifDead){
		isDead = ifDead;
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	
	public void setSalary(BigDecimal theSalary){
		salary = theSalary;
	}
	
	public long getId(){
		return id;
	}
	
	//implement the XML_Parsable interface
	
			public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
				createNode(eventWriter, "name", String.valueOf(this.name));
				createNode(eventWriter, "id", String.valueOf(this.id));
				createNode(eventWriter, "isDead", String.valueOf(this.isDead));
				createNode(eventWriter, "salary", String.valueOf(this.salary));
			}
			
			public void decodeFromXml(Element element){
				setName(element.getElementsByTagName("name").item(0).getTextContent());
				setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
				setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
				setSalary(BigDecimal.valueOf(Long.parseLong(element.getElementsByTagName("salary").item(0).getTextContent())));
			}
}
