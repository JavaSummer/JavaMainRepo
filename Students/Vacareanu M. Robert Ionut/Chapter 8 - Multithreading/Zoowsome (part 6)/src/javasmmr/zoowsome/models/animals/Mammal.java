package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal {
	Mammal(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private float normalBodyTemp;
	private float percBodyHair;

	Mammal(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}

	public float getNormalBodyTemp() {
		return this.normalBodyTemp;
	}

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public float getPercBodyHair() {
		return this.percBodyHair;
	}

	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}

	@Override
	public String toString() {
		String attributes = new String();
		attributes = attributes + super.toString();
		attributes = attributes + "Body Temp: " + this.getNormalBodyTemp() + "\n";
		attributes = attributes + "Body Hair: " + this.getPercBodyHair() + "\n\n";

		return attributes;
	}

	public void printAllAttributes() {
		System.out.println(this.toString());
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(getNormalBodyTemp()));
		createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}