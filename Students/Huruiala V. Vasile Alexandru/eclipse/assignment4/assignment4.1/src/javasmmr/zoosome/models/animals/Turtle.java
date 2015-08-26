package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.AnimalRepository.createNode;

import java.time.LocalDateTime;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoosome.services.factories.Constants;

public class Turtle extends Reptile {
	private static final String DEFAULT_NAME = "Red-eared slider turtle";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final double DEFAULT_MAINTENANCE_COST = 0.5D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.0D;
	private static final boolean DEFAULT_LAYS_EGGS = true;
	
	public Turtle() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_LAYS_EGGS);
	}
	
	public Turtle(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final boolean hasEggs) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, hasEggs);
	}
	
	@Override
	public double getPredisposition() {
		LocalDateTime dt = LocalDateTime.now();
		if (dt.getDayOfMonth() % 2 == 0) {
			return 0.75;
		}
		return 0.0;
	}
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, String.valueOf(Constants.Animals.Reptile.TURTLE));
	}
}
