package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer {
	
	private static final double DEFAULT_MAINTENANCE_COST = 4.5;
	private static final double DEFAULT_DANGER_PERC = 0.2;
	
	private int nrOfLegs;
	private String name;
	private final double maintenanceCost;
	private final double dangerPerc;
	private boolean takenCareOf = false;
	
	public Animal() {
		this.maintenanceCost = DEFAULT_MAINTENANCE_COST;
		this.dangerPerc = DEFAULT_DANGER_PERC;
		//always initialize takenCareOf with 'false' automatically
		this.takenCareOf = false;
	}
	
	public Animal(double maintenanceCost, double dangerPerc) {
		if (maintenanceCost > 8.0) 
			this.maintenanceCost = 8.0;
		else this.maintenanceCost = maintenanceCost;
		
		if( dangerPerc < 0)
			this.dangerPerc = 0;
		else if (dangerPerc > 1) 
			this.dangerPerc = 1;
		else this.dangerPerc = dangerPerc;
		//always initialize takenCareOf with 'false' automatically
		this.takenCareOf = false;
	}
	
	public boolean kill() {
		double randomDangerPerc = Math.random();
		if (randomDangerPerc < dangerPerc) return true;
		else return false;
	}
	
	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	
	public boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public double getDangerPerc() {
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
}
