package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Reptiles extends Animals {
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
