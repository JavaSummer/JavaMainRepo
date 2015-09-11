package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.*;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Animal implements Killer, XML_Parsable {

	private int nrOfLegs;
	private String name;
	private final double maintenanceCost;
	private final double dangerPerc;
	private boolean takenCareOf;

	public Animal(double maintenanceCost, double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
		setTakenCareOf(false);
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public double getDangerPerc() {
		return dangerPerc;
	}

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean kill() {
		return (Math.random() < dangerPerc + getPredisposition());
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public boolean getTakenCareOf() {
		return takenCareOf;
	}

	public double getPredisposition() {
		return 0;
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
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}
