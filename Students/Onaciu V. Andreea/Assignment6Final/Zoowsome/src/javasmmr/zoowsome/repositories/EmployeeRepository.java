package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.Constants;

import javasmmr.zoowsome.models.employees.*;

import javasmmr.zoowsome.services.factories.CaretakerFactory;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;



import org.w3c.dom.Element;

public class EmployeeRepository extends EntityRepository<Employee> {
	private static final String XML_FILENAME = "Employees.xml";

	public EmployeeRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}

	protected Employee getEntityFromXmlElement(Element element) throws Exception {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Employees.Employee.Caretaker:
			EmployeeAbstractFactory caretakers = new CaretakerFactory();
			Employee caretaker = (Caretaker) caretakers.getEmployee(Constants.Employees.Employee.Caretaker);
			caretaker.decodeFromXml(element);
			return caretaker;
		default:
			break;
		}
		return null;
	}

}
