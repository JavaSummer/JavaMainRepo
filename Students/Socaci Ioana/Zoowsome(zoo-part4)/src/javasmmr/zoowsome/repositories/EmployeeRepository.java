package javasmmr.zoowsome.repositories;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.employees.CareTaker;
import javasmmr.zoowsome.models.employees.Employee;

import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeRepository extends EntityRepository<Employee> {
	// instance variables
	private static final String XML_FILENAME = "Employees.xml";

	// constructors
	public EmployeeRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}

	// methods

	@Override
	protected Employee getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
				.getTextContent();
		switch (discriminant) {
		case Constants.TypeOfEmployees.CareTaker:
			Employee careTaker = new CareTaker();
			careTaker.decodeFromXml(element);
			return careTaker;
		default:
			break;
		}
	
		return null;
	}

}
