package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.animalfactories.Constants;

public class Cow extends Mammal {

	public Cow(){
		super(8, 0.3);
		setNrOfLegs(4);
		setName("Cow");
		setTemperature(37);
		setBodyHair(15);
		setTakenCareOf(false);
	}
	public Cow(double maintananceCost, double dangerPerc, Integer nrLegs, String n, float temp, float hair, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setNrOfLegs(nrLegs);
		setName(n);
		setTemperature(temp);
		setBodyHair(hair);
		setTakenCareOf(takeCare);
}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammal.Cow);
	}
	
}