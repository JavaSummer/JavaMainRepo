package javasmmr.zoowsome.models.employees;
import javasmmr.zoowsome.services.factories.animals.*;
import javasmmr.zoowsome.models.animals.*;
import java.math.BigDecimal;

public class Caretaker extends Employee implements Caretaker_I{
	private double workingHours;
	
	public Caretaker(String name, BigDecimal salary,boolean isDead){
		super(name,salary,isDead);
	}
	public void setWorkingHours(double workingHours){
		this.workingHours = workingHours;
	}
	public double getWorkingHours(){
		return workingHours;
	}
	public String takeCareOf(Animals a){
		if (a.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintenaceCost()){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		a.setTakenCareOf(true);
		setWorkingHours(this.workingHours - a.getMaintenaceCost());
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}
}
