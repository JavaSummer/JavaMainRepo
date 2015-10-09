package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Mockingjay extends Bird {

	public Mockingjay(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Mockingjay() {
		this.setName("Mocker");
		this.setNrOfLegs(2);
		this.setMigrates(false);
		this.setAvgFlightAltitude(20);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Mockingjay);
	}
}
