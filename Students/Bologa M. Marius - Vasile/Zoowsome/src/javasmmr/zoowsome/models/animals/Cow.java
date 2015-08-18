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
public class Cow extends Mammal {
	/**
	 * 
	 */
	private float temperature = 38.6f;
	/**
	 * 
	 */
	private int legs = 4;
	/**
	 * 
	 */
	private String nameC = "Joiana";
	/**
	 * 
	 */
	private float percentage = 98.2f;

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Cow(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(nameC);
		setPercBodyHair(percentage);
	}

	/**
	 * 
	 * @param name
	 *            The name of the Cow.
	 * @param perc
	 *            % of body covered in hair
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Cow(final String name, final float perc, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(name);
		setPercBodyHair(perc);
	}
	/**
	 * @param eventWriter To encode to XML.
	 * @throws XMLStreamException .
	 */
	public void encodeToXml(final XMLEventWriter eventWriter) 
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Mammals.Cow);
		}

}
