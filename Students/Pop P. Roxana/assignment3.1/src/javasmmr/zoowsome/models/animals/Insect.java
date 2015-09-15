package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {

	private Boolean canFly;
	private Boolean isDangerous;

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
		System.out.println("Extra details:");
		System.out.println((getIsDangerous())?"It is dangerous":"It is not dangerous");
		System.out.println((getCanFly())?"It can fly":"It simply can't fly");
		System.out.println();
	}
}
