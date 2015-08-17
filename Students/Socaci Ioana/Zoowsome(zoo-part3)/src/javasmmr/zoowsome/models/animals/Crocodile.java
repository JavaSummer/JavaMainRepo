package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Crocodile extends Reptile{

	//constructors
	
	public Crocodile(){
		super(4, 0.8);
		setLaysEggs(true);
		setNrOfLegs(4);
		setName("Crocodile");
	}
	public Crocodile(boolean layEggs, int theNrOfLegs, String theName, double theMaintenanceCost, double theDangerPerc){
		super(theMaintenanceCost, theDangerPerc);
		setLaysEggs(layEggs);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
	}
	
	//override the method encodeToXml
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Crocodile);
	}
}
