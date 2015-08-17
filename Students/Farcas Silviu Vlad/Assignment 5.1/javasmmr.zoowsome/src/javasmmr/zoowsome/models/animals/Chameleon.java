package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Chameleon extends Reptile {
	public Chameleon(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("ChameleonX");
		setNrOfLegs(4);
		setLaysEggs(true);
	}

	public Chameleon(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(4);
		setLaysEggs(true);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Reptile.Chameleon);
	}
}
