package javasmmr.zoowsome.repositories;

import java.io.*;
import java.util.ArrayList;

import javax.xml.parsers.*;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.stream.XMLEventFactory;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.animals.Constants;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
	}

	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		// Create XMLEventWriter
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		// Create a EventFactory
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

	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

		for (int i = 0; i < nodeList.getLength(); i++) {
			org.w3c.dom.Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();
				switch (discriminant) {
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly = new Butterfly(0.3, 0.0);
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				case Constants.Animals.Insects.Cockroach:
					Animal cockroach = new Cockroach(0.1, 0.2);
					cockroach.decodeFromXml(element);
					animals.add(cockroach);
					break;
				case Constants.Animals.Insects.Spider:
					Animal spider = new Spider(0.1, 0.9);
					spider.decodeFromXml(element);
					animals.add(spider);
					break;
				case Constants.Animals.Aquatics.Shark:
					Animal shark = new Shark(0.2, 0.87);
					shark.decodeFromXml(element);
					animals.add(shark);
					break;
				case Constants.Animals.Aquatics.Trout:
					Animal trout = new Trout(0.4, 0.1);
					trout.decodeFromXml(element);
					animals.add(trout);
					break;
				case Constants.Animals.Aquatics.Catfish:
					Animal catfish = new Catfish(1, 0.1);
					catfish.decodeFromXml(element);
					animals.add(catfish);
					break;
				case Constants.Animals.Birds.Woodpecker:
					Animal woodpecker = new Woodpecker(0.4, 0.1);
					woodpecker.decodeFromXml(element);
					animals.add(woodpecker);
					break;
				case Constants.Animals.Birds.Owl:
					Animal owl = new Owl(1.2, 0.3);
					owl.decodeFromXml(element);
					animals.add(owl);
					break;
				case Constants.Animals.Birds.Ostrich:
					Animal ostrich = new Ostrich(3, 0.4);
					ostrich.decodeFromXml(element);
					animals.add(ostrich);
					break;
				case Constants.Animals.Reptiles.Turtle:
					Animal turtle = new Turtle(0.9, 0.2);
					turtle.decodeFromXml(element);
					animals.add(turtle);
					break;
				case Constants.Animals.Reptiles.Crocodile:
					Animal crocodile = new Crocodile(1.9, .86);
					crocodile.decodeFromXml(element);
					animals.add(crocodile);
					break;
				case Constants.Animals.Reptiles.Snake:
					Animal snake = new Snake(0.1, 0.9);
					snake.decodeFromXml(element);
					animals.add(snake);
					break;
				case Constants.Animals.Mammals.Cow:
					Animal cow = new Cow(5, 0.5);
					cow.decodeFromXml(element);
					animals.add(cow);
					break;
				case Constants.Animals.Mammals.Tiger:
					Animal tiger = new Tiger(3, 0.93);
					tiger.decodeFromXml(element);
					animals.add(tiger);
					break;
				case Constants.Animals.Mammals.Monkey:
					Animal monkey = new Monkey(3, 0.32);
					monkey.decodeFromXml(element);
					animals.add(monkey);
					break;

				default:
					break;
				}
			}
		}
		return animals;
	}
}