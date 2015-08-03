package javasmmr.zoowsome.models.animals;
/**
 * ..typo mistake, it should've been *turtle*
 * @author Alexa
 *
 */
public class Turtule extends Reptile{

	public Turtule() {
		setMammal(false);
		setNrOfLegs(4);
		setName("Donatello"); //Ninja Turtules..
		setLaysEggs(true);
	}

	public Turtule(String name) {
		setMammal(false);
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}
}
