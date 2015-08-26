package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.AnimalRepository.createNode;

import java.time.LocalDateTime;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoosome.services.factories.Constants;

public class Trebuchet extends Siege {
	private static final String DEFAULT_NAME = "Counterweight trebuchet";
	private static final int DEFAULT_NUMBER_OF_LEGS = 0;
	private static final double DEFAULT_MAINTENANCE_COST = 6.5D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.35D;
	private static final int DEFAULT_RANGE = 300;
	private static final boolean DEFAULT_IS_MOBILE = false;
	
	public Trebuchet() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_RANGE, DEFAULT_IS_MOBILE);
	}
	
	public Trebuchet(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final int firingRange, final boolean mobile) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, firingRange, mobile);
	}
	
	@Override
	public double getPredisposition() {
		LocalDateTime dt = LocalDateTime.now();
		if (dt.getHour() >= 20 && dt.getHour() <= 5) {
			return 0.25;
		}
		return 0.0;
	}
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, String.valueOf(Constants.Animals.Siege.TREBUCHET));
	}
}
