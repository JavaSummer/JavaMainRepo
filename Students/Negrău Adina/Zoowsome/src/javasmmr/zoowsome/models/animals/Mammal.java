package javasmmr.zoowsome.models.animals;

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
	
	public void setTemperature(float t){
		normalBodyTemperature = t;
	}
	
	public void setBodyHair(float h){
		percBodyHair = h;
	}
}
