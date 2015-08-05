package javasmmr.zoowsome.models.animals;
/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Insects extends Animals {
/**
 * 
 */
	private boolean canFly;
	/**
	 * 
	 */
	private boolean isDangerous;
	/**
	 * 
	 * @return If the insect can fly.
	 */
	public final boolean isCanFly() {
		return canFly;
	}
	/**
	 * 
	 * @param canFly If the insect can fly.
	 */
	public final void setCanFly(final boolean canFly) {
		this.canFly = canFly;
	}
	/**
	 * 
	 * @return If it is  dangerous.
	 */
	public final boolean isDangerous() {
		return isDangerous;
	}
	/**
	 * 
	 * @param isDangerous If it is  dangerous.
	 */
	public final void setDangerous(final boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
}
