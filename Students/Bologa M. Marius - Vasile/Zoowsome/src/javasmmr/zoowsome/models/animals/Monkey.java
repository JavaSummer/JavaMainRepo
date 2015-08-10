package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Monkey extends Mammal {
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
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Monkey(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
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
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Monkey(final String name, final float perc, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(name);
		setPercBodyHair(perc);
	}

}
