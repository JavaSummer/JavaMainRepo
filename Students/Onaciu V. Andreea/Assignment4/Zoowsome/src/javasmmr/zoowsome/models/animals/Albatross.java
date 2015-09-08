package javasmmr.zoowsome.models.animals;

public class Albatross extends Bird {

	public Albatross(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(2);
		setName("albatross");
		setMigrates(true);
		setAvgFlightAltitude(100);
	}
	public Albatross(int nrOfLegs,String name,double cost,double danger,int flightAltitude,boolean migrates){
		super(nrOfLegs,name,cost,danger,flightAltitude,migrates);
	}
}
