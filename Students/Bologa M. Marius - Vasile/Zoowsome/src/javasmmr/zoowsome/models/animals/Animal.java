package javasmmr.zoowsome.models.animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Animal implements Killer {
	/**
	 * 
	 * @return If the animal is dangerous.
	 */
	public boolean kill() {
		double danger = Math.random();
		return (danger < dangerPerc);
	}

	/**
	 * 
	 */
	final double maintenanceCost;

	/**
	 * 
	 * @return Maintenance costs.
	 */
	public final double getMaintenanceCost() {
		return maintenanceCost;
	}

	/**
	 * 
	 * @return Danger percent.
	 */
	public final double getDangerPerc() {
		return dangerPerc;
	}

	/**
	 * 
	 */
	final double dangerPerc;

	/**
	 * 
	 * @param maintenanceCost
	 *            How many hours per week will this animal require attention.
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Animal(double maintenanceCost, double dangerPerc) {
		super();
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

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
	 */
	private boolean takenCareOf = false;

	/**
	 * 
	 * @return .
	 */
	public final boolean isTakenCareOf() {
		return takenCareOf;
	}

	/**
	 * 
	 * @param takenCareOf
	 *            .
	 */
	public final void setTakenCareOf(final boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	/**
	 * 
	 * @return The number of legs of the animal.
	 */
	public final int getNrOfLegs() {
		return nrOfLegs;
	}

	/**
	 * 
	 * @param nrOfLegs
	 *            The number of legs of the animal.
	 */
	public final void setNrOfLegs(final int nrOfLegs) {
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
	 * @param name
	 *            The name of the animal.
	 */
	public final void setName(final String name) {
		this.name = name;
	}

	}