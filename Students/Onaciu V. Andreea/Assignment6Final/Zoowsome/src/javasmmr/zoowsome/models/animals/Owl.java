package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;

public class Owl extends Bird {
	public Owl(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(2);
		setName("owl");
		setMigrates(true);
		setAvgFlightAltitude(60);
	}

	public Owl() {
		super(2.3, 0.3);
		setNrOfLegs(2);
		setName("owl");
		setMigrates(true);
		setAvgFlightAltitude(60);
	}

	public Owl(int nrOfLegs, String name, double cost, double danger, int flightAltitude, boolean migrates) {
		super(nrOfLegs, name, cost, danger, flightAltitude, migrates);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Owl);
	}
}
