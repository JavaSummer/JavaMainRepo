package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animal.Constants;

public class Monkey extends Mammal {

	public Monkey(double cost, double danger) {
		super(cost, danger);
		setNormalBodyTemperature(39);
		setPercBodyHair(95);
		setNrOfLegs(2);
		setName("Chewy");
	}

	public Monkey(String name, double cost, double danger) {
		super(cost, danger);
		setNormalBodyTemperature(39);
		setPercBodyHair(95);
		setNrOfLegs(2);
		setName(name);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Monkey);
	}
}
