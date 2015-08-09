package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{

	public Butterfly() {
		setCanFly(true);
		setIsDangerous(false); 
		setNrOfLegs(6);
		setName("Butterfree");
	}
	
	public Butterfly(String name) {
		setCanFly(true);
		setIsDangerous(false);
		setNrOfLegs(6);
		setName(name);
	}

}
