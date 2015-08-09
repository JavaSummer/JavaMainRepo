package javasmmr.zoowsome.models.animals;

public class Woodpecker extends Bird {
	
	public Woodpecker() {
		setNrOfLegs(2);
		setMigrates(true);
		setAvgFlightAltitude(200);
			
	}
	
	public Woodpecker(String name, int nrLegs, boolean migrates, int avgAltitude){
		setName(name);
		setNrOfLegs(nrLegs);
		setMigrates(migrates);
	    setAvgFlightAltitude(avgAltitude);
		
	}


}
