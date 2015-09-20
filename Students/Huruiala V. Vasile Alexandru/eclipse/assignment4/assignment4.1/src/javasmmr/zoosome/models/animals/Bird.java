package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal {
	private static final boolean DEFAULT_MIGRATES = false;
	private static final int DEFAULT_AVG_FLIGHT_ALTITUDE = 0;
	
	private boolean migrates;
	private int avgFlightAlitude;
	
	protected Bird() {
		super();
		this.migrates = DEFAULT_MIGRATES;
		this.avgFlightAlitude = DEFAULT_AVG_FLIGHT_ALTITUDE;
	}
	
	protected Bird(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final boolean doesMigrate, final int flightAlt) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc);
		this.migrates = doesMigrate;
		this.avgFlightAlitude = flightAlt;
	}
	
	public boolean getMigrates() {
		return this.migrates;
	}
	
	public void setMigrates(final boolean doesMigrate) {
		this.migrates = doesMigrate;
	}
	
	public int getAvgFlightAltitude() {
		return this.avgFlightAlitude;
	}
	
	public void setAvgFlightAltitude(final int flightAlt) {
		this.avgFlightAlitude = flightAlt;
	}
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(this.getMigrates()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.getAvgFlightAltitude()));
	}
	
	public void decodeFromXML(Element element) {
		super.decodeFromXML(element);
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}
