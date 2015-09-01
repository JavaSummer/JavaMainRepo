package javasmmr.zoowsome.repositories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.animalfactories.Constants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.soap.Node;


import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLEventWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;

import javasmmr.zoowsome.services.employeefactory.*;

public class EmployeeRepository extends EntityRepository<Employee>{

	private static final String XML_FILENAME = "Employee.xml";
	
	public EmployeeRepository(){
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}
	
	public ArrayList<Employee> load() throws ParserConfigurationException, SAXException, IOException{
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = (Document) dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.EMPLOYEE);
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = (Node) nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				switch (discriminant) {
				case Constants.Employee.Caretaker:
					Employee caretaker = new Caretaker();
					caretaker.decodeFromXml(element);
					employees.add(caretaker);
				default:
					break;
				}
			}
	}
		return employees;
	}
	@Override
	protected Employee getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Employee.Caretaker:
			Employee caretaker = new Caretaker();
			caretaker.decodeFromXml(element);
			return caretaker;
		default:
			break;
		}
		return null;
	}
}

