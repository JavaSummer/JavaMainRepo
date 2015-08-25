package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
import javasmmr.zoowsome.services.animalfactories.Constants;
import javasmmr.zoowsome.models.animals.*;

public class Caretaker extends Employee implements Caretaker_I{
	private double workingHours;
	
	public Caretaker(){
		super();		
	}

	public String takeCareOf(Animal a){
		if(a.kill()){
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if(this.workingHours < a.maintananceCost){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		
		a.setTakenCareOf(true);
		workingHours = workingHours - a.maintananceCost;
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}
	
	public Caretaker(String name1, BigDecimal salary1, boolean dead, double wh){
		super(name1, salary1, dead);
		workingHours = wh;
	}
	public void setWorkingHours(double wh){
		workingHours = wh;
	}
	
	public double getWorkingHours(){
		return workingHours;
	}
	
}
