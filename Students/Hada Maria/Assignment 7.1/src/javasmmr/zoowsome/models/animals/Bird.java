package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal {

	boolean migrates;
	int avgFlightAltitude;

	public Bird(double cost, double danger) {
		super(cost, danger);
	}

	public void setMigrates(boolean migrate) {
		migrates = migrate;
	}

	public boolean getMigrates() {
		return migrates;
	}

	public void setAvgFlightAltitude(int altitude) {
		avgFlightAltitude = altitude;
	}

	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(this.migrates));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.avgFlightAltitude));
	}
	
	public void decodeFromXml(Element element) {
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}
