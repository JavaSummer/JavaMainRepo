package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Tuatara extends Reptile {
	/**
	 * 
	 */
	private int legs = 4;
	/**
	 * 
	 */
	private String nameT = " Triasic";

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Tuatara(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);

		setLaysEggs(true);
		setName(nameT);
		setNrOfLegs(legs);
	}

	/**
	 * 
	 * @param name
	 *            The name of the tuatara.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Tuatara(final String name, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setLaysEggs(true);
		setName(name);
		setNrOfLegs(legs);
	}

}
