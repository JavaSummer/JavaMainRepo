package javasmmr.zoowsome.services.factories.employeeFactories;
import javasmmr.zoowsome.models.employees.*;


public class CaretakerFactory extends EmployeeAbstractFactory{

		public Employee getEmployee() {

			return new Caretaker();
		}
}
