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
public class Pelican extends Bird {
	/**
	 * 
	 */
	private int legs = 2;
	/**
	 * 
	 */
	private String nameP = "Dalmatian Pelican";

	/**
	 * 
	 */
	private int flightAltitude = 1200;

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Pelican(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgFlightAltitude(flightAltitude);
		setMigrates(true);
		setName(nameP);
		setNrOfLegs(legs);
	}

	/**
	 * 
	 * @param name
	 *            Name of the pelican.
	 * @param altitude
	 *            Average flight altitude.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Pelican(final String name, final int altitude, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgFlightAltitude(altitude);
		setMigrates(true);
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Pelican);
	}
}
