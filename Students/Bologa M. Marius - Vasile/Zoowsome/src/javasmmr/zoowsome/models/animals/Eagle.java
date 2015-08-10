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
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Eagle(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
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
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Eagle(final String name, final boolean migrates, final int altitude, final double maintenanceCost,
			final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setMigrates(migrates);
		setAvgFlightAltitude(altitude);
		setName(name);
		setNrOfLegs(legs);
	}
}
