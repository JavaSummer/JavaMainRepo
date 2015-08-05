package javasmmr.zoowsome.models.animals;
/**
 * 
 * @author Marius Bologa
 *
 */
public class Cockroach extends Insects {
	/**
	 * 
	 */
	private int legs = 6;
	/**
	 * 
	 */
	private String nameC = "American Cockroach";
	/**
	 * 
	 */
	public Cockroach() {
		setCanFly(false);
		setNrOfLegs(legs);
		setName(nameC);
		 setDangerous(false);
	}

	/**
	 * 
	 * @param name
	 *            The name of the Cockroach .
	 */
	public Cockroach(final String name) {
		setCanFly(false);
		setNrOfLegs(legs);
		setName(name);
		 setDangerous(false);
	}
}


