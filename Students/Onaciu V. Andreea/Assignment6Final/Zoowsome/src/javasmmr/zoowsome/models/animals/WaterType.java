package javasmmr.zoowsome.models.animals;

public class WaterType {
	public enum waterType {
		saltwater, freshwater;
	}

	public static waterType getWater(String water) {
		if (water.equals("saltwater")) {
			return waterType.saltwater;
		} else if (water.equals("freshwater")) {
			return waterType.freshwater;
		} else {
			return null;
		}
	}

}