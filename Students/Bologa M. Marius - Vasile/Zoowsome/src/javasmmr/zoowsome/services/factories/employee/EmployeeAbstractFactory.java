package javasmmr.zoowsome.services.factories.employee;

import javasmmr.zoowsome.models.employees.Employee;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class EmployeeAbstractFactory {
	/**
	 * 
	 * @param type
	 *            Type of employee
	 * @return  The employee.
	 * @throws Exception .
	 *             .
	 */
	public abstract Employee getEmployee(String type) throws Exception;
}
