package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.WaterType.TypeOfWater;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Aquatic extends Animal {
	/**
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * @param maintenanceCost
	 *            The maintenance cost.
	 */
	public Aquatic(double dangerPerc, double maintenanceCost) {
		super(dangerPerc, maintenanceCost);
	}

	/**
	 * 
	 */
	private int avgSwimDepth;

	/**
	 * 
	 * @return Average swim depth.
	 */
	public final int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	/**
	 * 
	 * @param avgSwimDepth
	 *            Average swim depth.
	 */
	public final void setAvgSwimDepth(final int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	};
	/**
	 * 
	 */
	private TypeOfWater water;
	/**
	 * 
	 * @return Type of water.
	 */
	public final TypeOfWater getWater() {
		return water;
	}
/**
 * 
 * @param water Freshwater or saltwater.
 */
	public final void setWater(final TypeOfWater water) {
		this.water = water;
	}

	/**
	 * 
	 * @param eventWriter Animal to encode  to XML.
	 * @throws XMLStreamException .
	 */
		public void encodeToXml(final XMLEventWriter eventWriter) 
				throws XMLStreamException {
			super.encodeToXml(eventWriter);
		
			createNode(eventWriter, "avgSwimDepth",
					String.valueOf(this.avgSwimDepth));
			createNode(eventWriter, "water",
					String.valueOf(this.water));
		}
		/**
		 * @param element Element to decode.
		 */
		public void decodeFromXml(final Element element) { 
			super.decodeFromXml(element);
			setAvgSwimDepth(Integer.valueOf(
							element.getElementsByTagName("avgSwimDepth").
							item(0).getTextContent()));
			setWater(TypeOfWater.valueOf(element.getElementsByTagName("water").
					item(0).getTextContent()));
				}
		
}
