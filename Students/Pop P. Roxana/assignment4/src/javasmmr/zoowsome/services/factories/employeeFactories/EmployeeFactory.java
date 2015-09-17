package javasmmr.zoowsome.services.factories.employeeFactories;
import javasmmr.zoowsome.services.factories.*;

//this is very similar to the animalFactory in .animalFactories
public class EmployeeFactory {

	public EmployeeAbstractFactory getEmployeeFactory(String type) throws Exception {
		
		if (Constants.EmployeesType.Caretakers.equals(type)) {
			return new CaretakerFactory();
		} else
			throw new Exception("Invalid species exception");
	}

}
