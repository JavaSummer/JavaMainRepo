package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Shark extends Aquatic {
	/**
	 * 
	 */
	private String nameS = "Apex Predator";
	/**
	* 
	*/
	private int swimDepth = 2000;
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
	public Shark(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgSwimDepth(swimDepth);
		setName(nameS);
		setNrOfLegs(0);
		water.setWater(WaterType.saltwater);
	}

	/**
	 * 
	 * @param name
	 *            The name of the shark.
	 * @param depth
	 *            Average swiming depth.
	 * @param typeW
	 *            Type of the water.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Shark(final String name, final int depth, final WaterType typeW, final double maintenanceCost,
			final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgSwimDepth(depth);
		setName(name);
		setNrOfLegs(0);
		water.setWater(typeW);
	}
}
