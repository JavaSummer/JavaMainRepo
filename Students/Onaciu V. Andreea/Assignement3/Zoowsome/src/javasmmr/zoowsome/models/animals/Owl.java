package javasmmr.zoowsome.models.animals;

public class Owl extends Bird{
	public Owl(){
		setNrOfLegs(2);
		setName("owl");
		setMigrates(true);
		setAvgFlightAltitude(60);
	}
	public Owl(int nrOfLegs,String name,int flightAltitude,boolean migrates){
		super(nrOfLegs,name,flightAltitude,migrates);
	}
}
