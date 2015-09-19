package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Goldfish extends Aquatic {
	private static long counter;
	private final long id = counter++;

	public Goldfish() {
		super(0.5, 0);
		setName("Goldfish" + id);
		setNrOfLegs(0);
		setAvgSwimDepth(1);
		setWaterType(WaterType.FRESHWATER);
	}

	public Goldfish(String name) {
		super(0.5, 0);
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(1);
		setWaterType(WaterType.FRESHWATER);
	}

	public Goldfish(int legs, int depth, WaterType water) {
		super(0.5, 0);
		setName("Goldfish" + id);
		setNrOfLegs(legs);
		setAvgSwimDepth(depth);
		setWaterType(water);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Goldfish);
	}
}
