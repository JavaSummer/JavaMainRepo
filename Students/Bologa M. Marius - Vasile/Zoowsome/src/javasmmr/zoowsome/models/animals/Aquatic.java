package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Aquatic extends Animal {
	/**
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * @param maintenanceCost
	 *            The maintenance cost.
	 */
	public Aquatic(double dangerPerc, double maintenanceCost) {
		super(dangerPerc, maintenanceCost);
	}

	/**
	 * 
	 */
	private int avgSwimDepth;

	/**
	 * 
	 * @return Average swim depth.
	 */
	public final int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	/**
	 * 
	 * @param avgSwimDepth
	 *            Average swim depth.
	 */
	public final void setAvgSwimDepth(final int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	};

}
