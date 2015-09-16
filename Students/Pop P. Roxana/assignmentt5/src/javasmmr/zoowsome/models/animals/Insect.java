package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode; 

public abstract class Insect extends Animal {

	private boolean canFly;
	private boolean isDangerous;
	
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		 
		 super.encodeToXml(eventWriter);  
		 createNode(eventWriter, "canFly", String.valueOf(getCanFly())); 
		 createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));  
    } 
	 
	 public void decodeFromXml(Element element) { 
		 
		 super.decodeFromXml(element);
		 setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent())); 
		 setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
	
	public Insect(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}

	public boolean getCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	public void getAnimalAttributes(){
		System.out.println("Species: Insect ");
		System.out.println("Name: "+getName());
		System.out.println("Number of legs: "+getNrOfLegs());
		System.out.println("Maintenance cost: "+super.maintenanceCost);
		System.out.println("Danger: "+(super.dangerPerc*100)+"%");
		System.out.println("Extra details:");
		System.out.println((getIsDangerous())?"It is dangerous":"It is not dangerous");
		System.out.println((getCanFly())?"It can fly":"It simply can't fly");
		System.out.println();
	}
}
