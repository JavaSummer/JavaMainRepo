package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoosome.services.factories.Constants;

public class Bass extends Aquatic {
	private static final String DEFAULT_NAME = "Largemouth bass";
	private static final int DEFAULT_NUMBER_OF_LEGS = 0;
	private static final double DEFAULT_MAINTENANCE_COST = 0.2D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.0D;
	private static final int DEFAULT_AVERAGE_SWIMMING_DEPTH = 20;
	private static final WaterType DEFAULT_WATER_TYPE = WaterType.getWater(1);

	public Bass() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE,
				DEFAULT_AVERAGE_SWIMMING_DEPTH, DEFAULT_WATER_TYPE);
	}

	public Bass(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc,
			final int swimDepth, final WaterType wType) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, swimDepth, wType);
	}

	public Bass(String v1, String v2, String v3, String v4, String v5, String v6) {
		super(new String[] { v1, v2, v3, v4, v5, v6 });
	}

	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, String.valueOf(Constants.Animals.Aquatic.BASS));
	}
}
