package javasmmr.zoowsome.services.factories.employees;


import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.Constants;

public class CareTakerFactory extends EmployeeFactory{

	
	public Employee getEmployee(String type) {
 
		if (Constants.TypeOfEmployees.CareTaker.equals(type)) {
			return new CareTaker();
		} else {
			System.out.println("Invalid employee exception");
			return null;
		}
	}

}
