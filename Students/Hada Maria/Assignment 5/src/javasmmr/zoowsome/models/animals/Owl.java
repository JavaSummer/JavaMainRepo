package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animal.Constants;

public class Owl extends Bird {

	public Owl(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(2);
		setName("Hedwig");
		setMigrates(true);
		setAvgFlightAltitude(1000);
	}

	public Owl(String name, boolean migrate, int flightAltitude, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(2);
		setName(name);
		setMigrates(migrate);
		setAvgFlightAltitude(flightAltitude);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Owl);
	}
}
