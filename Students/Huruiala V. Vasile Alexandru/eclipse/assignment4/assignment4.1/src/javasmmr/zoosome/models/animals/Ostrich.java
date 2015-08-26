package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoosome.services.factories.Constants;

public class Ostrich extends Bird {
	private static final String DEFAULT_NAME = "Eric";
	private static final int DEFAULT_NUMBER_OF_LEGS = 2;
	private static final double DEFAULT_MAINTENANCE_COST = 1.5D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.06D;
	private static final boolean DEFAULT_MIGRATES = false;
	private static final int DEFAULT_AVERAGE_FLIGHT_ALTITUDE = 0;
	
	public Ostrich() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_MIGRATES, DEFAULT_AVERAGE_FLIGHT_ALTITUDE);
	}
	
	public Ostrich(final String animalName, final int numberOfLegs, final double maintenanceCosts, final double dangerPercentage, final boolean doesMigrate, final int flightAlt) {
		super(animalName, numberOfLegs, maintenanceCosts, dangerPercentage, doesMigrate, flightAlt);
	}
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, String.valueOf(Constants.Animals.Bird.OSTRICH));
	}
}
