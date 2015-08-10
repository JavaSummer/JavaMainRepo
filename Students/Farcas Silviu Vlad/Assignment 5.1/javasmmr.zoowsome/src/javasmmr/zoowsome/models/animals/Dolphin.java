package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.WaterType.water;
import javasmmr.zoowsome.services.factories.Constants;

public class Dolphin extends Aquatic {
	public Dolphin(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("DolphinX");
		setNrOfLegs(0);
		setAvgSwimDepth(25);
		setWaterType(water.SALTWATER);
	}

	public Dolphin(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(25);
		setWaterType(water.SALTWATER);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Aquatic.Dolphin);
	}

}
