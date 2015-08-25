package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird{

	public Pigeon(){
		super(3, 0);
		setName("Pigeon");
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(6000);
		setTakenCareOf(false);
	}
	
	public Pigeon(double maintananceCost,double dangerPerc, String name, Integer nrOfLegs, boolean migrates, Integer avgFlightAltitude, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setTakenCareOf(false);
	}
}
