package javasmmr.zoowsome.models.animals;

public class Trout extends Aquatic{
	
	public Trout(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(0);
		setAvgSwimDepth(100);
		setWaterType(TypesOfWater.freshwater);
			
	}
	
	public Trout(String name, int nrLegs, int avgDepth, TypesOfWater waterType,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
	    setAvgSwimDepth(avgDepth);
	    setWaterType(waterType);
	    setTakenCareOf(takenCareof);
		
	}
	
}
