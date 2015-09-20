package javasmmr.zoowsome.models.employees;
import javasmmr.zoowsome.services.factories.Constants.Employees;
import javasmmr.zoowsome.models.animals.Animal;

public class Caretaker extends Employee implements Caretaker_I{
	
	double workingHours;
	
	public void setWorkingHours(double workingH){
		workingHours = workingH;
	}
	
	public Double getWorkingHours(){
		return workingHours;
	}
	
	//implementing the method from the interface
	public String takeCareOf(Animal animal){
		
		if (animal.kill()){
			return Employees.Caretakers.TCO_KILLED;
		}
		else if(this.workingHours<animal.maintenanceCost){
			return Employees.Caretakers.TCO_NO_TIME;
		}
		else
		{
		animal.takenCareOf = true;
		workingHours-=animal.maintenanceCost;
		return Employees.Caretakers.TCO_SUCCESS;
		}
	}
	

}
