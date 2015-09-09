package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.Constants;

import javasmmr.zoowsome.models.employees.*;

import javasmmr.zoowsome.services.factories.CaretakerFactory;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;

import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.events.Characters;

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

	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		// Create Start node
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		// Create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// Create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}
