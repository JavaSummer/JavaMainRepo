package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Mammals extends Animals {
	/**
	 * 
	 */
	private float normalBodyTemp;
	/**
	 * 
	 */
	private float percBodyHair;

	/**
	 * 
	 * @return Normal body temperature.
	 */
	public final float getNormalBodyTemp() {

		return normalBodyTemp;
	}

	/**
	 * 
	 * @param normalBodyTemp
	 *            Normal body temperature.
	 */
	public final void setNormalBodyTemp(final float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	/**
	 * 
	 * @return % of body covered in hair
	 */
	public final float getPercBodyHair() {
		return percBodyHair;
	}

	/**
	 * 
	 * @param percBodyHair
	 *            % of body covered in hair
	 */
	public final void setPercBodyHair(final float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}
}
