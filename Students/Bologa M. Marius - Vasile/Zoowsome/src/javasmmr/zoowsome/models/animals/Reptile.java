package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Reptile extends Animal {
	/**
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * @param maintenanceCost
	 *            The maintenance cost.
	 */
	public Reptile(double dangerPerc, double maintenanceCost) {
		super(dangerPerc, maintenanceCost);
	}

	/**
	 * 
	 */
	private boolean laysEggs;

	/**
	 * 
	 * @return If does it lay eggs or no
	 */
	public final boolean isLaysEggs() {
		return laysEggs;
	}

	/**
	 * 
	 * @param laysEggs
	 *            If does it lay eggs or no
	 */
	public final void setLaysEggs(final boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

}
