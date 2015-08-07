package javasmmr.zoowsome.models.animals;

import java.util.Calendar;
import java.util.TimeZone;

public class Jellyfish extends Aquatic {

	public Jellyfish(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName("Sting");
		setAvgSwimDepth(150);
		setIsDangerous(true);
	}

	public Jellyfish(String name, int swimDepth, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setIsDangerous(true);
	}
	
	public double getPredisposition() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		if ((dayOfWeek == 1) || (dayOfWeek == 4)) {
			return 0.25;
		}
		return 0;
	}

}
