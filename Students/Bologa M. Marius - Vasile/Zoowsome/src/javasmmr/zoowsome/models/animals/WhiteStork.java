package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class WhiteStork extends Bird {
	/**
	 * 
	 */
	private int legs = 2;
	/**
	 * 
	 */
	private String nameW = " Ciconia";

	/**
	 * 
	 */
	private int flightAltitude = 1500;

	/**
	 * 
	 */
	public WhiteStork() {
		setMigrates(true);
		setAvgFlightAltitude(flightAltitude);
		setName(nameW);
		setNrOfLegs(legs);

	}

	/**
	 * 
	 * @param name
	 *            Name of the white stork.
	 * @param altitude
	 *            Average flight altitude.
	 */
	public WhiteStork(final String name, final int altitude) {
		setMigrates(true);
		setAvgFlightAltitude(altitude);
		setName(name);
		setNrOfLegs(legs);
	}
}
