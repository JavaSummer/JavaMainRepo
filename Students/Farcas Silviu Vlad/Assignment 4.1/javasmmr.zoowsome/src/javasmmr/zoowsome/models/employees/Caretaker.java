package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	public Caretaker(String name, long id, BigDecimal salary) {
		super(name, id, salary);
	}

	private double workingHours;

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public String takeCareOf(Animal a){
		if(a.kill()){
			return Constants.Employee.Caretakers.TCO_KILLED;
		}
		if(this.workingHours<a.getMaintenanceCost()){
			return Constants.Employee.Caretakers.TCO_NO_TIME;			
		}
		a.setTakenCareOf(true);
		setWorkingHours(getWorkingHours()-a.getMaintenanceCost());
		return Constants.Employee.Caretakers.TCO_SUCCESS;
	}
}
