package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.animalfactories.Constants;

public class Tiger extends Mammal{

	public Tiger(){
		super(6, 0.8);
		setNrOfLegs(4);
		setName("Tiger");
		setTemperature(37);
		setBodyHair(90);
		setTakenCareOf(false);
	}
	public Tiger(double maintananceCost,double dangerPerc, String name, Integer nrOfLegs, float temp, float hair, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setTemperature(temp);
		setBodyHair(hair);
		setTakenCareOf(takeCare);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammal.Tiger);
	}
}
