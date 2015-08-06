package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */

public class Butterfly extends Insect {
	/**
	 * 
	 */
	private int legs = 6;
	/**
	 * 
	 */
	private String nameB = "Monarch";

	/**
	 * 
	 */
	public Butterfly() {
		setCanFly(true);
		setNrOfLegs(legs);
		setName(nameB);
		setDangerous(false);
	}

	/**
	 * 
	 * @param name
	 *            The name of the butterfly.
	 */
	public Butterfly(final String name) {
		setCanFly(true);
		setNrOfLegs(legs);
		setName(name);
		setDangerous(false);
	}
}
