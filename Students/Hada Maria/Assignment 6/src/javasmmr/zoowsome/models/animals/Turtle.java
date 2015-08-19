package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Turtle extends Reptile {

	public Turtle(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(4);
		setName("Forrest G");
		setLaysEggs(true);
	}

	public Turtle(String name, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Turtle);
	}
}
