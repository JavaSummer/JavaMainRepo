package javasmmr.zoowsome.models.animals;

public class Bee extends Insect {

	public Bee() {
		setCanFly(true);
		setIsDangerous(false); // debatable
		setNrOfLegs(6);
		setName("Beedrill");
	}
	
	public Bee(String name, boolean dangerous) {
		setCanFly(true);
		setIsDangerous(dangerous);
		setNrOfLegs(6);
		setName(name);
	}

}
