package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;
	
	Insect(double maintananceCost, double dangerPerc){
		super(maintananceCost, dangerPerc);
	}
	public void setCanFly(boolean fly){
		canFly = fly;
	}
	public boolean getCanFly(){
		return canFly;
	}
	public void setIsDangerous(boolean dangerous){
		isDangerous = dangerous;
	}
	public boolean getIsDangerous(){
		return isDangerous;
	}
}
