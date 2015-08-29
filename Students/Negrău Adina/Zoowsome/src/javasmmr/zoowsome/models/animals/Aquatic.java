package javasmmr.zoowsome.models.animals;
import javax.xml.stream.XMLEventWriter;

import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	private waterType w;
	
	Aquatic(double maintananceCost, double dangerPerc){
		super(maintananceCost, dangerPerc);
	}
	
	public enum waterType{
		saltwater, freshwater;
	}
	
	public void setWaterType(waterType waterType){
		this.w = waterType;
	}
	
	public waterType getWaterType(){
		return w;
	}
	
	public void setAvgSwimDepth(Integer avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	public Integer getAvgSwimDepth(){
		return avgSwimDepth;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "w", String.valueOf(getWaterType()));
	}
	
	public void decodeFromXml(Element element){
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(waterType.valueOf(element.getElementsByTagName("w").item(0).getTextContent()));
	}
}
