package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal {

	//attributes
    private  float normalBodyTemp ;
	private float percBodyHair ;

	public Mammal(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	//encoding to xml
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		 
		 super.encodeToXml(eventWriter);  
		 createNode(eventWriter, "normalBodyTemp", String.valueOf(getNormalBodyTemp())); 
		 createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));  
    } 
	
	//decoding from xml
	 public void decodeFromXml(Element element) { 
		 
		 super.decodeFromXml(element);
		 setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent())); 
		 setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
	
	
	//setters and getters
	public float getNormalBodyTemp(){
		return normalBodyTemp;
	}
	
	public void setNormalBodyTemp(float normalBodyTemp){
		this.normalBodyTemp = normalBodyTemp;
	}
	
	public float getPercBodyHair(){
		return percBodyHair;
	}
	
	public void setPercBodyHair(float percBodyHair){
		this.percBodyHair = percBodyHair;
	}
	
	//attributes printing
	public void getAnimalAttributes(){
		System.out.println("Species: Aquatic ");
		System.out.println("Name: "+getName());
		System.out.println("Number of legs: "+getNrOfLegs());
		System.out.println("Maintenance cost: "+super.maintenanceCost);
		System.out.println("Danger: "+(super.dangerPerc*100)+"%");
		System.out.println("Extra details:");
		System.out.println("It has a normal temp of: "+getNormalBodyTemp());
		System.out.println("It is covered in hair to a percentage of "+getPercBodyHair());
		System.out.println();
	}
}
