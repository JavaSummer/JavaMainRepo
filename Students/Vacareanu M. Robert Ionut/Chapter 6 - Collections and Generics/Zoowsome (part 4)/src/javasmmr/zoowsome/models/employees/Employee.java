package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Employee implements XML_Parsable {
	Random randomGenerator = new Random();
	private long id;
	String name;
	BigDecimal salary;
	Boolean isDead = false;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public boolean getIsDead() {
		return this.isDead;
	}

	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}

	Employee(String name, long id, BigDecimal salary) {
		this.setName(name);
		this.setId(id);
		this.setSalary(salary);
		setIsDead(false);
	}

	Employee() {
		this.setId((long) (randomGenerator.nextDouble() * 10000000000000L));
		this.setName("Employee" + id);
		this.setSalary(new BigDecimal(1000));
		this.setIsDead(false);
	}
	
	Employee(String name){
		this.setId((long) (randomGenerator.nextDouble() * 10000000000000L));
		this.setName(name + id);
		this.setSalary(new BigDecimal(1000));
		this.setIsDead(false);
	}
	
	public String takeCareOf(Animal animal) throws Exception{
		return null;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "ID", String.valueOf(this.id));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "dead", String.valueOf(this.isDead));
	}

	public void decodeFromXml(Element element) {
		setId(Long.valueOf(element.getElementsByTagName("ID").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setSalary(BigDecimal.valueOf(Double.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("dead").item(0).getTextContent()));
	}
}
