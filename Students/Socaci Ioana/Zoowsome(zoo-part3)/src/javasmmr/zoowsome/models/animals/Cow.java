package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cow extends Mammal{

	//constructors
	
	public Cow(){
		super(1, 0.5);
		setNrOfLegs(4);
		setName("Cow");
		setNormalBodyTemp(38F);
		setPercBodyHair(95F);
	}
	public Cow(String theName, int theNrOfLegs, float bodyTemp, float bodyHair, double theMaintenanceCost, double theDangerPerc){
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}
	
	//override the method encodeToXml
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Cow);
	}
}
