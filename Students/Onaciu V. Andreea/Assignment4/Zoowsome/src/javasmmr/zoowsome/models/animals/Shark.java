package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.WaterType.waterType;

public class Shark extends Aquatic {
	public Shark(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2000);
		setWaterType(waterType.freshwater);
	}
	public Shark(int nrOfLegs,String name,double cost,double danger,int swimDepth,waterType type){
		 super(nrOfLegs, name, cost,danger,swimDepth, type);
	 }
}
