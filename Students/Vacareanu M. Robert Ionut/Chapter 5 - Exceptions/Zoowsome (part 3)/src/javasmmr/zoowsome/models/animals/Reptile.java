package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal {
	Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private Boolean layEggs;

	public Boolean getLayEggs() {
		return this.layEggs;
	}

	public void setLayEggs(Boolean layEggs) {
		this.layEggs = layEggs;
	}

	public void printAllAttributes() {
		System.out.printf("Class: %s%n", this.getClass());
		System.out.printf("Name: %s%n", this.getName());
		System.out.printf("Legs: %d%n", this.getNrOfLegs());
		System.out.printf("Lay Eggs: %b%n", this.getLayEggs());
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "layEggs", String.valueOf(getLayEggs()));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setLayEggs(Boolean.valueOf(element.getElementsByTagName("layEggs").item(0).getTextContent()));
	}
}