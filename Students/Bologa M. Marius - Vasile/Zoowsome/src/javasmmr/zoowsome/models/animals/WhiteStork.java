package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animal.Constants;

/**
 * 
 * @author Marius Bologa
 *
 */
public class WhiteStork extends Bird {
	/**
	 * 
	 */
	private int legs = 2;
	/**
	 * 
	 */
	private String nameW = "Ciconia";

	/**
	 * 
	 */
	private int flightAltitude = 1500;

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public WhiteStork(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setMigrates(true);
		setAvgFlightAltitude(flightAltitude);
		setName(nameW);
		setNrOfLegs(legs);

	}

	/**
	 * 
	 * @param name
	 *            Name of the white stork.
	 * @param altitude
	 *            Average flight altitude.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public WhiteStork(final String name, final int altitude, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setMigrates(true);
		setAvgFlightAltitude(altitude);
		setName(name);
		setNrOfLegs(legs);
	}

	/**
	 * @param eventWriter
	 *            To encode to XML.
	 * @throws XMLStreamException
	 *             .
	 */
	public void encodeToXml(final XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.WhiteStork);
	}
}
