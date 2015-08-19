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
public abstract class Bird extends Animal {
	/**
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * @param maintenanceCost
	 *            The maintenance cost.
	 */
	public Bird(double dangerPerc, double maintenanceCost) {
		super(dangerPerc, maintenanceCost);
	}

	/**
	 * 
	 */
	private boolean migrates;
	/**
	 * 
	 */
	private int avgFlightAltitude;

	/**
	 * 
	 * @return If the bird migrate or not.
	 */
	public final boolean isMigrates() {
		return migrates;
	}

	/**
	 * 
	 * @param migrates
	 *            If the bird migrate or not.
	 */
	public final void setMigrates(final boolean migrates) {
		this.migrates = migrates;
	}

	/**
	 * 
	 * @return Average flight altitude
	 */
	public final int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	/**
	 * 
	 * @param avgFlightAltitude
	 *            Average flight altitude
	 */
	public final void setAvgFlightAltitude(final int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	/**
	 * 
	 * @param eventWriter Animal to encode  to XML.
	 * @throws XMLStreamException .
	 */
	public void encodeToXml(final XMLEventWriter eventWriter) 
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", 
				String.valueOf(this.migrates));
		createNode(eventWriter, "avgFlightAltitude", 
				String.valueOf(this.avgFlightAltitude));
	}
	/**
	 * @param element Element to decode.
	 */
	public void decodeFromXml(final Element element) {
		setMigrates(Boolean.valueOf(element.
				getElementsByTagName("migrates").
				item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.
				getElementsByTagName("avgFlightAltitude").item(0).
				getTextContent()));
	}
}
