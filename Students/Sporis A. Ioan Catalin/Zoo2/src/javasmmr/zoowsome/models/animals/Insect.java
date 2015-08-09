package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animals {
	Boolean canFly;
	Boolean isDangerous;
	public Insect(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
	}
	public void setCanFly(Boolean a){
		canFly = a;
	}
	public Boolean getCanFly(){
		return canFly;
	}
	public void setIsDangerous(Boolean a){
		isDangerous = a;
	}
	public Boolean getIsDangerous(){
		return isDangerous;
	}
}
