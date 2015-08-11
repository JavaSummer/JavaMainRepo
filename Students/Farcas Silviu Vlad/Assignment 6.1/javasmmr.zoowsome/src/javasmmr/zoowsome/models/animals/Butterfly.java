package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.Constants;

public class Butterfly extends Insect {
	public Butterfly(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("ButterfllyX");
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public Butterfly(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Insect.Butterfly);
	}
}
