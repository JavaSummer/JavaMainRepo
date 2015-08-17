package javasmmr.zoowsome.services.factories.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.*;

public class CaretakerFactory extends EmployeeFactory {
	
	
	public Employee getEmployee(){
		GenerateData data = new GenerateData();
		String name = data.getName();
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		long id = data.getId();
	    BigDecimal salary = data.getSalary();
	    double workingHours = data.getWorkingHours();
		return new Caretaker(name, id, salary, workingHours);
		
	}

}
