package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Monkey extends Mammal {
	public Monkey(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(39.5f);
		setPercBodyHair(90 / 100f);
	}

	public Monkey(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("MonkeyX");
		setNrOfLegs(4);
		setNormalBodyTemp(39.5f);
		setPercBodyHair(90 / 100f);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Mammal.Monkey);
	}
}
