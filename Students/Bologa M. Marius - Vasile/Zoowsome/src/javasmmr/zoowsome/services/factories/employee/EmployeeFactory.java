package javasmmr.zoowsome.services.factories.employee;

import javasmmr.zoowsome.services.factories.animal.Constants;

/**
 * 
 * @author Marius Bologa
 *
 */
public class EmployeeFactory {
	/**
	 * 
	 * @param type
	 *            Of the employee.
	 * @return A new employee.
	 * @throws Exception
	 *             .
	 */
	public final EmployeeAbstractFactory getEmployeeAbstractFactory(
			final String type) throws Exception {
		if (Constants.Employees.Caretaker.equals(type)) {
			return new CaretakerFactory();
		} else {
			throw new Exception("Invalid species exception");
		}
	}
}
