package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Swallow extends Bird {
	public Swallow(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("SwallowX");
		setNrOfLegs(2);
		setMigrates(true);
		setAvgFlightAltitude(40);

	}

	public Swallow(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(2);
		setMigrates(true);
		setAvgFlightAltitude(40);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Bird.Swallow);
	}
}
