package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Mammal extends Animal {
	/**
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * @param maintenanceCost
	 *            The maintenance cost.
	 */
	public Mammal(double dangerPerc, double maintenanceCost) {
		super(dangerPerc, maintenanceCost);
	}

	/**
	 * 
	 */
	private float normalBodyTemp;
	/**
	 * 
	 */
	private float percBodyHair;

	/**
	 * 
	 * @return Normal body temperature.
	 */
	public final float getNormalBodyTemp() {

		return normalBodyTemp;
	}

	/**
	 * 
	 * @param normalBodyTemp
	 *            Normal body temperature.
	 */
	public final void setNormalBodyTemp(final float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	/**
	 * 
	 * @return % of body covered in hair
	 */
	public final float getPercBodyHair() {
		return percBodyHair;
	}

	/**
	 * 
	 * @param percBodyHair
	 *            % of body covered in hair
	 */
	public final void setPercBodyHair(final float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}
	/**
	 * 
	 * @param eventWriter Animal to encode  to XML.
	 * @throws XMLStreamException .
	 */
	public void encodeToXml(final XMLEventWriter eventWriter) 
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp",
				String.valueOf(this.normalBodyTemp));
		createNode(eventWriter, "percBodyHair",
				String.valueOf(this.percBodyHair));
	}
	/**
	 * @param element Element to decode.
	 */
	public void decodeFromXml(final Element element) {
		setNormalBodyTemp(Float.valueOf(
				element.getElementsByTagName("normalBodyTemp").
				item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.
				getElementsByTagName("percBodyHair").
				item(0).getTextContent()));
	}
}