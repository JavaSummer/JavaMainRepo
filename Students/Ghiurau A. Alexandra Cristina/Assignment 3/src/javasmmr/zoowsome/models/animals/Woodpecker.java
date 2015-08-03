package javasmmr.zoowsome.models.animals;

public class Woodpecker extends Birds {
	public Woodpecker(){
		setMammal(false);
		setName("Woody");
		setNrOfLegs(2);
		setAvgFlightAltitude(100);
		setMigrates(true);
	}
	
	public Woodpecker(String name, int avgFlightAltit, boolean migrates){
		setMammal(false);
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltit);
		setMigrates(migrates);
	}
}
