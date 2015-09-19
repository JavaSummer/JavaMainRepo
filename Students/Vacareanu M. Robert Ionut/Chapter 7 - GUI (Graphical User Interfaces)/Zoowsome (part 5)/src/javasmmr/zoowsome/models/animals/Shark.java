package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Shark extends Aquatic {
	private static long counter;
	private final long id = counter++;

	public Shark(int avgSwimDepth, WaterType waterType, int nrOfLegs, String name, double maintenanceCost,
			double dangerPerc, boolean takenCareOf) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, avgSwimDepth, waterType);
	}

	// Keep the order from above;
	public Shark(List<String> attributes) {
		super(Integer.valueOf(attributes.get(2)), attributes.get(3), Double.valueOf(attributes.get(4)),
				Double.valueOf(attributes.get(5)), Boolean.valueOf(attributes.get(6)),
				Integer.valueOf(attributes.get(0)), WaterType.valueOf(attributes.get(1)));
	}

	public Shark() {
		super(4, 0.65);
		setName("Shark" + id);
		setNrOfLegs(0);
		setAvgSwimDepth(500);
		setWaterType(WaterType.SALTWATER);
	}

	public Shark(String name) {
		super(4, 0.65);
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(500);
		setWaterType(WaterType.SALTWATER);
	}

	public Shark(int legs, int depth, WaterType water) {
		super(4, 0.65);
		setName("Shark" + id);
		setNrOfLegs(legs);
		setAvgSwimDepth(depth);
		setWaterType(water);
	}

	@Override
	public double getPredisposition() throws Exception {

		Calendar date = GregorianCalendar.getInstance();
		if (date.get(Calendar.MONTH) == Calendar.AUGUST) {
			return 0.15;
		} else {
			return 0;
		}
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}
}
