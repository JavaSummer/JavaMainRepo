package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.models.employees.Employee;

abstract public class EmployeeFactory {
	abstract public Employee getEmployee(String type);
}
