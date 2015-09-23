package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Animal implements Killer,XML_Parsable{
	
	private Integer nrOfLegs;
	private String name;
    public Double maintenanceCost;
	Double dangerPerc;
	public Boolean takenCareOf = false;
	
	public Animal(double maintenanceCost, double dangerPerc){
	
		setMaintenanceCost(Double.valueOf(maintenanceCost));
		setDangerPerc(Double.valueOf(dangerPerc));
	}

	public boolean kill(){
		
		Random generator = new Random();
		double no = generator.nextDouble();
		if (no<(dangerPerc+getPredisposition())){//like this? :?
			return true;
		}
		else{
			return false;
		}
		
	}

	
	
    public final Double getMaintenanceCost() {
		return maintenanceCost;
	}

	public final void setMaintenanceCost(Double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}
	
	
	public Double getDangerPerc() {
		return dangerPerc;
	}

	public void setDangerPerc(Double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}

	public double getPredisposition(){
		return 0;
	}
	
	public Boolean getTakenCareOf(){
		return takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf){
		this.takenCareOf = new Boolean(takenCareOf);
	}
	public Integer getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(Integer nrOfLegs){
		this.nrOfLegs = new Integer(nrOfLegs);
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String s){
		name = new String(s);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));  
		createNode(eventWriter, "name", String.valueOf(this.name)); 
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost)); 
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));   
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf)); 
		} 
	
	public void decodeFromXml(Element element) { 
		
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));  
		setName(element.getElementsByTagName("name").item(0).getTextContent()); 
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));  
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent())); 
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent())); 
		} 
	
	public abstract void getAnimalAttributes(); 
	public abstract String toString();
	
}
