package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Pelican extends Bird {
	/**
	 * 
	 */
	private int legs = 2;
	/**
	 * 
	 */
	private String nameP = " Dalmatian Pelican";

	/**
	 * 
	 */
	private int flightAltitude = 1200;

	/**
	 * 
	 */
	public Pelican() {
		setAvgFlightAltitude(flightAltitude);
		setMigrates(true);
		setName(nameP);
		setNrOfLegs(legs);
	}

	/**
	 * 
	 * @param name
	 *            Name of the pelican.
	 * @param altitude
	 *            Average flight altitude.
	 */
	public Pelican(final String name, final int altitude) {
		setAvgFlightAltitude(altitude);
		setMigrates(true);
		setName(name);
		setNrOfLegs(legs);
	}
}
