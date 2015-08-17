package javasmmr.zoowsome.models.animals;

public class Dove extends Bird {
	
	public Dove(){
		setName("Sansa");
		setNrOfLegs(2);
		setAvgFlightAltitude(100);
		setMigrates(false);
	}
	
	public Dove(String name, int avgFlightAltit, boolean migrates){
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltit);
		setMigrates(migrates);
	}
}
