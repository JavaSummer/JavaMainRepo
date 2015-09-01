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
public abstract class Insect extends Animal {
	/**
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * @param maintenanceCost
	 *            The maintenance cost.
	 */
	public Insect(double dangerPerc, double maintenanceCost) {
		super(dangerPerc, maintenanceCost);
	}

	/**
	 * 
	 */
	private boolean canFly;
	/**
	 * 
	 */
	private boolean isDangerous;

	/**
	 * 
	 * @return If the insect can fly.
	 */
	public final boolean isCanFly() {
		return canFly;
	}

	/**
	 * 
	 * @param canFly
	 *            If the insect can fly.
	 */
	public final void setCanFly(final boolean canFly) {
		this.canFly = canFly;
	}

	/**
	 * 
	 * @return If it is dangerous.
	 */
	public final boolean isDangerous() {
		return isDangerous;
	}

	/**
	 * 
	 * @param isDangerous
	 *            If it is dangerous.
	 */
	public final void setDangerous(final boolean isDangerous) {
		this.isDangerous = isDangerous;
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
		createNode(eventWriter, "canFly", String.valueOf(this.canFly));
		createNode(eventWriter, "isDangerous", String.valueOf(this.isDangerous));
	}

	/**
	 * @param element
	 *            Element to decode.
	 */
	public void decodeFromXml(final Element element) {
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
