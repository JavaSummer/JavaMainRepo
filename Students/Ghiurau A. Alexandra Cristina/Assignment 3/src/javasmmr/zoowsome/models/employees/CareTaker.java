package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class CareTaker extends Employee implements CareTaker_I {

	double workingHours;

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double theseWorkingHours) {
		workingHours = theseWorkingHours;
	}

	public String takeCareOf(Animal animal) {

		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;

		}
		/*
		 * pseudo-code: set the animal takenCareOf flag to true Subtract the
		 * maintenance cost from the caretakers working hours return
		 * Constants.Employees.Caretakers.TCO_SUCCESS;
		 */
		animal.setTakenCareOf(false);
		setWorkingHours(getWorkingHours() - animal.getMaintenanceCost());
		return Constants.Employees.Caretakers.TCO_SUCCESS;

	}

}
