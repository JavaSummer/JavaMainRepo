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

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.animal.Constants;

/**
 * 
 * @author Marius Bologa
 *
 * @param <T>
 *            Any class which extends or implements XML_Parsable.
 */
public abstract class EntityRepository<T extends XML_Parsable> {
	/**
	 * 
	 */
	private final String xmlFilename;
	/**
	 * 
	 */
	private final String entityTag;

	/**
	 * 
	 * @param xmlFilename
	 *            XML file to create.
	 * @param entityTag
	 *            XML file for animal/employee.
	 */
	public EntityRepository(final String xmlFilename, final String entityTag) {
		this.xmlFilename = xmlFilename;
		this.entityTag = entityTag;
	}

	/**
	 * @param element
	 *            Classes-Animal/Employees.
	 * @return One class.Switching them.
	 */
	protected abstract T getEntityFromXmlElement(Element element);

	/**
	 * 
	 * @param entities
	 *            Animals or employees.
	 * @throws FileNotFoundException
	 *             .
	 * @throws XMLStreamException
	 *             .
	 */
	public void save(final ArrayList<T> entities) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(this.xmlFilename));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);

		for (XML_Parsable entity : entities) {
			StartElement sElement = eventFactory.createStartElement("", "", this.entityTag);
			eventWriter.add(sElement);
			eventWriter.add(end);
			entity.encodeToXml(eventWriter);

			EndElement eElement = eventFactory.createEndElement("", "", this.entityTag);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}

		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	/**
	 * 
	 * @return
	 * @throws ParserConfigurationException
	 *             .
	 * @throws SAXException
	 *             .
	 * @throws IOException
	 *             .
	 */
	public ArrayList<T> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<T> entities = new ArrayList<T>();

		File fXmlFile = new File(this.xmlFilename);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				entities.add(getEntityFromXmlElement(element));
			}

		}
		return entities;
	}

	/**
	 * 
	 * @param eventWriter
	 * @param name
	 *            The name.
	 * @param value
	 *            The value.
	 * @throws XMLStreamException
	 *             .
	 */
	public static void createNode(final XMLEventWriter eventWriter, final String name, final String value)
			throws XMLStreamException {
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