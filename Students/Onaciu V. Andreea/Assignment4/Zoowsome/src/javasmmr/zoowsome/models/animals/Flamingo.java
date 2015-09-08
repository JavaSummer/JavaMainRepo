package javasmmr.zoowsome.models.animals;

public class Flamingo extends Bird {
	public Flamingo(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(2);
		setName("flamingo");
		setMigrates(true);
		setAvgFlightAltitude(300);
	}
	
	public Flamingo(int nrOfLegs,String name,double cost,double danger,int flightAltitude,boolean migrates){
		super(nrOfLegs, name,cost,danger, flightAltitude, migrates);
	}
}
