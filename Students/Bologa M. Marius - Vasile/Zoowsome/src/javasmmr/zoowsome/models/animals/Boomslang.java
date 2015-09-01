package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

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
public class Boomslang extends Reptile {
	/**
	 * 
	 */
	private int legs = 0;
	/**
	 * 
	 */
	private String nameS = "Kaa";

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Boomslang(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setLaysEggs(true);
		setName(nameS);
		setNrOfLegs(legs);
	}

	/**
	 * 
	 * @param name
	 *            The name of the snake.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Boomslang(final String name, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setLaysEggs(true);
		setName(name);
		setNrOfLegs(legs);
	}

	/**
	 * @return Predisposition to kill.
	 * 
	 */
	public double getPredisposition() {
		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		if ((month > 3) && (month < 5) && (year % 2 == 0)) {
			return 0.8;
		} // Time of the reproduction.
		return 0;

	}

	/**
	 * @param eventWriter
	 *            To encode to XML.
	 * @throws XMLStreamException
	 *             .
	 */
	public void encodeToXml(final XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Boomslang);
	}

}
