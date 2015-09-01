package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.animalfactories.Constants;

public class Goose extends Bird{

	public Goose(){
		super(3, 0.1);
		setName("Goose");
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(10);
		setTakenCareOf(false);
			
		}
	public Goose(double maintananceCost, double dangerPerc, String name, Integer nrOfLegs, boolean migrates, Integer avgFlightAltitude, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setTakenCareOf(false);
		}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.Goose);
	}
}
