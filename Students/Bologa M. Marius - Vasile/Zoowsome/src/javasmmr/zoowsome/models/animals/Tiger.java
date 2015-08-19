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
public class Tiger extends Mammal {
	/**
	 * 
	 */
	private float temperature = 37.5f;
	/**
	 * 
	 */
	private int legs = 4;
	/**
	 * 
	 */
	private String nameT = "Cecil";
	/**
	 * 
	 */
	private float percentage = 92.8f;

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Tiger(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(nameT);
		setPercBodyHair(percentage);
	}

	/**
	 * 
	 * @param name
	 *            The name of the tiger.
	 * @param perc
	 *            % of body covered in hair.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Tiger(final String name, final float perc, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(name);
		setPercBodyHair(perc);
	}
	/**
	 * @return Predisposition to kill.
	 * 
	 */
	public double getPredisposition() {
		Calendar calendar = new GregorianCalendar();
		int month = calendar.get(Calendar.MONTH);
		int am = calendar.get(Calendar.HOUR);
		if ((month >= 6) && ((am > 20) && (am < 9))) {
			return 0.8;
		} // Time of the reproduction and time tigers are most active.
		return 0;

		}
	/**
		 * @param eventWriter To encode to XML.
		 * @throws XMLStreamException .
		 */
		public void encodeToXml(final XMLEventWriter eventWriter) 
				throws XMLStreamException {
			super.encodeToXml(eventWriter);
			createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
			Constants.Animals.Mammals.Tiger);
			}
		
}
