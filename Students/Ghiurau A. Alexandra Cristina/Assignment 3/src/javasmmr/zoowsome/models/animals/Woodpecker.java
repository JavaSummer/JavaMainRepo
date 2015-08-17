package javasmmr.zoowsome.models.animals;

public class Woodpecker extends Bird {
	public Woodpecker(){
		setName("Woody");
		setNrOfLegs(2);
		setAvgFlightAltitude(100);
		setMigrates(true);
	}
	
	public Woodpecker(String name, int avgFlightAltit, boolean migrates){
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltit);
		setMigrates(migrates);
	}
}
