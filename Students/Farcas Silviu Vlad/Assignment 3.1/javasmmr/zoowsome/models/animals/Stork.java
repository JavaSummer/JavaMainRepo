package javasmmr.zoowsome.models.animals;

public class Stork extends Bird{
	public Stork(){
		setName("StorkX");
		setNrOfLegs(2);
		migrates = true;
		avgFlightAltitude=35;
	}
	public Stork(String name){
		setName(name);
		setNrOfLegs(2);
		migrates = true;
		avgFlightAltitude=35;
	}
}
