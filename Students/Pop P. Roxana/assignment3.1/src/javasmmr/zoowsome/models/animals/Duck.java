package javasmmr.zoowsome.models.animals;

public class Duck extends Bird {

	public Duck(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {

		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}

	public Duck() {
		this(new Integer(16), "duck", true, new Integer(100));
	}

}