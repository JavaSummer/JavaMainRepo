package javasmmr.zoowsome.models.animals;
import java.util.Random;


import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.*;
public abstract class Animal implements Killer, XML_Parsable{
	
	private Integer nrOfLegs;
	private String name;
	private boolean takenCareOf;
	public final double maintenanceCost;
	public final double dangerPerc;
	
	public boolean kill(){
		double nr = Math.random();
		System.out.println(nr);
		if(nr<dangerPerc){
			return true;
		}
		else
		{
			return false;
		}
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
		//setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		//setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
	public Animal(double maintenanceCost, double dangerPerc){
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	
	public Integer getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(Integer nr){
		nrOfLegs = nr;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public void setTakenCareOf(boolean takenCareOf){
		this.takenCareOf = takenCareOf;
	}
	
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	
	public void setMaintenanceCost(double maintenanceCost){
		
	}
	public void setDangerPerc(double dangerPerc){
		
	}

	
}
