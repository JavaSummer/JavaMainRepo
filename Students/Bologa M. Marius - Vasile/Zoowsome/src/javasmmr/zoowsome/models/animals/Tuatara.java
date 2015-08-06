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
	 */
	public Tuatara() {

		setLaysEggs(true);
		setName(nameT);
		setNrOfLegs(legs);
	}

	/**
	 * 
	 * @param name
	 *            The name of the tuatara.
	 */
	public Tuatara(final String name) {
		setLaysEggs(true);
		setName(name);
		setNrOfLegs(legs);
	}

}
