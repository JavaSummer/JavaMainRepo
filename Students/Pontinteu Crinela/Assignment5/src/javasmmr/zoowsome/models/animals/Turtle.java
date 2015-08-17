package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.animals.Constants;

public class Turtle extends Reptile {

	public Turtle(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(4);
		setLaysEggs(true);
			
	}
	
	public Turtle(String name, int nrLegs, boolean laysEggs,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setLaysEggs(laysEggs);
		setTakenCareOf(takenCareof);
	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Turtle);
	}
}
