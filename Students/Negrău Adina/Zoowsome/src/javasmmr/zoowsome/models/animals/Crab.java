package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.animalfactories.Constants;

public class Crab extends Aquatic {
	public Crab(){
		super(4.0, 0);
		setName("Crab");
		setNrOfLegs(10);
		setAvgSwimDepth(50);
		setWaterType(waterType.freshwater);
		setTakenCareOf(false);
	}
	public Crab(Double maintananceCost, double dangerPerc, String n, Integer nrLegs, Integer avgSwimDepth, waterType type, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(n);
		setNrOfLegs(nrLegs);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(type);
		setTakenCareOf(takeCare);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Crab);
	}
	
}