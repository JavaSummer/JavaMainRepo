package javasmmr.zoowsome.models.animals;

public class Flamingo extends Bird {
	public Flamingo(){
		setNrOfLegs(2);
		setName("flamingo");
		setMigrates(true);
		setAvgFlightAltitude(300);
	}
	
	public Flamingo(int nrOfLegs,String name,int flightAltitude,boolean migrates){
		super(nrOfLegs, name, flightAltitude, migrates);
	}
}
