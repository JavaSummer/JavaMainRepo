package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.animal.Constants;

public class Caretaker extends Employee {

	private double workingHours;

	public Caretaker(String employeeName, long ID, BigDecimal employeeSalary) {
		super(employeeName, ID, employeeSalary);
	}

	public void setWorkingHours(double hours) {
		workingHours = hours;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public String takeCareOf(Animal animal) {

		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}

		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}

		animal.setTakenCareOf(true);
		setWorkingHours(getWorkingHours() - animal.getMaintenanceCost());

		return Constants.Employees.Caretakers.TCO_SUCCES;
	}
}
