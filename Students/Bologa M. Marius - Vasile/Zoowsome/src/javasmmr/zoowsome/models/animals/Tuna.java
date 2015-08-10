package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Tuna extends Aquatic {
	/**
	 * 
	 */
	private String nameF = "Bigeye";
	/**
	* 
	*/
	private int swimDepth = 464;
	/**
	 * 
	 */
	WaterTypeTest water = new WaterTypeTest();

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Tuna(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgSwimDepth(swimDepth);
		setName(nameF);
		setNrOfLegs(0);
		water.setWater(WaterType.saltwater);
	}

	/**
	 * 
	 * @param name
	 *            The name of the tuna.
	 * @param depth
	 *            Average swiming depth.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Tuna(final String name, final int depth, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgSwimDepth(depth);
		setName(name);
		setNrOfLegs(0);
		water.setWater(WaterType.saltwater);

	}
}
