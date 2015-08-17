package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.employees.CareTaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeRepository {
	// instance variables
		private static final String XML_FILENAME = "Employees.xml";

		// constructors
		public EmployeeRepository() {
			
		}

		// methods

		public void save(ArrayList<Employee> employees) throws FileNotFoundException, XMLStreamException {
			XMLOutputFactory outputFactory = XMLOutputFactory.newFactory();
			// Create XMLEventWriter
			XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
			// Create an EventFactory
			XMLEventFactory eventFactory = XMLEventFactory.newInstance();
			XMLEvent end = eventFactory.createDTD("\n");
			// Create and write Start Tag
			StartDocument startDocument = eventFactory.createStartDocument();
			eventWriter.add(startDocument);
			// Create content open tag
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
			org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);
			((org.w3c.dom.Document) doc).getDocumentElement().normalize();

			NodeList nodeList = ((org.w3c.dom.Document) doc).getElementsByTagName(Constants.XML_TAGS.EMPLOYEE);

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
							.getTextContent();
					switch (discriminant) {
					case Constants.TypeOfEmployees.CareTaker:
						Employee careTaker = new CareTaker();
						careTaker.decodeFromXml(element);
						employees.add(careTaker);
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

			// Create start node
			StartElement sElement = eventFactory.createStartElement("", "", name);
			eventWriter.add(tab);
			eventWriter.add(sElement);

			// Create content

			Characters characters = eventFactory.createCharacters(value);
			eventWriter.add(characters);

			// Create end node

			EndElement eElement = eventFactory.createEndElement("", "", name);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
	
}
