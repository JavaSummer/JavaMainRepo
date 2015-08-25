package javasmmr.zoowsome.models.animals;

public class Goose extends Bird{

	public Goose(){
		super(3, 0.1);
		setName("Goose");
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(10);
		setTakenCareOf(false);
			
		}
	public Goose(double maintananceCost, double dangerPerc, String name, Integer nrOfLegs, boolean migrates, Integer avgFlightAltitude, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setTakenCareOf(false);
		}

}
