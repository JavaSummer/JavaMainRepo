package javasmmr.zoowsome.models.animals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Crocodile extends Reptile {
	private static long counter;
	private final long id = counter++;

	public Crocodile() {
		super(3, 0.5);
		setName("Crocodile" + id);
		setNrOfLegs(4);
		setLayEggs(true);
	}

	public Crocodile(String name) {
		super(3, 0.5);
		setName(name);
		setNrOfLegs(4);
		setLayEggs(true);
	}

	public Crocodile(int legs, Boolean eggs) {
		super(3, 0.5);
		setName("Crocodile" + id);
		setNrOfLegs(legs);
		setLayEggs(eggs);
	}

	@Override
	public double getPredisposition() throws Exception {
		String timeInterval1 = "11:00:00";
		Date time1 = new SimpleDateFormat("HH:mm:ss").parse(timeInterval1);
		Calendar calendar1 = GregorianCalendar.getInstance();
		calendar1.setTime(time1);

		String timeInterval2 = "18:00:00";
		Date time2 = new SimpleDateFormat("HH:mm:ss").parse(timeInterval2);
		Calendar calendar2 = GregorianCalendar.getInstance();
		calendar1.setTime(time2);

		Calendar currentDate = GregorianCalendar.getInstance();
		
		if (currentDate.get(Calendar.HOUR_OF_DAY) > calendar1.get(Calendar.HOUR_OF_DAY)
				&& currentDate.get(Calendar.HOUR_OF_DAY) < calendar2.get(Calendar.HOUR_OF_DAY)) {
			return 0.25;
		} else {
			return 0;
		}
	}

}
