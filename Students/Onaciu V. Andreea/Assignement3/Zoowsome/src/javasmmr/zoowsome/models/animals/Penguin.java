package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird {
	public Penguin(){
		setNrOfLegs(2);
		setName("penguin");
		setMigrates(true);
		setAvgFlightAltitude(14);
	}
	public Penguin(int nrOfLegs,String name,int flightAltitude,boolean migrates){
		super(nrOfLegs,name,flightAltitude,migrates);
	}
}
