package javasmmr.zoowsome.models.animals;

public class Sparrow extends Bird {

	public Sparrow(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {

		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}

	public Sparrow() {
		this(new Integer(2),"sparrow",true, new Integer(100));
	}

}
