package javasmmr.zoowsome.repositories;

import java.io.*;
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

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.animal.Constants;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {

	}

	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();

		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));

		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");

		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);

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
			org.w3c.dom.Node node =nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();

				switch (discriminant) {
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly = new Butterfly(2.0, 0.0);
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				case Constants.Animals.Insects.Bee:
					Animal bee = new Bee(3.0, 0.6);
					bee.decodeFromXml(element);
					animals.add(bee);
					break;
				case Constants.Animals.Insects.Beetle:
					Animal beetle = new Beetle(2.0, 0.0);
					beetle.decodeFromXml(element);
					animals.add(beetle);
					break;
				case Constants.Animals.Aquatics.Dolphin:
					Animal dolphin = new Dolphin(6.0, 0.25);
					dolphin.decodeFromXml(element);
					animals.add(dolphin);
					break;
				case Constants.Animals.Aquatics.Jellyfish:
					Animal jellyfish = new Jellyfish(3.0, 1.0);
					jellyfish.decodeFromXml(element);
					animals.add(jellyfish);
					break;
				case Constants.Animals.Aquatics.Swordfish:
					Animal swordfish = new Swordfish(4.0, 0.75);
					swordfish.decodeFromXml(element);
					animals.add(swordfish);
					break;
				case Constants.Animals.Birds.Flamingo:
					Animal flamingo = new Flamingo(4.0, 0.1);
					flamingo.decodeFromXml(element);
					animals.add(flamingo);
					break;
				case Constants.Animals.Birds.Hummingbird:
					Animal hummingbird = new Hummingbird(4.0, 0.0);
					hummingbird.decodeFromXml(element);
					animals.add(hummingbird);
					break;
				case Constants.Animals.Birds.Owl:
					Animal owl = new Owl(4.0, 0.0);
					owl.decodeFromXml(element);
					animals.add(owl);
					break;
				case Constants.Animals.Mammals.Cow:
					Animal cow = new Cow(5.0, 0.0);
					cow.decodeFromXml(element);
					animals.add(cow);
					break;
				case Constants.Animals.Mammals.Monkey:
					Animal monkey = new Monkey(6.0, 0.2);
					monkey.decodeFromXml(element);
					animals.add(monkey);
					break;
				case Constants.Animals.Mammals.Tiger:
					Animal tiger = new Tiger(7.0, 0.85);
					tiger.decodeFromXml(element);
					animals.add(tiger);
					break;
				case Constants.Animals.Reptiles.Iguana:
					Animal iguana = new Iguana(3.0, 0.1);
					iguana.decodeFromXml(element);
					animals.add(iguana);
					break;
				case Constants.Animals.Reptiles.Turtle:
					Animal turtle = new Turtle(5.0, 0.0);
					turtle.decodeFromXml(element);
					animals.add(turtle);
					break;
				case Constants.Animals.Reptiles.Viper:
					Animal viper = new Viper(3.0, 1.0);
					viper.decodeFromXml(element);
					animals.add(viper);
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
