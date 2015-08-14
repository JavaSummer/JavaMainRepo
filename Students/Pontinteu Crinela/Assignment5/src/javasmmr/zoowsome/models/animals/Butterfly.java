package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.animals.Constants;

public class Butterfly extends Insect {

	public Butterfly(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);

	}

	public Butterfly(String name, int nrLegs, boolean canFly, boolean isDangerous, double cost, double danger,
			boolean takenCareof) {
		super(cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setTakenCareOf(takenCareof);

	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Butterfly);
	}

}
