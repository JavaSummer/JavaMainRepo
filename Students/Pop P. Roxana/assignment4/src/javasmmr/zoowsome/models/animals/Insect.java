package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {

	private Boolean canFly;
	private Boolean isDangerous;
	
	public Insect(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}

	public Boolean getCanFly() {
		return canFly;
	}

	public void setCanFly(Boolean canFly) {
		this.canFly = new Boolean(canFly);
	}

	public Boolean getIsDangerous() {
		return isDangerous;
	}

	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = new Boolean(isDangerous);
	}
	
	public void getAnimalAttributes(){
		System.out.println("Species: Insect ");
		System.out.println("Name: "+getName());
		System.out.println("Number of legs: "+getNrOfLegs());
		System.out.println("Maintenance cost: "+super.maintenanceCost);
		System.out.println("Danger: "+(super.dangerPerc*100)+"%");
		System.out.println("Extra details:");
		System.out.println((getIsDangerous())?"It is dangerous":"It is not dangerous");
		System.out.println((getCanFly())?"It can fly":"It simply can't fly");
		System.out.println();
	}
}
