package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Tiger extends Mammals {
	/**
	 * 
	 */
	private float temperature = 37.5f;
	/**
	 * 
	 */
	private int legs = 4;
	/**
	 * 
	 */
	private String nameT = "Cecil";
	/**
	 * 
	 */
	private float percentage = 92.8f;

	/**
	 * 
	 */
	public Tiger() {
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(nameT);
		setPercBodyHair(percentage);
	}

	/**
	 * 
	 * @param name
	 *            The name of the tiger.
	 * @param perc
	 *            % of body covered in hair.
	 */
	public Tiger(final String name, final float perc) {
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(name);
		setPercBodyHair(perc);
	}
}
