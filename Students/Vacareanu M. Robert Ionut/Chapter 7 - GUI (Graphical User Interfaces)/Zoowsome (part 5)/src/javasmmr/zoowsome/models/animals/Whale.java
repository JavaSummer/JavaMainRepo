package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.List;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Whale extends Aquatic {
	private static long counter;
	private final long id = counter++;

	public Whale(int avgSwimDepth, WaterType waterType, int nrOfLegs, String name, double maintenanceCost,
			double dangerPerc, boolean takenCareOf) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, avgSwimDepth, waterType);
	}

	// Keep the order from above;
	public Whale(List<String> attributes) {
		super(Integer.valueOf(attributes.get(2)), attributes.get(3), Double.valueOf(attributes.get(4)),
				Double.valueOf(attributes.get(5)), Boolean.valueOf(attributes.get(6)),
				Integer.valueOf(attributes.get(0)), WaterType.valueOf(attributes.get(1)));
	}

	public Whale() {
		super(8, 0.25);
		setName("Whale" + id);
		setNrOfLegs(0);
		setAvgSwimDepth(3000);
		setWaterType(WaterType.SALTWATER);
	}

	public Whale(String name) {
		super(8, 0.25);
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(3000);
		setWaterType(WaterType.SALTWATER);
	}

	public Whale(int legs, int depth, WaterType water) {
		super(8, 0.25);
		setName("Whale" + id);
		setNrOfLegs(legs);
		setAvgSwimDepth(depth);
		setWaterType(water);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Whale);
	}
}
