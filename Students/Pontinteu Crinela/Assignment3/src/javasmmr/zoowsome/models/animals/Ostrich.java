package javasmmr.zoowsome.models.animals;

public class Ostrich extends Bird {
	
	public Ostrich() {
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(0);
			
	}
	
	public Ostrich(String name, int nrLegs, boolean migrates, int avgAltitude){
		setName(name);
		setNrOfLegs(nrLegs);
		setMigrates(migrates);
	    setAvgFlightAltitude(avgAltitude);
		
	}

}
