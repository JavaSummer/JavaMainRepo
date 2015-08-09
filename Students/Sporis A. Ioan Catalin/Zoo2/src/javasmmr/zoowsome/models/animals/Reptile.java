package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animals {
	Boolean laysEggs;
	public Reptile(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
	}
	public Boolean getLaysEggs(){
		return laysEggs;
	}
	public void setLaysEgg(Boolean a){
		laysEggs = a;
	}
}
