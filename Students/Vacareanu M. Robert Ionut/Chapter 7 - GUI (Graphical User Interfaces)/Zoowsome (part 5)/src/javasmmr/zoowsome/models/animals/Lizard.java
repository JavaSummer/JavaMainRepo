package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.List;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Lizard extends Reptile {
	private static long counter;
	private final long id = counter++;

	public Lizard(Boolean layEggs, int nrOfLegs, String name, double maintenanceCost, double dangerPerc,
			boolean takenCareOf) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, layEggs);
	}

	// Keep the order from above;
	public Lizard(List<String> attributes) {
		super(Integer.valueOf(attributes.get(1)), attributes.get(2), Double.valueOf(attributes.get(3)),
				Double.valueOf(attributes.get(4)), Boolean.valueOf(attributes.get(5)),
				Boolean.valueOf(attributes.get(0)));
	}

	public Lizard() {
		super(2, 0.2);
		setName("Lizard" + id);
		setNrOfLegs(4);
		setLayEggs(true);
	}

	public Lizard(String name) {
		super(2, 0.2);
		setName(name);
		setNrOfLegs(4);
		setLayEggs(true);
	}

	public Lizard(int legs, Boolean eggs) {
		super(2, 0.2);
		setName("Lizard" + id);
		setNrOfLegs(legs);
		setLayEggs(eggs);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Lizard);
	}
}
