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
	 */
	public NorthernPike() {
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
	 *
	 */
	public NorthernPike(final String name, final int depth) {
		setAvgSwimDepth(depth);
		setName(name);
		setNrOfLegs(0);
		water.setWater(WaterType.freshwater);
	}
}
