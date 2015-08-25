package javasmmr.zoowsome.models.animals;

public class Duck extends Bird{
	public Duck(){
		super(3, 0.1);
		setName("Duck");
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(10);
		setTakenCareOf(false);
		
	}
	public Duck(double maintananceCost, double dangerPerc, String name, Integer nrOfLegs, boolean migrates, Integer avgFlightAltitude, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setTakenCareOf(takeCare);
	}

}
