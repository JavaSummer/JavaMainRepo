package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.animalfactories.Constants;

public class Snake extends Reptile {
	public Snake(){
		super(2, 0.6);
		setName("Snake");
		setNrOfLegs(0);
		setLaysEggs(true);
		setTakenCareOf(false);
	}
	
	public Snake(double maintananceCost, double dangerPerc, String name, Integer nrOfLegs, boolean laysEggs, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLaysEggs(laysEggs);
		setTakenCareOf(takeCare);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptile.Snake);
	}
	
}