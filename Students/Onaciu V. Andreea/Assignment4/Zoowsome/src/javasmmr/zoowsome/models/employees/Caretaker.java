package javasmmr.zoowsome.models.employees;
import java.math.*;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.*;
public class Caretaker extends Employee implements Caretaker_I{
 private double workingHours;
 public void setWorkingHours(double hours){
	 this.workingHours=hours;
 }
 public double getWorkingHours(){
	 return workingHours;
 }
 
 public Caretaker(String name,Long id,BigDecimal salary,double workingHours){
 super(name,id,salary);
 this.workingHours=workingHours;
 }
 public String takeCareOf(Animal a){
		 if (a.kill()) {
		 return Constants.Employees.Caretakers.TCO_KILLED;
		 }
		 if (this.workingHours < a.getMaintenanceCost()){
		 return Constants.Employees.Caretakers.TCO_NO_TIME;
		 }
		 a.setTakeCareOf(true);
		 setWorkingHours(workingHours-a.getMaintenanceCost());
		 return Constants.Employees.Caretakers.TCO_SUCCESS;
		 }
  	 
 }
 



interface Caretaker_I{
	public String takeCareOf(Animal animal);
	
}