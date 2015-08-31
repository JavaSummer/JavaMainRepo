package javasmmr.zoowsome.models.animals;

public class Amphisbaenian extends Reptile {
	public Amphisbaenian(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(4);
		setName("Amphisbaenian");
		setLaysEggs(true);
	}
	
	public Amphisbaenian(int nrOfLegs,String name,double cost,double danger,boolean eggs){
		super( nrOfLegs, name,cost,danger, eggs);
	}
}
