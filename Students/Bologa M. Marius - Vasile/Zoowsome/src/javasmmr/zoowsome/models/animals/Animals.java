package javasmmr.zoowsome.models.animals;
/**
 * 
 * @author  Marius Bologa
 *
 */
public abstract class Animals {
 /**
  * 
  */
	private int nrOfLegs;
	/**
	 * 
	 */
  private String name;
  /**
   * 
   * @return The number of legs of the animal.
   */
public final  int getNrOfLegs() {
	return nrOfLegs;
}
/**
 * 
 * @param nrOfLegs The number of legs of the animal.
 */
public final  void setNrOfLegs(final int nrOfLegs) {
	this.nrOfLegs = nrOfLegs;
}
/**
 * 
 * @return The name of the animal.
 */
public final String getName() {
	return name;
}
/**
 * 
 * @param name The name of the animal.
 */
public final void setName(final String name) {
	this.name = name;
}
}
