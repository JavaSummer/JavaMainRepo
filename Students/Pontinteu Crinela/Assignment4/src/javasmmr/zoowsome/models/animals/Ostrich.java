package javasmmr.zoowsome.models.animals;

public class Ostrich extends Bird {
	
	public Ostrich(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(0);
			
	}
	
	public Ostrich(String name, int nrLegs, boolean migrates, int avgAltitude,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setMigrates(migrates);
	    setAvgFlightAltitude(avgAltitude);
	    setTakenCareOf(takenCareof);
		
	}

}
