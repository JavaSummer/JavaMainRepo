package javasmmr.zoowsome.models.animals;

public class Owl extends Bird{
	public Owl(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(2);
		setName("owl");
		setMigrates(true);
		setAvgFlightAltitude(60);
	}
	public Owl(int nrOfLegs,String name,double cost,double danger,int flightAltitude,boolean migrates){
		super(nrOfLegs,name,cost,danger,flightAltitude,migrates);
	}
}
