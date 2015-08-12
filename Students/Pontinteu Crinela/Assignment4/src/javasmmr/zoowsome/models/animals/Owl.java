package javasmmr.zoowsome.models.animals;

public class Owl extends Bird{

	public Owl(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(40);
			
	}

	public Owl(String name, int nrLegs, boolean migrates, int avgAltitude,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setMigrates(migrates);
	    setAvgFlightAltitude(avgAltitude);
	    setTakenCareOf(takenCareof);
		
	}

}
