package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Animal implements Killer, XML_Parsable {

	private static final double DEFAULT_MAINTENANCE_COST = 4.5;
	private static final double DEFAULT_DANGER_PERC = 0.2;

	private int nrOfLegs;
	private String name;
	private double maintenanceCost;
	private double dangerPerc;
	private boolean takenCareOf = false;

	public Animal() {
		this.maintenanceCost = DEFAULT_MAINTENANCE_COST;
		this.dangerPerc = DEFAULT_DANGER_PERC;
		// always initialize takenCareOf with 'false' automatically
		this.takenCareOf = false;
	}

	public Animal(double maintenanceCost, double dangerPerc) {
		if (maintenanceCost > 8.0)
			this.maintenanceCost = 8.0;
		else
			this.maintenanceCost = maintenanceCost;

		if (dangerPerc < 0)
			this.dangerPerc = 0;
		else if (dangerPerc > 1)
			this.dangerPerc = 1;
		else
			this.dangerPerc = dangerPerc;
		// always initialize takenCareOf with 'false' automatically
		this.takenCareOf = false;
	}

	public boolean kill() {
		double randomDangerPerc = Math.random();
		if (randomDangerPerc < dangerPerc)
			return true;
		else
			return false;
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
		setMaintenanceCost(Double. valueOf(element.getElementsByTagName( "maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
		}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
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

	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public void setDangerPerc(double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}
}
