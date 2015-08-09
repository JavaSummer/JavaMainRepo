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
	WaterTypeTest water = new WaterTypeTest();

	/**
	 * 
	 */
	public Tuna() {
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
	 * 
	 */
	public Tuna(final String name, final int depth) {
		setAvgSwimDepth(depth);
		setName(name);
		setNrOfLegs(0);
		water.setWater(WaterType.saltwater);
	}
}
