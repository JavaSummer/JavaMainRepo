package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird {

	public Pigeon(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {

		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}

	public Pigeon() {
		this(new Integer(2),"pigeon",false, new Integer(100));
	}

}