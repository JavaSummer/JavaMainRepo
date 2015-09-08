package javasmmr.zoowsome.services.employeefactory;
import javasmmr.zoowsome.models.employees.*;

public abstract class EmployeeFactory {

	public abstract Employee getEmployee(String type);
}
