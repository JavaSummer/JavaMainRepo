package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.List;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cow extends Mammal {
	private static long counter;
	private final long id = counter++;

	public Cow(float normalBodyTemp, float percBodyHair, int nrOfLegs, String name, double maintenanceCost,
			double dangerPerc, boolean takenCareOf) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, normalBodyTemp, percBodyHair);
	}

	// Keep the order from above;
	public Cow(List<String> attributes) {
		super(Integer.valueOf(attributes.get(2)), attributes.get(3), Double.valueOf(attributes.get(4)),
				Double.valueOf(attributes.get(5)), Boolean.valueOf(attributes.get(6)), Float.valueOf(attributes.get(0)),
				Float.valueOf(attributes.get(1)));
	}

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
