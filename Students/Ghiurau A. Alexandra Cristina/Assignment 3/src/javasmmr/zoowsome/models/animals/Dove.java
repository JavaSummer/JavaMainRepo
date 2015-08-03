package javasmmr.zoowsome.models.animals;

public class Dove extends Birds {
	
	public Dove(){
		setMammal(false);
		setName("Sansa");
		setNrOfLegs(2);
		setAvgFlightAltitude(100);
		setMigrates(false);
	}
	
	public Dove(String name, int avgFlightAltit, boolean migrates){
		setMammal(false);
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltit);
		setMigrates(migrates);
	}
}
