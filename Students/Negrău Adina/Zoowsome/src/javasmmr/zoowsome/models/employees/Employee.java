package javasmmr.zoowsome.models.employees;
import javasmmr.zoowsome.models.interfaces.*;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
public abstract class Employee implements XML_Parsable{

	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	Employee(){
		name = "Employee";
		id = (long) (Math.random() * 10000000000000L);
		salary = new BigDecimal(3200);
		isDead = false;
	}
	Employee(String name1, BigDecimal salary1, boolean dead){
		name = name1;
		id = (long) (Math.random() * 10000000000000L);
		salary = salary1;
		isDead = dead;
		
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));

	}
	public void decodeFromXml(Element element) {
		setName(String.valueOf(element.getElementsByTagName("name").item(0).getTextContent()));
		setId(Integer.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setSalary(new BigDecimal(String.valueOf(element.getElementsByTagName("id").item(0).getTextContent())));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
	public void setName(String name1){
		name = name1;
	}
	public String getName(){
		return name;
	}
	public void setId(int Id1){
		id = Id1;
	}
	public long getId(){
		return id;
	}
	public void setSalary(BigDecimal salary){
		this.salary = salary;
	}
	public BigDecimal getSalary(){
		return salary;
	}
	public void setIsDead(boolean isDead){
		this.isDead = isDead;
	}
	public boolean getIsDead(){
		return isDead;
	}
}
