package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Owl extends Bird {
	private static long counter;
	private final long id = counter++;

	public Owl() {
		super(1.5, 0.02);
		setName("Owl" + id);
		setNrOfLegs(2);
		setMigrate(true);
		setAvgFlightAltitude(2000);
	}

	public Owl(String name) {
		super(1.5, 0.02);
		setName(name);
		setNrOfLegs(2);
		setMigrate(true);
		setAvgFlightAltitude(2000);
	}

	public Owl(int legs, Boolean migrate, int altitude) {
		super(1.5, 0.02);
		setName("Owl" + id);
		setNrOfLegs(legs);
		setMigrate(migrate);
		setAvgFlightAltitude(altitude);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Owl);
	}
}
