package javasmmr.zoosome.services.factories.employees;

import java.math.BigDecimal;

import javasmmr.zoosome.models.employees.Caretaker;
import javasmmr.zoosome.models.employees.Employee;
import javasmmr.zoosome.services.factories.Constants;
import javasmmr.zoosome.services.factories.NameGenerator;

public class CaretakerFactory extends EmployeeFactory {
	private static final String[] DEFAULT_NAME_ENDING = { "(caretaker)" };
	private static final long DEFAULT_MAX_ID = 9999999999999L;
	private static final double[] DEFAULT_SALARY = { 1000 };
	private static final double[] DEFAULT_WORKING_HOURS = { 8.0D };

	@Override
	public Employee getEmployee(String type) throws Exception {
		if (Constants.Jobs.CARETAKER.equals(type)) {
			return new Caretaker();
		} else {
			throw new Exception("Employee exception!");
		}
	}

	@Override
	public Employee getRandomEmployeeOfType(String type) throws Exception {
		String name = NameGenerator.getUsualName();

		if (Constants.Jobs.CARETAKER.equals(type)) {
			int index = 0;

			name += DEFAULT_NAME_ENDING[index];
			final long id = (long) (DEFAULT_MAX_ID * Math.random());
			BigDecimal salary = new BigDecimal(DEFAULT_SALARY[index]);
			final double workingHours = DEFAULT_WORKING_HOURS[index];

			return new Caretaker(name, id, salary, workingHours);
		} else {
			throw new Exception("Employee exception!");
		}
	}
}
