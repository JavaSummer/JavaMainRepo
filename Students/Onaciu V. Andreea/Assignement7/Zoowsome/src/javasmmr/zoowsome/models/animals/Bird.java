package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract public class Bird extends Animal {

	private boolean migrates;
	private int avgFlightAltitude;

	public boolean getMigrates() {
		return migrates;
	}

	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public void setAvgFlightAltitude(int flightAltitude) {
		this.avgFlightAltitude = flightAltitude;
	}

	public Bird(int nrOfLegs, String name, double cost, double danger, int flightAltitude, boolean migrates) {
		super(cost, danger);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgFlightAltitude(flightAltitude);
		setMigrates(migrates);
	}

	public Bird(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
		createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
	}

	public void decodeFromXml(Element element) {
		setAvgFlightAltitude(
				Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
	}
}
