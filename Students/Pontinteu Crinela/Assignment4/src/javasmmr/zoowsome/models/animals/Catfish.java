package javasmmr.zoowsome.models.animals;

public class Catfish extends Aquatic{
	
	public Catfish(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(0);
		setAvgSwimDepth(1000);
		setWaterType(TypesOfWater.freshwater);
			
	}
	
	public Catfish(String name, int nrLegs, int avgDepth, TypesOfWater waterType, double cost, double danger,
			boolean takenCareof ){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
	    setAvgSwimDepth(avgDepth);
	    setWaterType(waterType);
	    setTakenCareOf(takenCareof);
	  
	}

}
