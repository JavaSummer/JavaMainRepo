package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract public class Reptile extends Animal{

	//constructor
	
	public Reptile(double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
	}

	//instance variables
	
	private boolean laysEggs;
	
	//getters/setters
	
	public boolean getLaysEggs(){
		return laysEggs;
	}
	
	public void setLaysEggs(boolean layEggs){
		laysEggs = layEggs;
	}
	
	//override the method encodeToXml
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(this.laysEggs));
	}
	
	//override the method decodeFromXml
	
	public void decodeFromXml(Element element){
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
