package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoosome.models.interfaces.XML_Parsable;

public abstract class Animal implements Killer, XML_Parsable {
	private static final String DEFAULT_NAME = null;
	private static final int DEFAULT_NUMBER_OF_LEGS = 0;
	private static final double DEFAULT_MAINTENANCE_COST_MIN = 0.1D;
	private static final double DEFAULT_MAINTENANCE_COST_MAX = 8.0D;
	private static final double DEFAULT_DANGER_PERCENTAGE_MIN = 0.0D;
	private static final double DEFAULT_DANGER_PERCENTAGE_MAX = 1.0D;
	private static final boolean DEFAULT_TAKEN_CARE_OF = false;

	private String name;
	private int noOfLegs;
	private double maintenanceCost;
	private double dangerPerc;
	private boolean takenCareOf;

	protected Animal() {
		this.name = DEFAULT_NAME;
		this.noOfLegs = DEFAULT_NUMBER_OF_LEGS;
		this.maintenanceCost = DEFAULT_MAINTENANCE_COST_MIN;
		this.dangerPerc = DEFAULT_DANGER_PERCENTAGE_MIN;
		this.takenCareOf = DEFAULT_TAKEN_CARE_OF;
	}

	protected Animal(final String animalName, final int numberOfLegs, final double maintenaceCosts,
			final double dangerPercentage) {
		this.name = new String(animalName);
		this.noOfLegs = numberOfLegs;

		if (maintenaceCosts < DEFAULT_MAINTENANCE_COST_MIN) {
			this.maintenanceCost = DEFAULT_MAINTENANCE_COST_MIN;
		} else if (maintenaceCosts > DEFAULT_MAINTENANCE_COST_MAX) {
			this.maintenanceCost = DEFAULT_MAINTENANCE_COST_MAX;
		} else {
			this.maintenanceCost = maintenaceCosts;
		}

		if (dangerPercentage < DEFAULT_DANGER_PERCENTAGE_MIN) {
			this.dangerPerc = DEFAULT_DANGER_PERCENTAGE_MIN;
		} else if (dangerPercentage > DEFAULT_DANGER_PERCENTAGE_MAX) {
			this.dangerPerc = DEFAULT_DANGER_PERCENTAGE_MAX;
		} else {
			this.dangerPerc = dangerPercentage;
		}

		this.takenCareOf = DEFAULT_TAKEN_CARE_OF;
	}

	public boolean kill() {
		return (Math.random() < (this.dangerPerc + getPredisposition()));
	}

	public double getPredisposition() {
		return 0.0D;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String animalName) {
		this.name = new String(animalName);
	}

	public int getNoOfLegs() {
		return this.noOfLegs;
	}

	public void setNoOfLegs(final int numberOfLegs) {
		this.noOfLegs = numberOfLegs;
	}

	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}

	public void setMaintenenceCost(double newMaintenanceCost) {
		this.maintenanceCost = newMaintenanceCost;
	}

	public double getDangerPerc() {
		return this.dangerPerc;
	}

	public void setDangerPerc(double newDangerPerc) {
		this.dangerPerc = newDangerPerc;
	}

	public boolean getTakenCareOf() {
		return this.takenCareOf;
	}

	public void setTakenCareOf(boolean care) {
		this.takenCareOf = care;
	}

	public abstract String[] getFields();

	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "noOfLegs", String.valueOf(this.noOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}

	public void decodeFromXML(Element element) {
		setNoOfLegs(Integer.valueOf(element.getElementsByTagName("noOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenenceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}
