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
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Pelican(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
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
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Pelican(final String name, final int altitude, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setAvgFlightAltitude(altitude);
		setMigrates(true);
		setName(name);
		setNrOfLegs(legs);
	}
}
