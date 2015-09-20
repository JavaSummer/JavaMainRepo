package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	
	public Aquatic(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}

	private Integer avgSwimDepth;

	private Water waterType;

	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public Water getWaterType() {
		return waterType;
	}

	public void setWaterType(Water waterType) {
		this.waterType = waterType;
	}
	
	public void getAnimalAttributes(){
		System.out.println("Species: Aquatic ");
		System.out.println("Name: "+getName());
		System.out.println("Number of legs: "+getNrOfLegs());
		System.out.println("Maintenance cost: "+super.maintenanceCost);
		System.out.println("Danger: "+(super.dangerPerc*100)+"%");
		System.out.println("Extra details:");
		System.out.println("Its average swim depth is: "+getAvgSwimDepth());
		System.out.println("It lives in "+getWaterType());
		System.out.println();
	}

}
