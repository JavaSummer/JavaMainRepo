package javasmmr.zoowsome.repositories;

import java.util.UUID;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.animal.Constants;
import java.math.BigDecimal;

import org.w3c.dom.Element;

/**
 * 
 * @author Marius Bologa
 */
public class EmployeeRepository extends EntityRepository<Employee> {
	/**
	 * 
	 */
	private static final String XML_FILENAME = "Employees.xml";

	/**
	 * 
	 */
	public EmployeeRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}

	/**
	 * @param element
	 *            Type of the employee.
	 * @return The caretakers to be created.
	 */
	protected final Employee getEntityFromXmlElement(final Element element) {
		String discriminant = element.getElementsByTagName(
				Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Employees.Caretaker:
			Employee caretaker = new Caretaker(
					String.valueOf(element.getElementsByTagName("name").
							item(0).getTextContent()),
					UUID.fromString(element.getElementsByTagName("ID").
							item(0).getTextContent()), BigDecimal
							.valueOf(Double.valueOf(element.
									getElementsByTagName("Salary").
									item(0).getTextContent())));
			caretaker.decodeFromXml(element);
			return caretaker;
		default:
			break;
		}
		return null;
	}
}