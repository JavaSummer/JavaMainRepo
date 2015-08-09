package javasmmr.zoowsome.models.animals;

import java.util.Calendar;
import java.util.TimeZone;

public class Viper extends Reptile {

	public Viper(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName("Nagini");
		setLaysEggs(true);
	}

	public Viper(String name, boolean eggs, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName(name);
		setLaysEggs(eggs);
	}

	public double getPredisposition() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		if ((hourOfDay >= 15) && (hourOfDay <= 22)) {
			return 0.15;
		}
		return 0;
	}
}
