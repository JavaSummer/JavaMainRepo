package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Boomslang extends Reptile {
	/**
	 * 
	 */
	private int legs = 0;
	/**
	 * 
	 */
	private String nameS = " Kaa";

	/**
	 *
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Boomslang(final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setLaysEggs(true);
		setName(nameS);
		setNrOfLegs(legs);
	}

	/**
	 * 
	 * @param name
	 *            The name of the snake.
	 * @param maintenanceCost
	 *            How many hours per week each animal require.
	 * 
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 * 
	 */
	public Boomslang(final String name, final double maintenanceCost, final double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setLaysEggs(true);
		setName(name);
		setNrOfLegs(legs);
	}
}
