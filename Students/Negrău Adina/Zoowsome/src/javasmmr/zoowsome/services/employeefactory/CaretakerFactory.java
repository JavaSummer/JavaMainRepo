package javasmmr.zoowsome.services.employeefactory;
import javasmmr.zoowsome.services.animalfactories.Constants;
import javasmmr.zoowsome.models.employees.*;

public class CaretakerFactory extends EmployeeFactory{
	
	public Employee getEmployee(String type){
		if(Constants.Employee.Caretaker.equals(type)){
			return new Caretaker();
		}
		else {
			throw new IllegalArgumentException("Invalid!");
		}
		
	}

}
