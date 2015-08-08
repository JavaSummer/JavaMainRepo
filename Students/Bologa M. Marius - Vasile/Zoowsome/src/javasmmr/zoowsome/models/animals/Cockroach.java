package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Cockroach extends Insect {
	/**
	 * 
	 */
	private int legs = 6;
	/**
	 * 
	 */
	private String nameC = "American Cockroach";

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Cockroach(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setCanFly(false);
		setNrOfLegs(legs);
		setName(nameC);
		setDangerous(false);
	}

	/**
	 * 
	 * @param name
	 *            The name of the Cockroach .
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Cockroach(final String name, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setCanFly(false);
		setNrOfLegs(legs);
		setName(name);
		setDangerous(false);
	}
}
