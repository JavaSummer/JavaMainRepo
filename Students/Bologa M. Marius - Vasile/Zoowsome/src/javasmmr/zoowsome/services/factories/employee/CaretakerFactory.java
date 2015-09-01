package javasmmr.zoowsome.services.factories.employee;

import java.math.BigDecimal;
import java.util.UUID;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.animal.Constants;

/**
 * 
 * @author Marius Bologa
 *
 */

public class CaretakerFactory extends EmployeeAbstractFactory {
	/**
	 * 
	 */
	String[] name = { "Tom", "Arthur", "Mike", "Emma", "Jacob", "Mia", "Sophia", "Olivia", "William", "Emily", "Daniel",
			"Aria", "John", "Caleb", "Jack", "Samantha", "Zoe" };

	/**
	 * 
	 * @param type
	 *            Typpe of the bird.
	 * @return The bird.
	 * @throws Exception
	 *             No more workers!
	 */
	public final Caretaker getEmployee(final String type) throws Exception {
		if (Constants.Employees.Caretaker.equals(type)) {
			return new Caretaker(name[(int) (Math.random() * name.length)], UUID.randomUUID(),
					new BigDecimal((Math.random()) * 1000).setScale(3, BigDecimal.ROUND_CEILING));

		} else {
			throw new Exception("No  worker!");
		}
	}
}
