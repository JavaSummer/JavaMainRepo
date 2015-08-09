package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer {

	private int nrOfLegs;
	private String name;
	private final double maintenanceCost;
	private final double dangerPerc;
	private boolean takenCareOf;

	public Animal(double maintenanceCost, double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
		setTakenCareOf(false);
	}
	
	public double getMaintenanceCost(){
		return maintenanceCost;
	}

	public double getDangerPerc(){
		return dangerPerc;
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
		return (Math.random() < dangerPerc + getPredisposition());
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public boolean getTakenCareOf() {
		return takenCareOf;
	}
	public double getPredisposition(){
		return 0;
	}
}
