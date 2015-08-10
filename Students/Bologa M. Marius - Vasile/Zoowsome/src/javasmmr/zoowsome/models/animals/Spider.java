package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Spider extends Insect {
	/**
	 * 
	 */
	private int legs = 8;
	/**
	 * 
	 */
	private String nameS = " Regal Jumper";

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Spider(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setCanFly(false);
		setNrOfLegs(legs);
		setName(nameS);
		setDangerous(false);
	}

	/**
	 * 
	 * @param name
	 *            The name of the spider.
	 * @param bites
	 *            Is dangerous or not.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Spider(final String name, final boolean bites, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setCanFly(false);
		setNrOfLegs(legs);
		setName(name);
		setDangerous(bites);
	}
}
