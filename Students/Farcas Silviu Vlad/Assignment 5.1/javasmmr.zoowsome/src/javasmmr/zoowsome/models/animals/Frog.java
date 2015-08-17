package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.WaterType.water;
import javasmmr.zoowsome.services.factories.Constants;

public class Frog extends Aquatic {
	public Frog(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("FrogX");
		setNrOfLegs(4);
		setAvgSwimDepth(1);
		setWaterType(water.FRESHWATER);
	}

	public Frog(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(4);
		setAvgSwimDepth(1);
		setWaterType(water.FRESHWATER);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Aquatic.Frog);
	}
}
