package javasmmr.zoowsome.models.animals;

public class Swallow extends Bird{
	public Swallow(){
		setName("SwallowX");
		setNrOfLegs(2);
		migrates= true;
		avgFlightAltitude=40;
	}
	public Swallow(String name){
		setName(name);
		setNrOfLegs(2);
		migrates= true;
		avgFlightAltitude=40;
	}
}
