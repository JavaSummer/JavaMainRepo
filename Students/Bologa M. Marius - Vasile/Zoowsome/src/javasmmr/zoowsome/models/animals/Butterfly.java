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
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 *
	 * 
	 */
	public Butterfly(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setCanFly(true);
		setNrOfLegs(legs);
		setName(nameB);
		setDangerous(false);
	}

	/**
	 * 
	 * @param name
	 *            The name of the butterfly.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Butterfly(final String name, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setCanFly(true);
		setNrOfLegs(legs);
		setName(name);
		setDangerous(false);
	}

}
