package javasmmr.zoowsome.models.animals;

public class Jellyfish extends Aquatic{

	public Jellyfish() {
		setNrOfLegs(0);
		setName("Sting");
		setAvgSwimDepth(150);
		setIsDangerous(true);
	}
	
	public Jellyfish(String name, int swimDepth) {
		setNrOfLegs(0);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setIsDangerous(true);
	}

}
