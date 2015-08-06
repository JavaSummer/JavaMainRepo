package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	
	public Shark() {
		setNrOfLegs(0);
		setAvgSwimDepth(2000);
		setWaterType(TypesOfWater.saltwater);
			
	}
	
	public Shark(String name, int nrLegs, int avgDepth, TypesOfWater waterType){
		setName(name);
		setNrOfLegs(nrLegs);
	    setAvgSwimDepth(avgDepth);
	    setWaterType(waterType);
		
	}

}
