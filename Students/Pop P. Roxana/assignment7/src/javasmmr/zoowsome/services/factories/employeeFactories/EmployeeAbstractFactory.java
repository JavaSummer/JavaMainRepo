package javasmmr.zoowsome.services.factories.employeeFactories;

import javasmmr.zoowsome.models.employees.*;

//as you said, this should be similar to speciesFactory
//so I took the liberty of creating a method similar to the one in SpeciesFactory
//and it's not exactly as you specified :?
public abstract class EmployeeAbstractFactory {

	public abstract Employee getEmployee();

	public abstract Employee getEmployee(String name, String id, String salary, String isDead, String workingHours);
}
