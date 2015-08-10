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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

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
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();
				switch (discriminant) {
				case Constants.Animal.Bird.Chicken:
					Animal chicken = new Chicken(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					chicken.decodeFromXml(element);
					animals.add(chicken);
					break;
				case Constants.Animal.Bird.Stork:
					Animal stork = new Stork(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					stork.decodeFromXml(element);
					animals.add(stork);
					break;
				case Constants.Animal.Bird.Swallow:
					Animal swallow = new Swallow(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					swallow.decodeFromXml(element);
					animals.add(swallow);
					break;
				case Constants.Animal.Aquatic.Dolphin:
					Animal dolphin = new Dolphin(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					dolphin.decodeFromXml(element);
					animals.add(dolphin);
					break;
				case Constants.Animal.Aquatic.Frog:
					Animal frog = new Frog(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					frog.decodeFromXml(element);
					animals.add(frog);
					break;
				case Constants.Animal.Aquatic.Orca:
					Animal orca = new Orca(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					orca.decodeFromXml(element);
					animals.add(orca);
					break;
				case Constants.Animal.Insect.Butterfly:
					Animal butterfly = new Butterfly(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				case Constants.Animal.Insect.Cockroach:
					Animal cockroach = new Cockroach(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					cockroach.decodeFromXml(element);
					animals.add(cockroach);
					break;
				case Constants.Animal.Insect.Spider:
					Animal spider = new Spider(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					spider.decodeFromXml(element);
					animals.add(spider);
					break;
				case Constants.Animal.Mammal.Cow:
					Animal cow = new Cow(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					cow.decodeFromXml(element);
					animals.add(cow);
					break;
				case Constants.Animal.Mammal.Monkey:
					Animal monkey = new Monkey(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					monkey.decodeFromXml(element);
					animals.add(monkey);
					break;
				case Constants.Animal.Mammal.Tiger:
					Animal tiger = new Tiger(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					tiger.decodeFromXml(element);
					animals.add(tiger);
					break;
				case Constants.Animal.Reptile.Chameleon:
					Animal chameleon = new Chameleon(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					chameleon.decodeFromXml(element);
					animals.add(chameleon);
					break;
				case Constants.Animal.Reptile.Cobra:
					Animal cobra = new Cobra(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					cobra.decodeFromXml(element);
					animals.add(cobra);
					break;
				case Constants.Animal.Reptile.Crocodile:
					Animal crocodile = new Crocodile(
							Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
							Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
					crocodile.decodeFromXml(element);
					animals.add(crocodile);
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
