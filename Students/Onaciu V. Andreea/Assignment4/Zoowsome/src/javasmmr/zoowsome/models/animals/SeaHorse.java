package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.WaterType.waterType;

public class SeaHorse extends Aquatic{
	public SeaHorse(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(0);
		setName("SeaHorse");
		setAvgSwimDepth(73);
		setWaterType(WaterType.waterType.freshwater);
	}
	public SeaHorse(int nrOfLegs,String name,double cost,double danger,int swimDepth,waterType type){
		 super(nrOfLegs, name,cost,danger, swimDepth, type);
	 }
	 
	
}
