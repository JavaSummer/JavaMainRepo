package javasmmr.zoowsome.models.interfaces;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

/**
 * 
 * @author Marius Bologa
 */
public interface XML_Parsable {
	/**
	 * 
	 * @param eventWriter
	 *            .
	 * @throws XMLStreamException
	 *             .
	 */
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException;

	/**
	 * 
	 * @param element
	 *            The element to decode.
	 */
	public void decodeFromXml(Element element);
}