package javasmmr.zoowsome.models.animals;
import java.util.Random;

public abstract class Animal implements Killer{
	private Integer nrOfLegs;
	private String name;
	private boolean takenCareOf;
	public final double maintananceCost;
	public final double dangerPerc;
	
	public boolean kill(){
		double nr = Math.random();
		System.out.println(nr);
		if(nr<dangerPerc){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	Animal(double m, double dP){
		maintananceCost = m;
		dangerPerc = dP;
	}
	
	public Integer getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(Integer nr){
		nrOfLegs = nr;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	
	public void setTakenCareOf(boolean careOf){
		takenCareOf = careOf;
	}
	
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	
}
