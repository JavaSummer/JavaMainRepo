package javasmmr.zoowsome.services.factories.employee;

import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.Constants;

import java.math.BigDecimal;

public class CaretakerFactory extends EmployeeAbstractFactory {

	String[] names = { "Lee", "Jessica", "Chris", "Lilly", "Harry", "Phil", "Gloria", "Alex", "Jay", "Mitchell", "Will",
			"Alana", "Jack", "Luke", "Ron", "Jon", "Claire", "Francis", "Rose", "Donna", "Amy", "Rory", "River" };
	final long min = 1000000000000L;
	final long max = 9999999999999L;

	@Override
	public Caretaker getEmployeeFactory(String type) throws Exception {
		if (Constants.Employees.Caretaker.equals(type)) {
			int randomNames = (int) (Math.random() * names.length);
			long randomId = min + (long) (Math.random() * ((max - min) + 1));
			return new Caretaker(names[randomNames], randomId, BigDecimal.valueOf(2000));
		} else {
			throw new Exception("The employee doesn't exist.");
		}
	}
}
