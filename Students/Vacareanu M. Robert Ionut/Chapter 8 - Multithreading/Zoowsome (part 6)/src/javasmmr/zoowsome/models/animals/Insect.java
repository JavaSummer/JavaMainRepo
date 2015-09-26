package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Insect extends Animal {
	Insect(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private Boolean canFly;
	private Boolean isDangerous;

	Insect(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf, Boolean canFly,
			Boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}

	public Boolean getCanFly() {
		return this.canFly;
	}

	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}

	public Boolean getIsDangerous() {
		return this.isDangerous;
	}

	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	@Override
	public String toString() {
		String attributes = new String();
		attributes = attributes + super.toString();
		attributes = attributes + "Fly: " + this.getCanFly() + "\n";
		attributes = attributes + "Dangerous: " + this.getIsDangerous() + "\n\n";

		return attributes;
	}

	public void printAllAttributes() {
		System.out.println(this.toString());
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}