package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animal.Constants;

public class Flamingo extends Bird {

	public Flamingo(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(2);
		setName("Pink Flame");
		setMigrates(true);
		setAvgFlightAltitude(20); // no idea
	}

	public Flamingo(String name, int flightAltitude, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(2);
		setName(name);
		setMigrates(true);
		setAvgFlightAltitude(flightAltitude);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Flamingo);
	}
}
