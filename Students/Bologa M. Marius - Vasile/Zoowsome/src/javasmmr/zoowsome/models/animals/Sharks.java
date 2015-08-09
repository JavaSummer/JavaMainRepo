package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Sharks extends Aquatic {
	/**
	 * 
	 */
	private String nameS = "Apex Predator";
	/**
	* 
	*/
	private int swimDepth = 2000;

	/**
	 * 
	 */
	public Sharks() {
		setAvgSwimDepth(swimDepth);
		setName(nameS);
		setNrOfLegs(0);
		setType(WaterType.saltwater);
	}

	/**
	 * 
	 * @param name
	 *            The name of the shark.
	 * @param depth
	 *            Average swiming depth.
	 * @param typeW
	 *            Type of the water.
	 */
	public Sharks(final String name, final int depth, final WaterType typeW) {
		setAvgSwimDepth(depth);
		setName(name);
		setNrOfLegs(0);
		setType(typeW);
	}
}
