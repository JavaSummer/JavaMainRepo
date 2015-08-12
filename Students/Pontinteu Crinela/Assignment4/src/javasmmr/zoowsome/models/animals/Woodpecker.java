package javasmmr.zoowsome.models.animals;

public class Woodpecker extends Bird {
	
	public Woodpecker(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(2);
		setMigrates(true);
		setAvgFlightAltitude(200);
			
	}
	
	public Woodpecker(String name, int nrLegs, boolean migrates, int avgAltitude,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setMigrates(migrates);
	    setAvgFlightAltitude(avgAltitude);
	    setTakenCareOf(takenCareof);
		
	}


}
