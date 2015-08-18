package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.WaterType.TypeOfWater;
import javasmmr.zoowsome.services.factories.animal.Constants;
/**
 * 
 * @author Marius Bologa
 *
 */
public class NorthernPike extends Aquatic {
	/**
	 * 
	 */
	private String nameP = "Esox";
	/**
	* 
	*/
	private int swimDepth = 20;

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public NorthernPike(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgSwimDepth(swimDepth);
		setName(nameP);
		setNrOfLegs(0);
		setWater(TypeOfWater.freshwater);
	}

	/**
	 * 
	 * @param name
	 *            The name of the pike.
	 * @param depth
	 *            Average swiming depth.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 *
	 */
	public NorthernPike(final String name, final int depth, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgSwimDepth(depth);
		setName(name);
		setNrOfLegs(0);
		setWater(TypeOfWater.freshwater);
	}
	/**
	 * @param eventWriter To encode to XML.
	 * @throws XMLStreamException .
	 */
	public void encodeToXml(final XMLEventWriter eventWriter) 
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Aquatic.NorthernPike);
		}
}
