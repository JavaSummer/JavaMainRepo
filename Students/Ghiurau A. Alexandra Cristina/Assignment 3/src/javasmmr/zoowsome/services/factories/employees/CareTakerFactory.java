package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.models.employees.CareTaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

public class CareTakerFactory extends EmployeeAbstractFactory {

	@Override
	public Employee getEmployeeFactory(String type) throws Exception {
		if (Constants.TypesOfEmployees.CareTaker.equals(type)) {
			return new CareTaker();
		} else {
			System.out.println("Invalid employee exception");
			return null;
		}
	}

}
