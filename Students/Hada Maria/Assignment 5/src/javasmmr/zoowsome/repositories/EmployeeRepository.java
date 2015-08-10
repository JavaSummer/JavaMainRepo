package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeRepository {
	private static final String XML_FILENAME = "Employees.xml";

	public EmployeeRepository() {

	}

	public void save(ArrayList<Employee> employees) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();

		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));

		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");

		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);

		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);

		for (XML_Parsable employee : employees) {
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.EMPLOYEE);
			eventWriter.add(sElement);
			eventWriter.add(end);

			employee.encodeToXml(eventWriter);

			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.EMPLOYEE);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}

		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	public ArrayList<Employee> load() throws ParserConfigurationException, SAXException, IOException {

		ArrayList<Employee> employees = new ArrayList<Employee>();

		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.EMPLOYEE);

		for (int i = 0; i < nodeList.getLength(); i++) {
			org.w3c.dom.Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();

				switch (discriminant) {
				case Constants.Employees.Caretaker:
					String name = element.getElementsByTagName("name").item(0).getTextContent();
					BigDecimal salary = BigDecimal
							.valueOf(Double.valueOf(element.getElementsByTagName("salary").item(0).getTextContent()));
					long id = Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent());
					Employee caretaker = new Caretaker(name, id, salary);
					caretaker.decodeFromXml(element);
					employees.add(caretaker);
					break;
				default:
					break;
				}
			}
		}
		return employees;
	}

	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {

		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");

		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);

		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);

		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}
