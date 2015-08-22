package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class SeaTurtle extends Aquatic {

	public SeaTurtle() {
		super(7.5, 0.5);
		setNrOfLegs(4);
		setName("SeaNigel");
		setAvgSwimDepth(20);
		setWt(waterType.FRESHWATER);
	}

	public SeaTurtle(String name, int swimDepth, waterType waterType, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(4);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setWt(waterType);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.SeaTurtle);
	}
}
