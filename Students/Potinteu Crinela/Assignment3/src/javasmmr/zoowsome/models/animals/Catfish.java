package javasmmr.zoowsome.models.animals;

public class Catfish extends Aquatic{
	
	public Catfish() {
		setNrOfLegs(0);
		setAvgSwimDepth(1000);
		setWaterType(TypesOfWater.freshwater);
			
	}
	
	public Catfish(String name, int nrLegs, int avgDepth, TypesOfWater waterType){
		setName(name);
		setNrOfLegs(nrLegs);
	    setAvgSwimDepth(avgDepth);
	    setWaterType(waterType);
		
	}

}
