package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.*;

import org.w3c.dom.Element;

abstract public class Aquatic extends Animal {

	private int avgSwimDepth;
	private TypesOfWater waterType;

	public Aquatic(double cost, double danger) {
		super(cost, danger);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
	}
	
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(TypesOfWater.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
		}

	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public TypesOfWater getWaterType() {
		return waterType;
	}

	public void setWaterType(TypesOfWater waterType) {
		this.waterType = waterType;
	}

}
