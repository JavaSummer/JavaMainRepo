package javasmmr.zoowsome.models.animals;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Shark extends Aquatic {
	private static long counter;
	private final long id = counter++;

	public Shark() {
		super(4, 0.65);
		setName("Shark" + id);
		setNrOfLegs(0);
		setAvgSwimDepth(500);
		setWaterType(WaterType.SALTWATER);
	}

	public Shark(String name) {
		super(4, 0.65);
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(500);
		setWaterType(WaterType.SALTWATER);
	}
	
	public Shark(int legs, int depth, WaterType water) {
		super(4, 0.65);
		setName("Shark" + id);
		setNrOfLegs(legs);
		setAvgSwimDepth(depth);
		setWaterType(water);
	}
	
	@Override
	public double getPredisposition() throws Exception {

		Calendar date = GregorianCalendar.getInstance();
		if (date.get(Calendar.MONTH) == Calendar.AUGUST) {
			return 0.15;
		} else {
			return 0;
		}
	}
}
