package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Cow extends Mammals {
	/**
	 * 
	 */
	private float temperature = 38.6f;
	/**
	 * 
	 */
	private int legs = 4;
	/**
	 * 
	 */
	private String nameC = "Joiana";
	/**
	 * 
	 */
	private float percentage = 98.2f;

	/**
	 * 
	 */
	public Cow() {
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(nameC);
		setPercBodyHair(percentage);
	}

	/**
	 * 
	 * @param name
	 *            The name of the Cow.
	 * @param perc
	 *            % of body covered in hair
	 */
	public Cow(final String name, final float perc) {
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(name);
		setPercBodyHair(perc);
	}

}
