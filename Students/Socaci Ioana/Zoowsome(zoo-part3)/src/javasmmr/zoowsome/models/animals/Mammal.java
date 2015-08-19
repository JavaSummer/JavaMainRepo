package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract public class Mammal extends Animal {

	//constructor
	
	public Mammal(double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
	}

	//instance variables
	
	private float normalBodyTemp;
	private float percBodyHair;

	//getters/setters
	
	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public void setNormalBodyTemp(float theNormalBodyTemp) {
		normalBodyTemp = theNormalBodyTemp;
	}

	public float getPercBodyHair() {
		return percBodyHair;
	}

	public void setPercBodyHair(float thePercBodyHair) {
		percBodyHair = thePercBodyHair;
	}
	
	//override the method encodeToXml
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(this.normalBodyTemp));
		createNode(eventWriter, "percBodyHair", String.valueOf(this.percBodyHair));
	}
	
	//override the method decodeFromXml
	
	public void decodeFromXml(Element element){
		super.decodeFromXml(element);
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
