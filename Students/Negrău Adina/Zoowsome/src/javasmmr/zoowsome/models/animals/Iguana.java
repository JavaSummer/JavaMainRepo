package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.animalfactories.Constants;

public class Iguana extends Reptile{

	public Iguana(){
		super(3, 0.6);
		setName("Iguana");
		setNrOfLegs(4);
		setLaysEggs(true);
		setTakenCareOf(false);
	}
	public Iguana(double maintananceCost, double dangerPerc, String n, Integer nrLegs, boolean eggs, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(n);
		setNrOfLegs(nrLegs);
		setLaysEggs(eggs);
		setTakenCareOf(false);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptile.Iguana);
	}
}
