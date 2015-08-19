package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Dolphin extends Aquatic {

	public Dolphin(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName("Flipper");
		setAvgSwimDepth(90);
		setIsDangerous(false);
	}

	public Dolphin(String name, int swimDepth, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setIsDangerous(false);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Dolphin);
	}
}
