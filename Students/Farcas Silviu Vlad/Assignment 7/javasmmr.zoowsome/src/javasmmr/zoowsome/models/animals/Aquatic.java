package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.WaterType.water;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.*;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	private water waterType;

	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setWaterType(water waterType) {
		this.waterType = waterType;
	}

	public water getWaterType() {
		return waterType;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(water.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}

}
