package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {

	private Boolean laysEggs;
	
	public Reptile(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public Boolean getLaysEggs(){
		return laysEggs;
	}
	
	public void setLaysEggs(Boolean laysEggs){
		this.laysEggs = new Boolean (laysEggs);
	}
	
	public void getAnimalAttributes(){
		System.out.println("Species: Reptile ");
		System.out.println("Name: "+getName());
		System.out.println("Number of legs: "+getNrOfLegs());
		System.out.println("Maintenance cost: "+super.maintenanceCost);
		System.out.println("Danger: "+(super.dangerPerc*100)+"%");
		System.out.println("Extra details:");
		System.out.println((getLaysEggs())?"It lays eggs":"It does not lay eggs");
		System.out.println();
	}
}
