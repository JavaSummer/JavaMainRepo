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
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();
				switch (discriminant) {
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly = new Butterfly(4.0, 0.0);
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				case Constants.Animals.Insects.Cockroach:
					Animal cockroach = new Cockroach(0.2, 0.43);
					cockroach.decodeFromXml(element);
					animals.add(cockroach);
					break;
				case Constants.Animals.Insects.Spider:
					Animal spider = new Spider(1.9, 0.65);
					spider.decodeFromXml(element);
					animals.add(spider);
					break;
				case Constants.Animals.Mammals.Tiger:
					Animal tiger = new Tiger(4.5, 0.957);
					tiger.decodeFromXml(element);
					animals.add(tiger);
					break;
				case Constants.Animals.Mammals.Cow:
					Animal cow = new Cow(5.6, 0.32);
					cow.decodeFromXml(element);
					animals.add(cow);
					break;
				case Constants.Animals.Mammals.Monkey:
					Animal monkey = new Monkey(2.9, 0.174);
					monkey.decodeFromXml(element);
					animals.add(monkey);
					break;
				case Constants.Animals.Aquatic.NorthernPike:
					Animal northernPike = new NorthernPike(2.3, 0.15);
					northernPike.decodeFromXml(element);
					animals.add(northernPike);
					break;
				case Constants.Animals.Aquatic.Shark:
					Animal shark = new Shark(7.1, 0.97);
					shark.decodeFromXml(element);
					animals.add(shark);
					break;
				case Constants.Animals.Aquatic.Tuna:
					Animal tuna = new Tuna(4.3, 0.10);
					tuna.decodeFromXml(element);
					animals.add(tuna);
					break;
				case Constants.Animals.Birds.Eagle:
					Animal eagle = new Eagle(2.3, 0.42);
					eagle.decodeFromXml(element);
					animals.add(eagle);
					break;
				case Constants.Animals.Birds.Pelican:
					Animal pelican = new Pelican(2.3, 0.103);
					pelican.decodeFromXml(element);
					animals.add(pelican);
					break;
				case Constants.Animals.Birds.WhiteStork:
					Animal whiteStork = new WhiteStork(4.0, 0.205);
					whiteStork.decodeFromXml(element);
					animals.add(whiteStork);
					break;
				case Constants.Animals.Reptiles.Tuatara:
					Animal tuatara = new Tuatara(3.8, 0.22);
					tuatara.decodeFromXml(element);
					animals.add(tuatara);
					break;
				case Constants.Animals.Reptiles.Turtle:
					Animal turtle = new Turtle(5.2, 0.02);
					turtle.decodeFromXml(element);
					animals.add(turtle);
					break;
				case Constants.Animals.Reptiles.Boomslang:
					Animal boomslang = new Boomslang(6.4, 0.999);
					boomslang.decodeFromXml(element);
					animals.add(boomslang);
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