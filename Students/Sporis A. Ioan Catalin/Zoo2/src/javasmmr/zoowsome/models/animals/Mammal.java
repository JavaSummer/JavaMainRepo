package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animals {
	float normalBodyTemp;
	float percBodyHair;
	public Mammal(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
	}
	public void setNormalBodyTemp(float a){
		normalBodyTemp = a;
	}
	public float getNormalBodyTemp(){
		return normalBodyTemp;
	}
	
	public void setPercBodyHair(float a){
		percBodyHair = a;
	}
	public float getPercBodyHair(){
		return percBodyHair;
	}
}
