package javasmmr.zoowsome.models.animals;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.Killer;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Animal implements Killer, XML_Parsable {
	private int nrOfLegs;
	private String name;
	private double maintenanceCost;
	private double dangerPerc;
	private boolean takenCareOf = false;

	public Animal(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf){
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
		this.takenCareOf = takenCareOf;
	}
	
	public int getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}

	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public double getDangerPerc() {
		return this.dangerPerc;
	}

	public void setDangerPerc(double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}

	public boolean getTakenCareOf() {
		return this.takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public boolean kill() throws Exception {
		double random;
		Random randomGenerator = new Random();
		random = randomGenerator.nextDouble();
		return this.getDangerPerc() + this.getPredisposition() > random ? true : false;
	}

	Animal(double maintenanceCost, double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

	public double getPredisposition() throws Exception {
		return 0;
	}

	@Override
	public String toString(){
		String attributes = new String();

		attributes = attributes + "Class: " + this.getClass() + "\n";
		attributes = attributes + "Name: " + this.getName() + "\n";
		attributes = attributes + "Legs: " + this.getNrOfLegs() + "\n";
		attributes = attributes + "Maintenance: " + this.getMaintenanceCost() + "\n";
		attributes = attributes + "Danger: " + this.getDangerPerc() + "\n";
		attributes = attributes + "Taken Care of: " + this.getTakenCareOf() + "\n";
		
		return attributes;
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
}
