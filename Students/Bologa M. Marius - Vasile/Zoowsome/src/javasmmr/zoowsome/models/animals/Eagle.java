package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animal.Constants;
/**
 * 
 * @author Marius Bologa
 *
 */
public class Eagle extends Bird {
	/**
	 * 
	 */
	private int legs = 2;
	/**
	 * 
	 */
	private String nameE = "Aquila";

	/**
	 * 
	 */
	private int flightAltitude = 2000;

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Eagle(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setMigrates(false);
		setAvgFlightAltitude(flightAltitude);
		setName(nameE);
		setNrOfLegs(legs);

	}

	/**
	 * 
	 * @param name
	 *            Name of the eagle.
	 * @param migrates
	 *            Migrates or not?
	 * @param altitude
	 *            Average flight altitude.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Eagle(final String name, final boolean migrates, final int altitude, final double maintenanceCost,
			final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setMigrates(migrates);
		setAvgFlightAltitude(altitude);
		setName(name);
		setNrOfLegs(legs);
	}
	/**
	 * @param eventWriter To encode to XML.
	 * @throws XMLStreamException .
	 */
	public void encodeToXml(final XMLEventWriter eventWriter) 
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Birds.Eagle);
		}
}
