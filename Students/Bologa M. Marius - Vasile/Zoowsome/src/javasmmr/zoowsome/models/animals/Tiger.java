package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Tiger extends Mammal {
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
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Tiger(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
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
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Tiger(final String name, final float perc, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNormalBodyTemp(temperature);
		setNrOfLegs(legs);
		setName(name);
		setPercBodyHair(perc);
	}
}
