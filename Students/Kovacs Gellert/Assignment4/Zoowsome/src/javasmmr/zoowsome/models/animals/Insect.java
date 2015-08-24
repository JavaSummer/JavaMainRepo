package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	
	private boolean canFly;
	private boolean isDangerous;
	
	public Insect() {
		
	}
	
	public Insect(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	public boolean getCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	public boolean getDangerous() {
		return isDangerous;
	}
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}	
}
