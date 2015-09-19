package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.List;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Butterfly extends Insect {
	private static long counter;
	private final long id = counter++;

	public Butterfly(Boolean canFly, Boolean isDangerous, int nrOfLegs, String name, double maintenanceCost, double dangerPerc,
			boolean takenCareOf) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, canFly, isDangerous);
	}

	// Keep the order from above;
	public Butterfly(List<String> attributes) {
		super(Integer.valueOf(attributes.get(2)), attributes.get(3), Double.valueOf(attributes.get(4)),
				Double.valueOf(attributes.get(5)), Boolean.valueOf(attributes.get(6)),
				Boolean.valueOf(attributes.get(0)), Boolean.valueOf(attributes.get(1)));
	}

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
