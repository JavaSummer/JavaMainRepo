package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.models.employees.Employee;

public abstract class EmployeeFactory {
	
	public abstract Employee getEmployee( ) throws Exception;

}
