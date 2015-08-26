package javasmmr.zoosome.repositories;

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

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Ballista;
import javasmmr.zoosome.models.animals.Bass;
import javasmmr.zoosome.models.animals.Bear;
import javasmmr.zoosome.models.animals.Beetle;
import javasmmr.zoosome.models.animals.Clownfish;
import javasmmr.zoosome.models.animals.Crocodile;
import javasmmr.zoosome.models.animals.Dove;
import javasmmr.zoosome.models.animals.Dragon;
import javasmmr.zoosome.models.animals.Dragonfly;
import javasmmr.zoosome.models.animals.Eagle;
import javasmmr.zoosome.models.animals.Hummingbird;
import javasmmr.zoosome.models.animals.Kangaroo;
import javasmmr.zoosome.models.animals.Lionfish;
import javasmmr.zoosome.models.animals.Lizard;
import javasmmr.zoosome.models.animals.Mangonel;
import javasmmr.zoosome.models.animals.Mantis;
import javasmmr.zoosome.models.animals.Ostrich;
import javasmmr.zoosome.models.animals.Ram;
import javasmmr.zoosome.models.animals.Rhinoceros;
import javasmmr.zoosome.models.animals.Scorpion;
import javasmmr.zoosome.models.animals.Surgeonfish;
import javasmmr.zoosome.models.animals.Trebuchet;
import javasmmr.zoosome.models.animals.Turtle;
import javasmmr.zoosome.models.animals.Whale;
import javasmmr.zoosome.models.interfaces.XML_Parsable;
import javasmmr.zoosome.services.factories.Constants;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	
	public AnimalRepository() {
	}
	
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		// Create and write start tag
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
			
			animal.encodeToXML(eventWriter);
			
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
		
		File fXMLFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXMLFile);
		doc.getDocumentElement().normalize();
		
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				
				Animal a;
				switch (discriminant) {
				case Constants.Animals.Mammal.BEAR: 
					a = new Bear();
					a.decodeFromXML(element);
					animals.add(a);
					break;
					
				case Constants.Animals.Mammal.KANGAROO: 
					a = new Kangaroo();
					a.decodeFromXML(element);
					animals.add(a);
					break;	
					
				case Constants.Animals.Mammal.WHALE: 
					a = new Whale();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	
					
				case Constants.Animals.Mammal.RHINOCEROS: 
					a = new Rhinoceros();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	
					
				case Constants.Animals.Reptile.LIZARD: 
					a = new Lizard();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	
					
				case Constants.Animals.Reptile.TURTLE: 
					a = new Turtle();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	
					
				case Constants.Animals.Reptile.CROCODILE: 
					a = new Crocodile();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	
					
				case Constants.Animals.Reptile.DRAGON: 
					a = new Dragon();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	
					
				case Constants.Animals.Bird.DOVE: 
					a = new Dove();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Bird.OSTRICH: 
					a = new Ostrich();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Bird.EAGLE: 
					a = new Eagle();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Bird.HUMMINGBIRD: 
					a = new Hummingbird();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Aquatic.BASS: 
					a = new Bass();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Aquatic.CLOWNFISH: 
					a = new Clownfish();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Aquatic.SURGEONFISH: 
					a = new Surgeonfish();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Aquatic.LIONFISH: 
					a = new Lionfish();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Insect.BEETLE: 
					a = new Beetle();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Insect.SCORPION: 
					a = new Scorpion();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Insect.MANTIS: 
					a = new Mantis();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Insect.DRAGONFLY: 
					a = new Dragonfly();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Siege.RAM: 
					a = new Ram();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Siege.MANGONEL: 
					a = new Mangonel();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Siege.BALLISTA: 
					a = new Ballista();
					a.decodeFromXML(element);
					animals.add(a); 
					break;	

				case Constants.Animals.Siege.TREBUCHET: 
					a = new Trebuchet();
					a.decodeFromXML(element);
					animals.add(a); 
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
		// Create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// Create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}
