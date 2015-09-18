package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.Constants;

public class CaretakerFactory extends EmployeeAbstractFactory {

	@Override
	public Caretaker getEmployee(String type) throws Exception {
		if (Constants.Employees.Caretaker.equals(type)) {
			return new Caretaker();
		} else {
			throw new Exception("Invalid type!");
		}
	}
}