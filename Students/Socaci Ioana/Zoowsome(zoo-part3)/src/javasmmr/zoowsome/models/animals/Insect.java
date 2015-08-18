package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract public class Insect extends Animal {

	//constructor 
	
	public Insect(double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
	}

	//instance variables
	private boolean canFly;
	private boolean isDangerous;

	//getters/setters
	
	public boolean getCanFly() {
		return canFly;
	}

	public void setCanFly(boolean flies) {
		canFly = flies;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

	public void setIsDangerous(boolean dangerous) {
		isDangerous = dangerous;
	}
	
	//override the method encodeToXml
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(this.canFly));
		createNode(eventWriter, "isDangerous", String.valueOf(this.isDangerous));
	}
	
	//override the method decodeFromXml
	
	public void decodeFromXml(Element element){
		super.decodeFromXml(element);
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
