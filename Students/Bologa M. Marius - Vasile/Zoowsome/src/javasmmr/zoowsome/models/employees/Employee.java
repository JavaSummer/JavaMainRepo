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
public abstract class Employee {
	/**
	 * 
	 * @param name
	 *            The name of the employee.
	 * 
	 * @param id
	 *            Id.
	 * @param salary
	 *            The salary.
	 */
	public Employee(final String name, final UUID id, final BigDecimal salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private boolean isDead = false;
	/**
	 * 
	 */
	UUID id;

	/**
	 * 
	 * @return The name of the employee.
	 */
	public final String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            Of the employee.
	 */
	public final void setName(final String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return If he/she is dead.
	 */
	public final boolean isDead() {
		return isDead;
	}

	/**
	 * 
	 * @param isDead
	 *            .
	 */
	public final void setDead(final boolean isDead) {
		this.isDead = isDead;
	}

	/**
	 * 
	 * @return The id.
	 */
	public final UUID getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The ID.
	 */

	public final void setId(final UUID id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The salary of the employee.
	 */
	public final BigDecimal getSalary() {
		return salary;
	}

	/**
	 * 
	 * @param salary
	 *            The salary.
	 */
	public final void setSalary(final BigDecimal salary) {
		this.salary = salary;
	}

	/**
	 * 
	 */
	private BigDecimal salary;

}
