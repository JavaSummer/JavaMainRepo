package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class NorthernPike extends Aquatic {
	/**
	 * 
	 */
	private String nameP = "Esox";
	/**
	* 
	*/
	private int swimDepth = 20;
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
	public NorthernPike(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgSwimDepth(swimDepth);
		setName(nameP);
		setNrOfLegs(0);
		water.setWater(WaterType.freshwater);
	}

	/**
	 * 
	 * @param name
	 *            The name of the pike.
	 * @param depth
	 *            Average swiming depth.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 *
	 */
	public NorthernPike(final String name, final int depth, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgSwimDepth(depth);
		setName(name);
		setNrOfLegs(0);
		water.setWater(WaterType.freshwater);
	}
}
