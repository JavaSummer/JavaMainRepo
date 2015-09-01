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
public class Turtle extends Reptile {
	/**
	 * 
	 */
	private int legs = 4;
	/**
	 * 
	 */
	private String nameT = "Testudine";

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Turtle(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setLaysEggs(true);
		setName(nameT);
		setNrOfLegs(legs);
	}

	/**
	 * 
	 * @param name
	 *            The name of the turtle.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Turtle(final String name, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setLaysEggs(true);
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Turtle);
	}
}
