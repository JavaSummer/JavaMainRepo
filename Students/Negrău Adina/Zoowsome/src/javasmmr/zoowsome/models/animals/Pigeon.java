package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.animalfactories.Constants;

public class Pigeon extends Bird{

	public Pigeon(){
		super(3, 0);
		setName("Pigeon");
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(6000);
		setTakenCareOf(false);
	}
	
	public Pigeon(double maintananceCost,double dangerPerc, String name, Integer nrOfLegs, boolean migrates, Integer avgFlightAltitude, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setTakenCareOf(false);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.Pigeon);
	}
}
