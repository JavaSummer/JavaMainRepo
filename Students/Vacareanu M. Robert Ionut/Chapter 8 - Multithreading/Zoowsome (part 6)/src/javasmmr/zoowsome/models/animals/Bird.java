package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal {
	Bird(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private Boolean migrate;
	private int avgFlightAltitude;

	Bird(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf, Boolean migrate,
			int avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
		this.migrate = migrate;
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public Boolean getMigrate() {
		return this.migrate;
	}

	public void setMigrate(Boolean migrate) {
		this.migrate = migrate;
	}

	public int getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}

	@Override
	public String toString() {
		String attributes = new String();
		attributes = attributes + super.toString();
		attributes = attributes + "Migrate: " + this.getMigrate() + "\n";
		attributes = attributes + "Flight Altitude" + this.getAvgFlightAltitude() + "\n\n";

		return attributes;
	}

	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public void printAllAttributes() {
		System.out.println(this.toString());
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrate", String.valueOf(getMigrate()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setMigrate(Boolean.valueOf(element.getElementsByTagName("migrate").item(0).getTextContent()));
		setAvgFlightAltitude(
				Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}