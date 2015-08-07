package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer {

	private int nrOfLegs;
	private String name;
	private final double maintenanceCost;
	private final double dangerPerc;
	private boolean takenCareOf;

	public Animal(double cost, double danger) {
		maintenanceCost = cost;
		dangerPerc = danger;
		setTakenCareOf(false);
	}

	public void setNrOfLegs(int legs) {
		nrOfLegs = legs;
	}

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setName(String theName) {
		name = theName;
	}

	public String getName() {
		return name;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public double getDangerPerc() {
		return dangerPerc + getPredisposition();
	}

	public boolean kill() {
		Random r = new Random();
		int random = r.nextInt(2);
		boolean kill = false;
		if (random < dangerPerc + getPredisposition()) {
			kill = true;
		} else {
			kill = false;
		}
		return kill;
	}

	public void setTakenCareOf(boolean takenCare) {
		takenCareOf = takenCare;
	}

	public boolean getTakenCareOf() {
		return takenCareOf;
	}

	public double getPredisposition() {
		return 0;
	}
}
