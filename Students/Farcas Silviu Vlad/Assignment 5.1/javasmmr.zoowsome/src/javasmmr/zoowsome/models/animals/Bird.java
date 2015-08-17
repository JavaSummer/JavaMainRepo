package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.*;

public abstract class Bird extends Animal {
	private boolean migrates;
	private int avgFlightAltitude;

	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public boolean getMigrates() {
		return migrates;
	}

	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public Bird(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(
				Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}
