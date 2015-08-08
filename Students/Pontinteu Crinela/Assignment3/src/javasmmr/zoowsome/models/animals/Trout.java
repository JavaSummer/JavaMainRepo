package javasmmr.zoowsome.models.animals;

public class Trout extends Aquatic{
	
	public Trout() {
		setNrOfLegs(0);
		setAvgSwimDepth(100);
		setWaterType(TypesOfWater.freshwater);
			
	}
	
	public Trout(String name, int nrLegs, int avgDepth, TypesOfWater waterType){
		setName(name);
		setNrOfLegs(nrLegs);
	    setAvgSwimDepth(avgDepth);
	    setWaterType(waterType);
		
	}
	
}
