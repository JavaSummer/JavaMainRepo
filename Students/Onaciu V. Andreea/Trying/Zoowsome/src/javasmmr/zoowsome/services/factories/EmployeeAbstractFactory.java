package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.*;

abstract public class EmployeeAbstractFactory {
	public abstract Employee getEmployee(String type) throws Exception;
}
