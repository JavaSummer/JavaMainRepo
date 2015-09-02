package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Chicken extends Bird {
	public Chicken(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("ChickenX");
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(0);
	}

	public Chicken(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(0);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Bird.Chicken);
	}
}
