package javasmmr.zoowsome.repositories;

import java.math.BigDecimal;
import java.util.ArrayList;

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
		case Constants.Employee.Caretaker:
			Employee caretaker = new Caretaker(
					String.valueOf(element.getElementsByTagName("name").item(0).getTextContent()),
					Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()),
					BigDecimal.valueOf(Long.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())));
			caretaker.decodeFromXml(element);
			return caretaker;
		default:
			break;
		}
		return null;
	}

	public static void addEmployee(Employee c, EmployeeRepository empRep, ArrayList<Employee> emp) {
		try {
			emp = empRep.load();
			emp.add(c);
			empRep.save(emp);
		} catch (Exception e) {

		}
	}
}
