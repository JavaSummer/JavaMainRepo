package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Spider extends Insect {
	/**
	 * 
	 */
	private int legs = 8;
	/**
	 * 
	 */
	private String nameS = " Regal Jumper";

	/**
	 * 
	 */
	public Spider() {
		setCanFly(false);
		setNrOfLegs(legs);
		setName(nameS);
		setDangerous(false);
	}

	/**
	 * 
	 * @param name
	 *            The name of the spider.
	 * @param bites
	 *            Is dangerous or not.
	 */
	public Spider(final String name, final boolean bites) {
		setCanFly(false);
		setNrOfLegs(legs);
		setName(name);
		setDangerous(bites);
	}
}
