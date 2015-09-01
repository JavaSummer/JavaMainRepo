package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Reptile extends Animal {
	/**
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * @param maintenanceCost
	 *            The maintenance cost.
	 */
	public Reptile(double dangerPerc, double maintenanceCost) {
		super(dangerPerc, maintenanceCost);
	}

	/**
	 * 
	 */
	private boolean laysEggs;

	/**
	 * 
	 * @return If does it lay eggs or no
	 */
	public final boolean isLaysEggs() {
		return laysEggs;
	}

	/**
	 * 
	 * @param laysEggs
	 *            If does it lay eggs or no
	 */
	public final void setLaysEggs(final boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

	/**
	 * 
	 * @param eventWriter
	 *            Animal to encode to XML.
	 * @throws XMLStreamException
	 *             .
	 */
	public void encodeToXml(final XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(this.laysEggs));
	}

	/**
	 * @param element
	 *            Element to decode.
	 */
	public void decodeFromXml(final Element element) {
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}

}
