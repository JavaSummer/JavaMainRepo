package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.AnimalRepository.createNode;

import java.time.LocalDateTime;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoosome.services.factories.Constants;

public class Scorpion extends Insect {
	private static final String DEFAULT_NAME = "Deathstalker";
	private static final int DEFAULT_NUMBER_OF_LEGS = 8;
	private static final double DEFAULT_MAINTENANCE_COST = 0.2D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.22D;
	private static final boolean DEFALULT_CAN_FLY = false;
	private static final boolean DEFAULT_IS_DANGEROUS = true;
	
	public Scorpion() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFALULT_CAN_FLY, DEFAULT_IS_DANGEROUS);
	}
	
	public Scorpion(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final boolean flyer, final boolean dangerous) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, flyer, dangerous);
	}
	
	@Override
	public double getPredisposition() {
		LocalDateTime dt = LocalDateTime.now();
		if (dt.getHour() >= 19 && dt.getHour() <= 6) {
			return 0.2;
		}
		return 0.0;
	}
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, String.valueOf(Constants.Animals.Insect.SCORPION));
	}
}
