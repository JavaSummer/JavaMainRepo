package javasmmr.zoowsome.models.employees;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Killer;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Employee implements XML_Parsable{
	
	String name;
	Long id;
	BigDecimal salary;
    Boolean isDead = true;
    
    public Employee(){
    }
    
    public Employee(String name, BigDecimal salary, boolean isDead){
    	
    	setName(name);
    	setId();
    	setSalary(salary);
    	setIsDead(isDead);
    	
    }
    
    public void setName(String name){
    	this.name = new String(name);
    }
	
	public String getName(){
		return name;
	}
	
	public Long getId(){
		return id;
	}
	public void setId(){
		
		Random generator = new Random();
		String nr = String.format("%d", generator.nextInt(2) + 1 );;
		for (int i=0;i<12;i++){
			nr =nr + String.format("%d", generator.nextInt(10));
		}
		id = Long.parseLong(nr);
	}
	
	public void setId(Long id){
		
		this.id = id;
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	
	public void setSalary(BigDecimal salary){
		
		this.salary = salary;
	}
	
	public boolean getIsDead(){
		return isDead;
	}
	
	public void setIsDead(boolean isDead){
		
		this.isDead = isDead;
	}
	
	//encoding to XML
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		createNode(eventWriter, "name", String.valueOf(this.name));  
		createNode(eventWriter, "id", String.valueOf(this.id)); 
		createNode(eventWriter, "salary", String.valueOf(this.salary)); 
		createNode(eventWriter, "isDead", String.valueOf(this.isDead)); 
		} 
	
	//decoding from XML
	public void decodeFromXml(Element element) { 
		
		setName(String.valueOf(element.getElementsByTagName("name").item(0).getTextContent()));  
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent())); 
		setSalary(new BigDecimal(element.getElementsByTagName("salary").item(0).getTextContent()));  
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent())); 
		} 
	
	public abstract void printAllAttributes();
}
