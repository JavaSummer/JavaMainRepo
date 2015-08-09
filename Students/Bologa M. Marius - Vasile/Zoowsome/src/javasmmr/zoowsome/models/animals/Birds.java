package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Birds extends Animals {
	/**
	 * 
	 */
	private boolean migrates;
	/**
	 * 
	 */
	private int avgFlightAltitude;

	/**
	 * 
	 * @return If the bird migrate or not.
	 */
	public final boolean isMigrates() {
		return migrates;
	}

	/**
	 * 
	 * @param migrates
	 *            If the bird migrate or not.
	 */
	public final void setMigrates(final boolean migrates) {
		this.migrates = migrates;
	}

	/**
	 * 
	 * @return Average flight altitude
	 */
	public final int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	/**
	 * 
	 * @param avgFlightAltitude
	 *            Average flight altitude
	 */
	public final void setAvgFlightAltitude(final int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
