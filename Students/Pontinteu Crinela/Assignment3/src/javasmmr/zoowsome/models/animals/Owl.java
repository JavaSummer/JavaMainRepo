package javasmmr.zoowsome.models.animals;

public class Owl extends Bird{

	public Owl() {
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(40);
			
	}

	public Owl(String name, int nrLegs, boolean migrates, int avgAltitude){
		setName(name);
		setNrOfLegs(nrLegs);
		setMigrates(migrates);
	    setAvgFlightAltitude(avgAltitude);
		
	}

}
