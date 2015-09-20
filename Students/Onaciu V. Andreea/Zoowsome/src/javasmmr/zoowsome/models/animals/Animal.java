package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.interfaces.*;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

abstract public class Animal implements Killer, XML_Parsable {
	int nrOfLegs;
	String name;
	double maintenanceCost;
	double dangerPerc;
	boolean takeCareOf;

	public String toString(){
		return "Name: " + name + " NrOfLegs: "+ nrOfLegs+ " MaintenanceCost: "+maintenanceCost+ "DangerPerc: "+ dangerPerc+"\n";	
	}
	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int legs) {
		this.nrOfLegs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(double cost) {
		this.maintenanceCost = cost;
	}

	public void setDangerPerc(double danger) {
		this.dangerPerc = danger;
	}

	public double getDangerPerc() {
		return dangerPerc;
	}

	public void setTakeCareOf(boolean care) {
		this.takeCareOf = care;
	}

	public boolean getTakeCareOf() {
		return takeCareOf;
	}

	public Animal(double maintenanceCost, double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

	public boolean kill() {
		double random = Math.random();
		if (random < dangerPerc)
			return true;
		else
			return false;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takeCareOf));
	}

	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakeCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}

interface Killer {
	public boolean kill();
}
