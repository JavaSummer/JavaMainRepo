package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Stork extends Bird {
	public Stork(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("StorkX");
		setNrOfLegs(2);
		setMigrates(true);
		setAvgFlightAltitude(35);
	}

	public Stork(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(2);
		setMigrates(true);
		setAvgFlightAltitude(35);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Bird.Stork);
	}
}
