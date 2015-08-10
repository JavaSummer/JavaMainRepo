package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animal.Constants;

public class Swordfish extends Aquatic {

	public Swordfish(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName("Needle");
		setAvgSwimDepth(600);
		setIsDangerous(true);
	}

	public Swordfish(String name, boolean dangerous, int swimDepth, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setIsDangerous(dangerous);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Swordfish);
	}
}
