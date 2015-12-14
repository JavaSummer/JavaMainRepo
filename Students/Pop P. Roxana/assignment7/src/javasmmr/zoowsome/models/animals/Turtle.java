package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Turtle extends Reptile {

	public Turtle(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {

		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}

	public Turtle() {
		this(new Integer(4), "turtle", true, 2, 0.01);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException  { 
		super.encodeToXml(eventWriter);  
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Turtle); 
	} 
}
