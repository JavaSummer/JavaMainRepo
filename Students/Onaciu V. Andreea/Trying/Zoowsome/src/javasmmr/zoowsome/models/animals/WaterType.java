package javasmmr.zoowsome.models.animals;
public class WaterType{
public enum waterType{
		saltwater,
		freshwater;
	}

public static waterType getWater( String waterString) {
		if (waterString.equals("saltwater")) {
			return waterType.saltwater; 
		} else if (waterString.equals("freshwater")) {
			return waterType.freshwater;
		} else {
			return null;
		}
	}

}