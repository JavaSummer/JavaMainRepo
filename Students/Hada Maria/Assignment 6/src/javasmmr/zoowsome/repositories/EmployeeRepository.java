package javasmmr.zoowsome.repositories;

import java.math.BigDecimal;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeRepository extends EntityRepository<Employee> {
	private static final String XML_FILENAME = "Employees.xml";

	public EmployeeRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}

	protected Employee getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Employees.Caretaker:

			String name = element.getElementsByTagName("name").item(0).getTextContent();
			BigDecimal salary = BigDecimal
					.valueOf(Double.valueOf(element.getElementsByTagName("salary").item(0).getTextContent()));
			long id = Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent());

			Employee caretaker = new Caretaker(name, id, salary);
			caretaker.decodeFromXml(element);
			return caretaker;
		default:
			break;
		}
		return null;
	}
}
