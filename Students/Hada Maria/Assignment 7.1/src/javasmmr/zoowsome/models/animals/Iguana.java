package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Iguana extends Reptile {

	public Iguana(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(4);
		setName("Stan");
		setLaysEggs(true);
	}

	public Iguana(String name, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Iguana);
	}
}
