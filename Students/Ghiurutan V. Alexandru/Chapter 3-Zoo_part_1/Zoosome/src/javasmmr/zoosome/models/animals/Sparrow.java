package javasmmr.zoosome.models.animals;

public class Sparrow extends Bird {
	public Sparrow(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude) {
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}

	public Sparrow() {
		super(2, "Sparrow", true, 1000);
	}
}
