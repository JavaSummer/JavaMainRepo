package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Aquatic extends Animals {
	/**
	 * 
	 */
	private int avgSwimDepth;

	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	public enum WaterType {
		/**
		 * 
		 */
		freshwater, /**
					 * 
					 */
		saltwater
	} // Saltwater or freshwater

	/**
	 * 
	 */
	WaterType type;

	/**
	 * 
	 * @return Water type.
	 */
	public final WaterType getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type of the water.
	 */
	public final void setType(final WaterType type) {
		this.type = type;
	}

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
