package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract public class Aquatic extends Animal {
	//constructor

	public Aquatic(double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
	}

	//instance variables
	private int avgSwimDepth;
	private TypeOfWater waterType;
	
	//getters/setters

	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(int theAvgSwimDepth) {
		avgSwimDepth = theAvgSwimDepth;
	}

	public TypeOfWater getWaterType() {
		return waterType;
	}

	public void setWaterType(TypeOfWater theWaterType) {
		waterType = theWaterType;
	}
	
	//override the method encodeToXml
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(this.avgSwimDepth));
		createNode(eventWriter, "waterType", String.valueOf(this.waterType));
	}
	
	//override the method decodeFromXml
	
	public void decodeFromXml(Element element){
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(TypeOfWater.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
	
	 
}
