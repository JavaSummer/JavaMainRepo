package javasmmr.zoowsome.models.animals;
/**
 * 
 * @author Marius Bologa
 *
 */
public class Boomslang extends Reptiles {
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
	 */
	public Boomslang() {

		setLaysEggs(true);
		setName(nameS);
		setNrOfLegs(legs);
	}

	/**
	 * 
	 * @param name
	 *            The name of the snake.
	 */
	public Boomslang(final String name) {
		setLaysEggs(true);
		setName(name);
		setNrOfLegs(legs);
	}
}


