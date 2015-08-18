package javasmmr.zoosome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
	private static final String DEFAULT_NAME = "Bob (caretaker)";
	private static final long DEFAULT_MAX_ID = 9999999999999L;
	private static final BigDecimal DEFAULT_SALARY = new BigDecimal(1000);
	private static final double DEFAULT_WORKING_HOURS = 0.0D; 
	
	private double workingHours;
	
	public Caretaker() {
		super(DEFAULT_NAME, (long) (DEFAULT_MAX_ID * Math.random()), DEFAULT_SALARY);
		this.workingHours = DEFAULT_WORKING_HOURS;
	}
	
	public Caretaker(final String name, final long id, final double salary, final double wHours) {
		super(name, id, salary);
		this.workingHours = wHours;
	}
	
	public Caretaker(final String name, final long id, final BigDecimal salary, final double wHours) {
		super(name, id, salary);
		this.workingHours = wHours;
	}
	
	public String takeCareOf(Animal animal) {
		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		} 
		if (animal.kill()) {
			this.setIsDead(true);
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		animal.setTakenCareOf(true);
		this.setWorkingHours(this.getWorkingHours() - animal.getMaintenanceCost());
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}
	
	public double getWorkingHours() {
		return this.workingHours;
	}
	
	public void setWorkingHours(double newWorkingHours) {
		this.workingHours = newWorkingHours;
	}
}
