package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cockroach extends Insect{

	//constructors
	
	public Cockroach(){
		super(0.5, 0.5);
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(true);
	}
	public Cockroach(String theName, int theNrOfLegs, boolean flies, boolean dangerous, double theMaintenanceCost, double theDangerPerc){
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setCanFly(flies);
		setIsDangerous(dangerous);
	}

	//override the method encodeToXml
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
	}
}
