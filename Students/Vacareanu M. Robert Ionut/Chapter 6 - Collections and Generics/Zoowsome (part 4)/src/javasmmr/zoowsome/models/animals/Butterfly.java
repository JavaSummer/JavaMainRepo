package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Butterfly extends Insect {
	private static long counter;
	private final long id = counter++;

	public Butterfly() {
		super(0.1, 0);
		setName("Butterfly" + id);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public Butterfly(String name) {
		super(0.1, 0);
		setName(name);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public Butterfly(int legs, Boolean fly, Boolean dangerous) {
		super(0.1, 0);
		setName("Butterfly" + id);
		setNrOfLegs(legs);
		setCanFly(fly);
		setIsDangerous(dangerous);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Butterfly);
	}

}
