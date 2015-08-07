package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Aquatic extends Animal {
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
