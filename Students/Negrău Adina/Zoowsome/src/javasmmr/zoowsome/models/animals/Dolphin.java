package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.animalfactories.Constants;

public class Dolphin extends Aquatic {
	
	public Dolphin(){
		super(7, 0.1);
		setName("Dolphin");
		setNrOfLegs(0);
		setAvgSwimDepth(46);
		setWaterType(waterType.freshwater);
		setTakenCareOf(false);
	}
	public Dolphin(double maintananceCost, double dangerPerc, String name, Integer nrOfLegs, Integer avgSwimDepth, waterType type){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(type);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Dolphin);
	}
}
