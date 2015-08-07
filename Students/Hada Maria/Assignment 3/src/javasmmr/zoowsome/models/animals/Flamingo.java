package javasmmr.zoowsome.models.animals;

public class Flamingo extends Bird{

	public Flamingo() {
		setNrOfLegs(2);
		setName("Pink Flame");
		setMigrates(true);
		setAvgFlightAltitude(20);  //no idea
	}
	
	public Flamingo(String name, int flightAltitude) {
		setNrOfLegs(2);
		setName(name);
		setMigrates(true);
		setAvgFlightAltitude(flightAltitude); 
	}

}
