package javasmmr.zoowsome.models.animals;

public class Nightingale extends Bird{

	public Nightingale(){
		setName("Zazu"); //..from Lion King
		setNrOfLegs(2);
		setAvgFlightAltitude(100);
		setMigrates(true);
	}
	
	public Nightingale(String name, int avgFlightAltit, boolean migrates){
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltit);
		setMigrates(migrates);
	}
}
