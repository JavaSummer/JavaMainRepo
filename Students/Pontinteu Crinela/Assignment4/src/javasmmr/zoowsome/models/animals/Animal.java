package javasmmr.zoowsome.models.animals;

abstract public class Animal implements Killer {

	private int nrOfLegs;
	private String name;
	private final double maintenanceCost;
	private final double dangerPerc;
	private boolean takenCareOf;

	public Animal(double cost, double danger) {
		this.maintenanceCost = cost;
		this.dangerPerc = danger;

	}

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int nrLegs) {
		this.nrOfLegs = nrLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public double getDangerPerc() {
		return dangerPerc + getPredisposition();
	}

	public boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	@Override
	public boolean kill() {
		float randNr = (float) Math.random();
		if (randNr < getDangerPerc()) {
			return true;
		} else
			return false;
	}
	
	@Override
	public double  getPredisposition(){
		return 0;
	}

}
