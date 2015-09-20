package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Employee;

public abstract class EmployeeFactory {
	public abstract Employee getEmployee(String type) throws Exception;
}
