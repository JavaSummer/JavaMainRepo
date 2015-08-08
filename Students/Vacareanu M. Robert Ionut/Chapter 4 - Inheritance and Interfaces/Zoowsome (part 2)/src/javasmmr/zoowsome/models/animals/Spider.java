package javasmmr.zoowsome.models.animals;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Spider extends Insect {
	private static long counter;
	private final long id = counter++;

	public Spider() {
		super(1, 0.15);
		setName("Spider" + id);
		setNrOfLegs(8);
		setCanFly(false);
		setIsDangerous(true);
	}

	public Spider(String name) {
		super(1, 0.15);
		setName(name);
		setNrOfLegs(8);
		setCanFly(false);
		setIsDangerous(true);
	}
	
	public Spider(int legs, Boolean fly, Boolean dangerous) {
		super(1, 0.15);
		setName("Spider" + id);
		setNrOfLegs(legs);
		setCanFly(fly);
		setIsDangerous(dangerous);
	}
	
	@Override
	public double getPredisposition() throws Exception {

		Calendar date = GregorianCalendar.getInstance();
		if (date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
			return 0.3;
		} else {
			return 0;
		}
	}
}
