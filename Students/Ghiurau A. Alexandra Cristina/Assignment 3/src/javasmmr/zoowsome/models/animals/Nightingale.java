package javasmmr.zoowsome.models.animals;

public class Nightingale extends Birds{

	public Nightingale(){
		setMammal(false);
		setName("Zazu"); //..from Lion King
		setNrOfLegs(2);
		setAvgFlightAltitude(100);
		setMigrates(true);
	}
	
	public Nightingale(String name, int avgFlightAltit, boolean migrates){
		setMammal(false);
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltit);
		setMigrates(migrates);
	}
}
