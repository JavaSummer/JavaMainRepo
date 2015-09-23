package javasmmr.zoowsome.repositories;

import java.util.ArrayList;

import org.w3c.dom.*;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeRepository extends EntityRepository<Employee> {

	private static final String XML_FILENAME = "Employees.xml";

	// this is where I will store all the employees that have to be listed
	private static ArrayList<Employee> employeesToBeListed = new ArrayList<Employee>();

	public static void addEmployeeToBeListed(Employee employee) {
		employeesToBeListed.add(employee);
	}

	public static ArrayList<Employee> getEmployeesToBeListed() {
		return employeesToBeListed;
	}

	public EmployeeRepository() {

		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}

	@Override
	protected Employee getEntityFromXmlElement(Element element) {

		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {

		case Constants.EmployeesType.Caretakers:

			Employee caretaker = new Caretaker();
			caretaker.decodeFromXml(element);
			return caretaker;

		default:
			break;
		}
		return null;
	}

}
