package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.animalfactories.Constants;

public class Spider extends Insect {

	public Spider(){
		super(1, 0.3);
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(false);
		setIsDangerous(true);
		setTakenCareOf(false);

	}
	public Spider(double maintananceCost, double dangerPerc, String n, Integer nrLegs, boolean fly, boolean dang){
		super(maintananceCost, dangerPerc);
		setNrOfLegs(nrLegs);
		setName(n);
		setCanFly(fly);
		setIsDangerous(dang);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insect.Spider);
	}
}
