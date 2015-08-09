package javasmmr.zoowsome.models.animals;

public abstract class Animals implements Killer{
	private int nrOfLegs;
	private String name;
	private final double maintenanceCost;
	private final double dangerPerc;
	private boolean takenCareOf = false;
	
	public Animals(double maintenanceCost,double dangerPerc){
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	public double getMaintenaceCost(){
		return maintenanceCost;
	}
	public double getDangrPerc(){
		return dangerPerc;
	}
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrLegs(int a){
		nrOfLegs = a;
	}
	public String getName(){
		return name;
	}
	public void setName(String a){
		name = a;
	}
	public void setTakenCareOf(boolean takenCareOf){
		this.takenCareOf = takenCareOf;
	}
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	public boolean kill(){
		if(Math.random() <dangerPerc + getPredisposition())
			return true;
		else
			return false;
	}
	public double getPredisposition(){
		return 0.0;
	}
	public static String[] animalNames = {"Sammy","Croco","Dino","Fluffy","Kitty","Bob","Dylan","Ritta","Dan",
			"Cindy","Ana","Amy","Mary","Lucy","Ra",};
	
}
