package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animal.Constants;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Spider extends Insect {
	/**
	 * 
	 */
	private int legs = 8;
	/**
	 * 
	 */
	private String nameS = "Regal Jumper";

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Spider(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setCanFly(false);
		setNrOfLegs(legs);
		setName(nameS);
		setDangerous(false);
	}

	/**
	 * 
	 * @param name
	 *            The name of the spider.
	 * @param bites
	 *            Is dangerous or not.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Spider(final String name, final boolean bites, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setCanFly(false);
		setNrOfLegs(legs);
		setName(name);
		setDangerous(bites);
	}

	/**
	 * @return Predisposition to kill.
	 * 
	 */
	public double getPredisposition() {
		Calendar calendar = new GregorianCalendar();
		int month = calendar.get(Calendar.MONTH);
		if ((month >= 3) && (month <= 9)) {
			return 0.24;
		} // Time of the reproduction.
		return 0;

	}

	/**
	 * @param eventWriter
	 *            To encode to XML.
	 * @throws XMLStreamException
	 *             .
	 */
	public void encodeToXml(final XMLEventWriter eventWriter) 
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.
				XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Spider);
	}
}
