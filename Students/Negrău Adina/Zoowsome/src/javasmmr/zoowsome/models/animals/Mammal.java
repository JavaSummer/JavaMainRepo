package javasmmr.zoowsome.models.animals;
import org.w3c.dom.Element;

public abstract class Mammal extends Animal {

	private float normalBodyTemperature;
	private float percBodyHair;
	
	Mammal(double maintananceCost, double dangerPerc){
		super(maintananceCost, dangerPerc);
	}
	
	public float getTemperature(){
		return normalBodyTemperature;
	}
	
	public float getBodyHair(){
		return percBodyHair;
	}
	
	public void setTemperature(float normalBodyTemperature){
		this.normalBodyTemperature = normalBodyTemperature;
	}
	
	public void setBodyHair(float percBodyHair){
		this.percBodyHair = percBodyHair;
	}
	
	public void decodeFromXml(Element element){
		setTemperature(Float.valueOf(element.getElementsByTagName("normalBodyTemperature").item(0).getTextContent()));
		setBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
	
}
