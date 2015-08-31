package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.WaterType.waterType;

public class Salmon extends Aquatic {

	 public Salmon(int nrOfLegs,String name,double cost,double danger,int swimDepth,waterType type){
		 super(nrOfLegs, name,cost,danger, swimDepth, type);
	 }
	 
	public Salmon(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(0);
		setName("Salmon");
		setAvgSwimDepth(14);
		setWaterType(waterType.saltwater);
	}
	
	
}
