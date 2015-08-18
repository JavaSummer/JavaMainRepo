package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.Killer;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

abstract public class Animal implements Killer, XML_Parsable{

	//instance variables
	
	private int nrOfLegs;
	private String name;
	private boolean takenCareOf;
	
	
	
	private double maintenanceCost;
	private double dangerPerc;
	
	//constructor
	
	public Animal(double theMaintenanceCost, double theDangerPerc){
		maintenanceCost = theMaintenanceCost;
		dangerPerc = theDangerPerc;
	}
	
	//getters/setters
	
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	public void setMaintenanceCost(double theMaintenanceCost){
		maintenanceCost = theMaintenanceCost;
	}
	public void setDangerPerc(double theDangerPerc){
		dangerPerc = theDangerPerc;
	}
	public void setTakenCareOf(boolean takesCare){
		takenCareOf = takesCare;
	}
	public double getMaintenanceCost(){
		return maintenanceCost;
	}
	
	public double getDangerPerc(){
		return dangerPerc;
	}
	
	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int theNrOfLegs) {
		nrOfLegs = theNrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String theName) {
		name = theName;
	}
	
	//implement the interface method "kill"

		public boolean kill() {
			if(Math.random() < getDangerPerc())return true;
			return false;
		}
		
	//implement the XML_Parsable interface
		
		public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
			createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
			createNode(eventWriter, "name", String.valueOf(this.name));
			createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
			createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
			createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
		}
		
		public void decodeFromXml(Element element){
			setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
			setName(element.getElementsByTagName("name").item(0).getTextContent());
			setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
			setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
		}

}
