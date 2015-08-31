package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird {
	public Penguin(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(2);
		setName("penguin");
		setMigrates(true);
		setAvgFlightAltitude(14);
	}
	public Penguin(int nrOfLegs,String name,double cost,double danger,int flightAltitude,boolean migrates){
		super(nrOfLegs,name,cost,danger,flightAltitude,migrates);
	}
}
