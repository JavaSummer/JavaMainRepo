package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.services.factories.animals.*;

public class EmployeeAbstractFactory {
	public EmployeeFactory getEmployeeFactory(String type) throws Exception {

		if (Constants.Employees.Caretaker.equals(type)) {
			return new CaretakerFactory();
		} else
			throw new Exception("Invalid employee exception");

	}

}
