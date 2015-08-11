package javasmmr.zoowsome.models.animals;

public class Albatross extends Bird {

	public Albatross(){
		setNrOfLegs(2);
		setName("albatross");
		setMigrates(true);
		setAvgFlightAltitude(100);
	}
	public Albatross(int nrOfLegs,String name,int flightAltitude,boolean migrates){
		super(nrOfLegs,name,flightAltitude,migrates);
	}
}
