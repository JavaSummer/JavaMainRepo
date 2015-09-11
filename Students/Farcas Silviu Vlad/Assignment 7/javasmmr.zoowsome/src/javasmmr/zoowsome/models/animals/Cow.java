package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cow extends Mammal {
	public Cow(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("CowX");
		setNrOfLegs(4);
		setNormalBodyTemp(38.5f);
		setPercBodyHair(92 / 100f);
	}

	public Cow(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(38.5f);
		setPercBodyHair(92 / 100f);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Mammal.Cow);
	}
}
