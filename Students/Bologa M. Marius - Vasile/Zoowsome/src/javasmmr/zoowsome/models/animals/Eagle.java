package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Eagle extends Bird {
	/**
	 * 
	 */
	private int legs = 2;
	/**
	 * 
	 */
	private String nameE = " Aquila";

	/**
	 * 
	 */
	private int flightAltitude = 2000;

	/**
	 * 
	 */
	public Eagle() {
		setMigrates(false);
		setAvgFlightAltitude(flightAltitude);
		setName(nameE);
		setNrOfLegs(legs);

	}

	/**
	 * 
	 * @param name
	 *            Name of the eagle.
	 * @param migrates
	 *            Migrates or not?
	 * @param altitude
	 *            Average flight altitude.
	 */
   public Eagle(final String name, final boolean migrates, final int altitude) {
		setMigrates(migrates);
		setAvgFlightAltitude(altitude);
		setName(name);
		setNrOfLegs(legs);
	}
}
