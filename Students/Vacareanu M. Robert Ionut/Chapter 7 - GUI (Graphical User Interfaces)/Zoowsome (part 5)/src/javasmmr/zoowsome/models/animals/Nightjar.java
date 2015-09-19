package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.List;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Nightjar extends Bird {
	private static long counter;
	private final long id = counter++;

	public Nightjar(Boolean migrate, int avgFlightAltitude, int nrOfLegs, String name, double maintenanceCost,
			double dangerPerc, boolean takenCareOf) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, migrate, avgFlightAltitude);
	}

	// Keep the order from above;
	public Nightjar(List<String> attributes) {
		super(Integer.valueOf(attributes.get(2)), attributes.get(3), Double.valueOf(attributes.get(4)),
				Double.valueOf(attributes.get(5)), Boolean.valueOf(attributes.get(6)),
				Boolean.valueOf(attributes.get(0)), Integer.valueOf(attributes.get(1)));
	}

	public Nightjar() {
		super(2.5, 0.05);
		setName("Nightjar" + id);
		setNrOfLegs(2);
		setMigrate(true);
		setAvgFlightAltitude(1000);
	}

	public Nightjar(String name) {
		super(2.5, 0.05);
		setName(name);
		setNrOfLegs(2);
		setMigrate(true);
		setAvgFlightAltitude(1000);
	}

	public Nightjar(int legs, Boolean migrate, int altitude) {
		super(2.5, 0.05);
		setName("Nightjar" + id);
		setNrOfLegs(legs);
		setMigrate(migrate);
		setAvgFlightAltitude(altitude);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Nightjar);
	}
}
