package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal {

	private boolean laysEggs;
	
	//encoding to xml
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		 
		 super.encodeToXml(eventWriter);  
		 createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs())); 
    } 
	
	//decoding from xml
	 public void decodeFromXml(Element element) { 
		 
		 super.decodeFromXml(element);
		 setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent())); 
	}
	
	public Reptile(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public Boolean getLaysEggs(){
		return laysEggs;
	}
	
	public void setLaysEggs(boolean laysEggs){
		this.laysEggs = laysEggs;
	}
	
	public void getAnimalAttributes(){
		System.out.println("Species: Reptile ");
		System.out.println("Name: "+getName());
		System.out.println("Number of legs: "+getNrOfLegs());
		System.out.println("Maintenance cost: "+super.maintenanceCost);
		System.out.println("Danger: "+(super.dangerPerc*100)+"%");
		System.out.println("Extra details:");
		System.out.println((getLaysEggs())?"It lays eggs":"It does not lay eggs");
		System.out.println();
	}
}
