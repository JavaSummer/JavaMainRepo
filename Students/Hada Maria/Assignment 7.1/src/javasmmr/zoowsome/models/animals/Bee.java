package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Bee extends Insect {

	public Bee(double cost, double danger) {
		super(cost, danger);
		setCanFly(true);
		setIsDangerous(false);
		setNrOfLegs(6);
		setName("Beedrill");
	}

	public Bee(String name, boolean dangerous, double cost, double danger) {
		super(cost, danger);
		setCanFly(true);
		setIsDangerous(dangerous);
		setNrOfLegs(6);
		setName(name);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Bee);
	}

}
