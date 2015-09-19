package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cow extends Mammal {
	private static long counter;
	private final long id = counter++;

	public Cow() {
		super(2, 0.1);
		setName("Cow" + id);
		setNrOfLegs(4);
		setNormalBodyTemp(38.5f);
		setPercBodyHair(1);
	}

	public Cow(String name) {
		super(2, 0.1);
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(38.5f);
		setPercBodyHair(1);
	}

	public Cow(int legs, float bodyTemp, float bodyHair) {
		super(2, 0.1);
		setName("Cow" + id);
		setNrOfLegs(legs);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Cow);
	}
}
