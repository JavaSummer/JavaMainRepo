package javasmmr.zoowsome.models.animals;
import java.util.Random;

public abstract class Animal implements Killer{
	
	private Integer nrOfLegs;
	private String name;
	public final double maintenanceCost;//I attempted to use Double but I did not succeed :(
	final double dangerPerc;
	public Boolean takenCareOf = false;
	
	public Animal(double maintenanceCost, double dangerPerc){
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	
	public boolean kill(){
		
		Random generator = new Random();
		double no = generator.nextDouble();
		if (no<(dangerPerc+getPredisposition())){//like this? :?
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public double getPredisposition(){
		return 0;
	}
	
	public Boolean getTakenCareOf(){
		return takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf){
		this.takenCareOf = new Boolean(takenCareOf);
	}
	public Integer getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(Integer nrOfLegs){
		this.nrOfLegs = new Integer(nrOfLegs);
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String s){
		name = new String(s);
	}
	
	public abstract void getAnimalAttributes();
}
