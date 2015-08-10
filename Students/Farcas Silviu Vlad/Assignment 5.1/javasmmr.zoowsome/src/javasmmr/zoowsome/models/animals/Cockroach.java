package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cockroach extends Insect {
	public Cockroach(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("CockroachX");
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public Cockroach(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Insect.Cockroach);
	}
}
