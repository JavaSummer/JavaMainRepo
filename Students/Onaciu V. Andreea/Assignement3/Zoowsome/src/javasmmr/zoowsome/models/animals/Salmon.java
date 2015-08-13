package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.WaterType.waterType;

public class Salmon extends Aquatic {

	 public Salmon(int nrOfLegs,String name,int swimDepth,waterType type){
		 super(nrOfLegs, name, swimDepth, type);
	 }
	 
	public Salmon(){
		setNrOfLegs(0);
		setName("Salmon");
		setAvgSwimDepth(14);
		setWaterType(waterType.saltwater);
	}
	
	
}
