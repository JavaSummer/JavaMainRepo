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

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository {

	// instance variables
	private static final String XML_FILENAME = "Animals.xml";

	// constructors
	public AnimalRepository() {

	}

	// methods

	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
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

		for (XML_Parsable animal : animals) {
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);

			animal.encodeToXml(eventWriter);

			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);

		}
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();

		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();
				switch (discriminant) {
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly = new Butterfly();
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				case Constants.Animals.Insects.Cockroach:
					Animal cockroach = new Cockroach();
					cockroach.decodeFromXml(element);
					animals.add(cockroach);
					break;
				case Constants.Animals.Insects.Spider:
					Animal spider = new Spider();
					spider.decodeFromXml(element);
					animals.add(spider);
					break;
				case Constants.Animals.Mammals.Cow:
					
					Animal cow = new Cow();
					cow.decodeFromXml(element);
					animals.add(cow);
					break;
					
				case Constants.Animals.Mammals.Monkey:
					Animal monkey = new Monkey();
					monkey.decodeFromXml(element);
					animals.add(monkey);
					break;
					
				case Constants.Animals.Mammals.Tiger:
					Animal tiger = new Tiger();
					tiger.decodeFromXml(element);
					animals.add(tiger);
					break;
				case Constants.Animals.Reptiles.Crocodile:
					Animal crocodile = new Crocodile();
					crocodile.decodeFromXml(element);
					animals.add(crocodile);
					break;
				case Constants.Animals.Reptiles.Lizard:
					Animal lizard= new Lizard();
					lizard.decodeFromXml(element);
					animals.add(lizard);
					break;
				case Constants.Animals.Reptiles.Turtle:
					Animal turtle = new Turtle();
					turtle.decodeFromXml(element);
					animals.add(turtle);
					break;
				case Constants.Animals.Aquatics.Dolphin:
					Animal dolphin = new Dolphin();
					dolphin.decodeFromXml(element);
					animals.add(dolphin);
					break;
				case Constants.Animals.Aquatics.Octopus:
				
					Animal octopus = new Octopus();
					octopus.decodeFromXml(element);
					animals.add(octopus);
					break;
				case Constants.Animals.Aquatics.Shark:
					Animal shark = new Shark();
					shark.decodeFromXml(element);
					animals.add(shark);
					break;
				case Constants.Animals.Birds.Eagle:
					Animal eagle = new Eagle();
					eagle.decodeFromXml(element);
					animals.add(eagle);
					break;
				case Constants.Animals.Birds.Parrot:
					Animal parrot = new Parrot();
					parrot.decodeFromXml(element);
					animals.add(parrot);
					break;
				case Constants.Animals.Birds.Pecker:
					Animal pecker = new Pecker();
					pecker.decodeFromXml(element);
					animals.add(pecker);
					break;
				default:
					break;
				}
			}
		}
		return animals;
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
