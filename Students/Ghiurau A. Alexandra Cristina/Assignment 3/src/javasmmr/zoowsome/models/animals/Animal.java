package javasmmr.zoowsome.models.animals;

public class Animal implements Killer {
	private int nrOfLegs;
	String name;

	final double maintenanceCost;
	private boolean takenCareOf = false;
	final double dangerPerc;
	

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public double getDangerPerc() {
		return dangerPerc;
	}

	public boolean isTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public Animal(double maintenanceCost, double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;

	}

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean kill() {
		// Math.random() method returns a double value with a positive sign,
		// greater than or equal to 0.0 and less than 1.0.
		if (Math.random() < dangerPerc)
			return true;
		else
			return false;
	}
}
