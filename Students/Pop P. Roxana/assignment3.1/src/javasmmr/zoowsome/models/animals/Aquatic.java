package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

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
		System.out.println("Extra details:");
		System.out.println("Its average swim depth is: "+getAvgSwimDepth());
		System.out.println("It lives in "+getWaterType());
		System.out.println();
	}

}
