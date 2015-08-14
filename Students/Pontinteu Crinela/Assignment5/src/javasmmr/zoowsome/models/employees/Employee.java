package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;


import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.Caretaker_I;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Employee implements Caretaker_I, XML_Parsable{
	
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	
	
	public Employee(String name, long id, BigDecimal salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.isDead = false;
	}
	
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}

	@Override
	public void decodeFromXml(Element element) {
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setSalary(BigDecimal.valueOf(Double.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	
	}
	
	public String getName() {
		return name;
	}
	public long getId() {
		return id;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public boolean getIsDead() {
		return isDead;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	

	

}
