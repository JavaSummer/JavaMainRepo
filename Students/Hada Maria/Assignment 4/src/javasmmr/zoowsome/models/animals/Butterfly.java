package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{

	public Butterfly(double cost, double danger) {
		super(cost, danger);
		setCanFly(true);
		setIsDangerous(false); 
		setNrOfLegs(6);
		setName("Butterfree");
	}
	
	public Butterfly(String name, double cost, double danger) {
		super(cost, danger);
		setCanFly(true);
		setIsDangerous(false);
		setNrOfLegs(6);
		setName(name);
	}

}
