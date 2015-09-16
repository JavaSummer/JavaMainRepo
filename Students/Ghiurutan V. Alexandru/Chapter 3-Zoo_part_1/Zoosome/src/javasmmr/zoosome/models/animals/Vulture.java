package javasmmr.zoosome.models.animals;

public class Vulture extends Bird {
	public Vulture(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude) {
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}

	public Vulture() {
		super(2, "Vulture", false, 11000);
	}
}
