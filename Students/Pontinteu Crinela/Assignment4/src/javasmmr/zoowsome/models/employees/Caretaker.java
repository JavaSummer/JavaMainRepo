package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.animals.Constants;

public class Caretaker extends Employee {

	private double workingHours;

	public Caretaker(String name, long id, BigDecimal salary) {
		super(name, id, salary);
	}

	public Caretaker(String name, long id, BigDecimal salary, double workingHours) {
		super(name, id, salary);
		this.workingHours = workingHours;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public String takeCareOf(Animal a) {

		if (a.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		a.setTakenCareOf(true);
		setWorkingHours(getWorkingHours() - a.getMaintenanceCost());
		return Constants.Employees.Caretakers.TCO_SUCCESS;

	}

}
