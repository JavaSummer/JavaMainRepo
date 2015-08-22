package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Employee implements XML_Parsable {

	private String name;
	private long id = (long) Math.floor(Math.random() * 9000000000000L) + 1000000000000L; // generates a pseudo-random 13 digit nr
	private BigDecimal salary;
	private boolean isDead;

	// default constructor; each employee is alive
	public Employee() {
		isDead = false;
	}

	// constructor with all 3 fields as parameters
	public Employee(String thisName, BigDecimal thisSalary, boolean dead) {
		name = thisName;
		salary = thisSalary;
		isDead = dead;
	}

	public String getName() {
		return name;
	}

	public void setName(String thisName) {
		name = thisName;
	}

	public long getId() {
		return id;
	}

	public void setId(long ThisId) {
		id = ThisId;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal ThisSalary) {
		salary = ThisSalary;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean dead) {
		isDead = dead;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}

	public void decodeFromXml(Element element) {
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setSalary(BigDecimal.valueOf(Double.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())));
		setDead(Boolean.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
	}
}
