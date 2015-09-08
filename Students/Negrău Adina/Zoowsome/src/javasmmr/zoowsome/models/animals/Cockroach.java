package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.animalfactories.Constants;

public class Cockroach extends Insect {

	public Cockroach(){
		super(3, 0.3);
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(true);
		setTakenCareOf(false);
	}
	public Cockroach(double maintananceCost, double dangerPerc, Integer legs, String n, boolean fly, boolean dangerous, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setNrOfLegs(legs);
		setName(n);
		setCanFly(fly);
		setIsDangerous(dangerous);
		setTakenCareOf(takeCare);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insect.Cockroach);
	}
}
