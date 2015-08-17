package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

abstract public class Bird extends Animal {

	//constructor
	
	public Bird(double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
	}

	//instance variables
	
	private boolean migrates;
	private int avgFlightAltitude;

	//getters/setters
	
	public boolean getMigrates() {
		return migrates;
	}

	public void setMigrates(boolean migration) {
		migrates = migration;
	}

	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public void setAvgFlightAltitude(int theAvgFlightAltitude) {
		avgFlightAltitude = theAvgFlightAltitude;
	}
	
	//override the method encodeToXml
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(this.migrates));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.avgFlightAltitude));
	}
	
	//override the method decodeFromXml
	
	public void decodeFromXml(Element element){
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}
