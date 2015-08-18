package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.UUID;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;
/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Employee implements XML_Parsable {
	/**
	 * 
	 * @param name
	 *            The name of the employee.
	 * 
	 * @param id
	 *            Id.
	 * @param salary
	 *            The salary.
	 */
	public Employee(final String name, final UUID id, final BigDecimal salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private boolean isDead = false;
	/**
	 * 
	 */
	UUID id;

	/**
	 * 
	 * @return The name of the employee.
	 */
	public final String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            Of the employee.
	 */
	public final void setName(final String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return If he/she is dead.
	 */
	public final boolean isDead() {
		return isDead;
	}

	/**
	 * 
	 * @param isDead
	 *            .
	 */
	public final void setDead(final boolean isDead) {
		this.isDead = isDead;
	}

	/**
	 * 
	 * @return The id.
	 */
	public final UUID getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The ID.
	 */

	public final void setId(final UUID id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The salary of the employee.
	 */
	public final BigDecimal getSalary() {
		return salary;
	}

	/**
	 * 
	 * @param salary
	 *            The salary.
	 */
	public final void setSalary(final BigDecimal salary) {
		this.salary = salary;
	}

	/**
	 * 
	 */
	private BigDecimal salary;
	/**
	 * @param eventWriter Text to encode.
	 * @throws XMLStreamException .
	 */
	public void encodeToXml(final XMLEventWriter eventWriter) 
			throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
		createNode(eventWriter, "ID", String.valueOf(this.id));
		createNode(eventWriter, "Salary", String.valueOf(this.salary));
		}
	/**
	 * @param element Element to decode.
	 */
	public void decodeFromXml(final Element element) {
				setName(element.getElementsByTagName("name").
						item(0).getTextContent());
				setDead(Boolean.valueOf(element.
						getElementsByTagName("isDead").item(0).
						getTextContent()));
				setId(UUID.fromString(element.
						getElementsByTagName("id").
						item(0).getTextContent()));
				setSalary(BigDecimal.valueOf(Double.
						valueOf(element.getElementsByTagName("salary").
								item(0).getTextContent())));
			}
}
