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

	public Boolean getMigrate() {
		return this.migrate;
	}

	public void setMigrate(Boolean migrate) {
		this.migrate = migrate;
	}

	public int getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}

	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public void printAllAttributes() {
		System.out.printf("Class: %s%n", this.getClass());
		System.out.printf("Name: %s%n", this.getName());
		System.out.printf("Legs: %d%n", this.getNrOfLegs());
		System.out.printf("Altitude: %d%n", this.getAvgFlightAltitude());
		System.out.printf("Migrate: %b%n", this.getMigrate());
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrate", String.valueOf(getMigrate()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setMigrate(Boolean.valueOf(element.getElementsByTagName("migrate").item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}