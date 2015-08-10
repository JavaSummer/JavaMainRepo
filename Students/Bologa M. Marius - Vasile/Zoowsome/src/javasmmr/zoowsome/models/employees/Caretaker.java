package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.UUID;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.animal.Constants;

/**
 * 
 * @author Marius Bologa
 *
 */

public class Caretaker extends Employee implements Caretaker_I {

	/**
	 * 
	 * @param name
	 *            Name.
	 * 
	 * @param id
	 *            ID.
	 * 
	 * @param salary
	 *            Salary.
	 */
	public Caretaker(final String name, final UUID id, 
			final BigDecimal salary) {
		super(name, id, salary);
	}

	/**
	 * 
	 * @return .
	 * @param animal
	 *            The animal.
	 */
	public final String takeCareOf(final Animal animal) {

		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}

		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}

		animal.setTakenCareOf(true);
		double hours = getWorkingHours() - animal.getMaintenanceCost();
		setWorkingHours(hours);
		return Constants.Employees.Caretakers.TCO_SUCCES;
	}

	/**
	 * 
	 */
	private double workingHours;

	/**
	 * 
	 * @return The number of hours a caretaker can work.
	 */
	public final double getWorkingHours() {
		return workingHours;
	}

	/**
	 * 
	 * @param workingHours
	 *            The number of hours a caretaker can work.
	 */
	public final void setWorkingHours(final double workingHours) {
		this.workingHours = workingHours;
	}
}