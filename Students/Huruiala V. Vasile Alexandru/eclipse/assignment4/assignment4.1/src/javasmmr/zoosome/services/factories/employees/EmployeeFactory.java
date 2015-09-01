package javasmmr.zoosome.services.factories.employees;

import javasmmr.zoosome.models.employees.Employee;

public abstract class EmployeeFactory {
	public abstract Employee getEmployee(String type) throws Exception;

	public abstract Employee getRandomEmployeeOfType(String type) throws Exception;
}
