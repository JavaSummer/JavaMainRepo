package javasmmr.zoowsome.models.animals;

public class Tuataras extends Reptile{
	public Tuataras(){
		setNrOfLegs(4);
		setName("tuataras");
		setLaysEggs(true);
	}
	public Tuataras(int nrOfLegs,String name,boolean eggs){
		super( nrOfLegs, name, eggs);
	}
}
