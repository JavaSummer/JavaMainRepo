package javasmmr.zoowsome.services.factories.employeeFactories;
import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.*;


public class CaretakerFactory extends EmployeeAbstractFactory{

		public Employee getEmployee() {

			return new Caretaker();
		}
		
		public Employee getEmployee(String name, String id, String salary,String isDead,
				String workingHours) {
			return new Caretaker(name, Long.valueOf(id), new BigDecimal(salary), Boolean.parseBoolean(isDead),
					Double.parseDouble(workingHours));
		}
}
