package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.WaterType.waterType;

public class SeaHorse extends Aquatic{
	public SeaHorse(){
		setNrOfLegs(0);
		setName("SeaHorse");
		setAvgSwimDepth(73);
		setWaterType(WaterType.waterType.freshwater);
	}
	public SeaHorse(int nrOfLegs,String name,int swimDepth,waterType type){
		 super(nrOfLegs, name, swimDepth, type);
	 }
	 
	
}
