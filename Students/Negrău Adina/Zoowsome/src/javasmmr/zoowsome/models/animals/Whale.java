package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{

	Whale(){
		super(4, 0.1);
		setName("Whale");
		setNrOfLegs(0);
		setAvgSwimDepth(3000);
		setWaterType(waterType.freshwater);
		setTakenCareOf(false);
		}
	
	Whale(double maintananceCost, double dangerPerc, String name, Integer nrLegs, Integer depth, waterType wt, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrLegs);
		setAvgSwimDepth(depth);
		setWaterType(wt);
		setTakenCareOf(takeCare);
	}
}
