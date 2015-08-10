package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Bird extends Animal {
	/**
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * @param maintenanceCost
	 *            The maintenance cost.
	 */
	public Bird(double dangerPerc, double maintenanceCost) {
		super(dangerPerc, maintenanceCost);
	}

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
