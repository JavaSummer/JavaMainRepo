package javasmmr.zoowsome.models.animals;

public class Beetle extends Insect {

	public Beetle(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(6);
		setName("Heracross");
		setCanFly(true);
		setIsDangerous(false);
		
	}

	public Beetle(String name, boolean dangerous, boolean fly, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(6);
		setName(name);
		setCanFly(fly);
		setIsDangerous(dangerous);
	
	}

}
