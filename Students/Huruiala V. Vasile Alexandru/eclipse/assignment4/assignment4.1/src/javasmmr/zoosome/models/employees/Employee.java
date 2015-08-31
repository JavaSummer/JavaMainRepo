package javasmmr.zoosome.models.employees;

import static javasmmr.zoosome.repositories.EntityRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoosome.models.interfaces.XML_Parsable;

public abstract class Employee implements XML_Parsable {
	private static final String DEFAULT_NAME = null;
	private static final long DEFAULT_ID = 0;
	private static final BigDecimal DEFAULT_SALARY = null;
	private static final boolean DEFAULT_IS_DEAD = false;

	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;

	public Employee() {
		this.name = DEFAULT_NAME;
		this.id = DEFAULT_ID;
		this.salary = DEFAULT_SALARY;
		this.isDead = DEFAULT_IS_DEAD;
	}

	public Employee(final String employeeName, final long employeeId, final BigDecimal employeeSalary) {
		this.name = new String(employeeName);
		this.id = employeeId;
		this.salary = employeeSalary;
		this.isDead = DEFAULT_IS_DEAD;
	}

	public Employee(final String employeeName, final long employeeId, final double employeeSalary) {
		this(employeeName, employeeId, new BigDecimal(employeeSalary));
	}

	public String getName() {
		return new String(this.name);
	}

	public void setName(String newName) {
		this.name = new String(newName);
	}

	public long getId() {
		return this.id;
	}

	public void setId(long newId) {
		this.id = newId;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal newSalary) {
		this.salary = newSalary;
	}

	public boolean getIsDead() {
		return this.isDead;
	}

	public void setIsDead(boolean newIsDead) {
		this.isDead = newIsDead;
	}

	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.getName()));
		createNode(eventWriter, "id", String.valueOf(this.getId()));
		createNode(eventWriter, "salary", String.valueOf(this.getSalary()));
		createNode(eventWriter, "isDead", String.valueOf(this.getIsDead()));
	}

	public void decodeFromXML(Element element) {
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setSalary(new BigDecimal(element.getElementsByTagName("salary").item(0).getTextContent()));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
}
