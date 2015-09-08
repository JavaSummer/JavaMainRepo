package javasmmr.zoowsome.services.employeefactory;
import javasmmr.zoowsome.services.animalfactories.*;

public class EmployeeAbstractFactory {

	public EmployeeFactory getEmployeeFactory(String type){
		if(Constants.EmployeeFactory.CaretakerFactory.equals(type)){
			return new CaretakerFactory();
		}
		else{
			throw new IllegalArgumentException("Invalid!");

		}
	}
}
