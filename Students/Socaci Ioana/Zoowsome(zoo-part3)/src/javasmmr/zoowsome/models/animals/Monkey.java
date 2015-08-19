package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Monkey extends Mammal{

	//constructors
	
	public Monkey(){
		super(3, 0.4);
		setTakenCareOf(false);
		setNrOfLegs(2);
		setName("Monkey");
		setNormalBodyTemp(30F);
		setPercBodyHair(90F);
	}
	public Monkey(String theName, int theNrOfLegs, float bodyTemp, float bodyHair, double theMaintenanceCost, double theDangerPerc){
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}

	//override the method encodeToXml
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Monkey);
		
	}
}
