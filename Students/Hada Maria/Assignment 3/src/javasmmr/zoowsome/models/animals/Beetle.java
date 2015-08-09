package javasmmr.zoowsome.models.animals;

public class Beetle extends Insect{

	public Beetle() {
		setNrOfLegs(6);
		setName("Heracross");
		setCanFly(true);
		setIsDangerous(false);
	}
	
	public Beetle(String name, boolean dangerous, boolean fly) {
		setNrOfLegs(6);
		setName(name);
		setCanFly(fly);
		setIsDangerous(dangerous);
	}

}
