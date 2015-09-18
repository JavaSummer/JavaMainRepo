package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;

public class Flamingo extends Bird {
	public Flamingo(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(2);
		setName("flamingo");
		setMigrates(true);
		setAvgFlightAltitude(300);
	}

	public Flamingo() {
		super(3, 0.3);
		setNrOfLegs(2);
		setName("flamingo");
		setMigrates(true);
		setAvgFlightAltitude(300);
	}

	public Flamingo(int nrOfLegs, String name, double cost, double danger, int flightAltitude, boolean migrates) {
		super(nrOfLegs, name, cost, danger, flightAltitude, migrates);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Flamingo);
	}
}
