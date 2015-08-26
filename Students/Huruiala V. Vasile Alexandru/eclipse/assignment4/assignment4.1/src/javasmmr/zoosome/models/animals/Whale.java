package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoosome.services.factories.Constants;

public class Whale extends Mammal {
	private static final String DEFAULT_NAME = "Blue whale";
	private static final int DEFAULT_NUMBER_OF_LEGS = 2;
	private static final double DEFAULT_MAINTENANCE_COST = 6.0D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.17D;
	private static final double DEFAULT_BODY_TEMPERATURE = 18.2D;
	private static final double DEFAULT_PERCENTAGE_BODY_HAIR = 0.0D;
	
	public Whale() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_BODY_TEMPERATURE, DEFAULT_PERCENTAGE_BODY_HAIR);
	}
	
	public Whale(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final double normalTemp, final double muchHair) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, normalTemp, muchHair);
	}
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, String.valueOf(Constants.Animals.Mammal.WHALE));
	}
}
