package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.WaterType.waterType;

public class Shark extends Aquatic {
	public Shark(){
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2000);
		setWaterType(waterType.freshwater);
	}
	public Shark(int nrOfLegs,String name,int swimDepth,waterType type){
		 super(nrOfLegs, name, swimDepth, type);
	 }
}
