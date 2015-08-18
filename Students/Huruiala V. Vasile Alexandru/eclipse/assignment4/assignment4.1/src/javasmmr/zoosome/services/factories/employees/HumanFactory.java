package javasmmr.zoosome.services.factories.employees;

import javasmmr.zoosome.services.factories.Constants;

public class HumanFactory {
	public EmployeeFactory getEmployeeFactory(final String type) throws Exception {
		if (Constants.Jobs.CARETAKER.equals(type)) {
			return new CaretakerFactory();
		} else {
			throw new Exception("Excetpion at HumanFactory");
		}
	}
}
