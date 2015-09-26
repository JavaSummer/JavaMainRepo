package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private int avgSwimDepth;
	private WaterType waterType;

	Aquatic(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf, int avgSwimDepth,
			WaterType waterType) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}

	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public WaterType getWaterType() {
		return this.waterType;
	}

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}

	public void setWaterType(String waterType) {
		this.waterType = WaterType.valueOf(waterType);
	}

	@Override
	public String toString() {
		String attributes = new String();
		attributes = attributes + super.toString();
		attributes = attributes + "Swim Depth: " + this.getAvgSwimDepth() + "\n";
		attributes = attributes + "Water Type: " + this.getWaterType() + "\n\n";

		return attributes;
	}

	public void printAllAttributes() {
		System.out.println(this.toString());
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(element.getElementsByTagName("waterType").item(0).getTextContent());
	}
}
