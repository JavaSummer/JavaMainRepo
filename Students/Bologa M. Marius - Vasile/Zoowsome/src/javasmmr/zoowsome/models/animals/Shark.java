package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.WaterType.TypeOfWater;
import javasmmr.zoowsome.services.factories.animal.Constants;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Shark extends Aquatic {
	/**
	 * 
	 */
	private String nameS = "Apex Predator";
	/**
	* 
	*/
	private int swimDepth = 2000;

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Shark(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgSwimDepth(swimDepth);
		setName(nameS);
		setNrOfLegs(0);
		setWater(TypeOfWater.saltwater);
	}

	/**
	 * 
	 * @param name
	 *            The name of the shark.
	 * @param depth
	 *            Average swiming depth.
	 * @param typeW
	 *            Type of the water.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Shark(final String name, final int depth, final TypeOfWater typeW, final double maintenanceCost,
			final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgSwimDepth(depth);
		setName(name);
		setNrOfLegs(0);
		setWater(typeW);
	}
	/**
	 * @return Predisposition to kill.
	 * 
	 */
		public double getPredisposition() {	
			Calendar calendar = new GregorianCalendar();
		int am = calendar.get(Calendar.AM);
		int pm = calendar.get(Calendar.PM);
		if ((am > 5) && (am < 9) && ((pm > 6) && (pm < 10))) {
			return 0.5232;
		} // Time they are most active.
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
			Constants.Animals.Aquatic.Shark);
			}
}
