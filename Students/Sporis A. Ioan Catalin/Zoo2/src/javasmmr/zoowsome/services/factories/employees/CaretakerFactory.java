package javasmmr.zoowsome.services.factories.employees;
import javasmmr.zoowsome.services.factories.animals.Constants;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.employees.*;
import java.math.BigDecimal;
import javasmmr.zoowsome.models.employees.*;

public class CaretakerFactory extends EmployeeAbstractFactory {
	public Caretaker getEmployee (String type) throws Exception{
		if(Constants.Employees.Caretaker.equals(type))
			return new Caretaker(Employee.employeeName[(int)Math.random()*100],BigDecimal.TEN,false);
		else throw new Exception ("No such Employee");
	}
}
