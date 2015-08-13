package javasmmr.zoowsome.models.animals;

abstract public class Animal implements Killer{

	//instance variables
	
	private int nrOfLegs;
	private String name;
	private boolean takenCareOf = false;
	
	//constants
	
	private final double maintenanceCost;
	private final double dangerPerc;
	
	//constructor
	
	public Animal(double theMaintenanceCost, double theDangerPerc){
		maintenanceCost = theMaintenanceCost;
		dangerPerc = theDangerPerc;
	}
	
	//getters/setters
	
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	
	public void setTakenCareOf(boolean takesCare){
		takenCareOf = takesCare;
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

	public void setNrOfLegs(int theNrOfLegs) {
		nrOfLegs = theNrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String theName) {
		name = theName;
	}
	
	//implement the interface method "kill"

		public boolean kill() {
			if(Math.random() < getDangerPerc())return true;
			return false;
		}

}
