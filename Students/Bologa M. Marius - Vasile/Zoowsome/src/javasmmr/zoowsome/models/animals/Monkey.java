package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Monkey extends Mammals {
	/**
	 * 
	 */
	private float temperature = 39.8f;
	/**
	 * 
	 */
	private int legs = 4;
	/**
	 * 
	 */
	private String nameM = "King Kong";
	/**
	 * 
	 */
	private float percentage = 75f;

	/**
	 * 
	 */
	public Monkey() {
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(nameM);
		setPercBodyHair(percentage);
	}

	/**
	 * 
	 * @param name
	 *            The name of the monkey.
	 * @param perc
	 *            % of body covered in hair.
	 */
	public Monkey(final String name, final float perc) {
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(name);
		setPercBodyHair(perc);
	}

}
