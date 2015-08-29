package javasmmr.zoowsome.repositories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.animalfactories.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

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
import javasmmr.zoowsome.services.animalfactories.*;

public class AnimalRepository extends EntityRepository<Animal>{
	private static final String XML_FILENAME = "Animals.xml";	
	
	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}
	
	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Insect.Butterfly:
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animals.Insect.Cockroach:
			Animal cockroach = new Cockroach();
			cockroach.decodeFromXml(element);
			return cockroach;
		case Constants.Animals.Insect.Spider:
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;
		case Constants.Animals.Mammal.Cow:
			Animal cow = new Cow();
			cow.decodeFromXml(element);
			return cow;
		case Constants.Animals.Mammal.Monkey:
			Animal monkey = new Monkey();
			monkey.decodeFromXml(element);
			return monkey;
		case Constants.Animals.Mammal.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;
		case Constants.Animals.Aquatic.Crab:
			Animal crab = new Crab();
			crab.decodeFromXml(element);
			return crab;
		case Constants.Animals.Aquatic.Dolphin:
			Animal dolphin = new Dolphin();
			dolphin.decodeFromXml(element);
			return dolphin;
		case Constants.Animals.Aquatic.Whale:
			Animal whale = new Whale();
			whale.decodeFromXml(element);
			return whale;
		case Constants.Animals.Bird.Duck:
			Animal duck = new Duck();
			duck.decodeFromXml(element);
			return duck;
		case Constants.Animals.Bird.Goose:
			Animal goose = new Goose();
			goose.decodeFromXml(element);
			return goose;
		case Constants.Animals.Bird.Pigeon:
			Animal pigeon = new Pigeon();
			pigeon.decodeFromXml(element);
			return pigeon;
		case Constants.Animals.Reptile.Boa:
			Animal boa = new Boa();
			boa.decodeFromXml(element);
			return boa;
		case Constants.Animals.Reptile.Iguana:
			Animal iguana = new Iguana();
			iguana.decodeFromXml(element);
			return iguana;
		case Constants.Animals.Reptile.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
		default:
			break;
	}
	return null;
	}
	
}