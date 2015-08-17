package javasmmr.zoowsome.models.animals;
/**
 * ..typo mistake, it should've been *turtle*
 * @author Alexa
 *
 */
public class Turtule extends Reptile{

	public Turtule() {
		setNrOfLegs(4);
		setName("Donatello"); //Ninja Turtules..
		setLaysEggs(true);
	}

	public Turtule(String name) {
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}
}
