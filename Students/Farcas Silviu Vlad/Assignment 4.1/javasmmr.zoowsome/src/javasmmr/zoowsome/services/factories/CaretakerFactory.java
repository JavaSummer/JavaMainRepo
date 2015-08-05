package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.*;

public class CaretakerFactory extends EmployeeAbstractFactory{

	public Caretaker getEmployeeFactory(String type) throws Exception{
		if(Constants.Employee.Caretaker.equals(type)){
			return new Caretaker(AnimalFactory.names[(int)(Math.random()*100)], (long)(Math.random()*9000000000000l)+1000000000000l, BigDecimal.TEN);
		}
		else {
			throw new Exception("No such employee");
		}
	}
}
