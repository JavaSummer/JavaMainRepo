package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Employee implements XML_Parsable {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;

	public Employee(String employeeName, long ID, BigDecimal employeeSalary) {
		name = employeeName;
		id = ID;
		salary = employeeSalary;
		isDead = false;
	}

	public void setName(String employeeName) {
		name = employeeName;
	}

	public String getName() {
		return name;
	}

	public void setId(long ID) {
		id = ID;
	}

	public long getId() {
		return id;
	}

	public void setSalary(BigDecimal employeeSalary) {
		salary = employeeSalary;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setIsDead(boolean dead) {
		isDead = dead;
	}

	public boolean getIsDead() {
		return isDead;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}

	public void decodeFromXml(Element element) {
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setSalary(BigDecimal.valueOf(Double.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
}
