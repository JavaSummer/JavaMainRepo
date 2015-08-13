package javasmmr.zoowsome.models.animals;

public class Amphisbaenian extends Reptile {
	public Amphisbaenian(){
		setNrOfLegs(4);
		setName("Amphisbaenian");
		setLaysEggs(true);
	}
	
	public Amphisbaenian(int nrOfLegs,String name,boolean eggs){
		super( nrOfLegs, name, eggs);
	}
}
