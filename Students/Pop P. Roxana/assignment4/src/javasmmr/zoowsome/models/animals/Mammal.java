package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {

    private  float normalBodyTemp ;
	private float percBodyHair ;
	
	public Mammal(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public float getNormalBodyTemp(){
		return normalBodyTemp;
	}
	
	public void setNormalBodyTemp(float normalBodyTemp){
		this.normalBodyTemp = normalBodyTemp;
	}
	
	public float getPercBodyHair(){
		return percBodyHair;
	}
	
	public void setPercBodyHair(float percBodyHair){
		this.percBodyHair = percBodyHair;
	}
	public void getAnimalAttributes(){
		System.out.println("Species: Aquatic ");
		System.out.println("Name: "+getName());
		System.out.println("Number of legs: "+getNrOfLegs());
		System.out.println("Maintenance cost: "+super.maintenanceCost);
		System.out.println("Danger: "+(super.dangerPerc*100)+"%");
		System.out.println("Extra details:");
		System.out.println("It has a normal temp of: "+getNormalBodyTemp());
		System.out.println("It is covered in hair to a percentage of "+getPercBodyHair());
		System.out.println();
	}
}
