package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Turtle extends Reptiles {
	/**
	 * 
	 */
	private int legs = 4;
	/**
	 * 
	 */
	private String nameT = " Testudine";

	/**
	 * 
	 */
	public Turtle() {
		setLaysEggs(true);
		setName(nameT);
		setNrOfLegs(legs);
	}
/**
 * 
 * @param name The name of the turtle.
 */
	public Turtle(final String name) {
		setLaysEggs(true);
		setName(name);
		setNrOfLegs(legs);
	}
}
