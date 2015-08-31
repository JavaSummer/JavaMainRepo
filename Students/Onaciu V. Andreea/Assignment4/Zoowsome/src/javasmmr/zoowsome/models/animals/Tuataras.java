package javasmmr.zoowsome.models.animals;

public class Tuataras extends Reptile{
	public Tuataras(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(4);
		setName("tuataras");
		setLaysEggs(true);
	}
	public Tuataras(int nrOfLegs,String name,double cost,double danger,boolean eggs){
		super( nrOfLegs, name,cost,danger, eggs);
	}
}
