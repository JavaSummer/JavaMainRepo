package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Employee;

public abstract class EmployeeAbstractFactory {
	public abstract Employee getEmployeeFactory(String type) throws Exception;
}
