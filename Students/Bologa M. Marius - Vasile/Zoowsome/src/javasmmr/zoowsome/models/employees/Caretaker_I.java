package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.models.animals.Animal;

/**
 * 
 * @author Marius Bologa
 *
 */
public interface Caretaker_I {
	/**
	 * 
	 * @param animal
	 *            An animal.
	 */
	public  String takeCareOf(Animal animal);
}
