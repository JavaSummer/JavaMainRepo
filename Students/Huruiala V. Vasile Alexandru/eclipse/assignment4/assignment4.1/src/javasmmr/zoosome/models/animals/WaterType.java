package javasmmr.zoosome.models.animals;

public enum WaterType {
	Saltwater, Freshwater;

	private static final String SALTWATER = "Saltwater";
	private static final String FRESHWATER = "Freshwater";

	private int code;

	static {
		Saltwater.code = 0;
		Freshwater.code = 1;
	}

	public int code() {
		return this.code;
	}

	public static WaterType getWater(final int waterCode) {
		switch (waterCode) {
		case 0:
			return Saltwater;
		case 1:
			return Freshwater;
		default:
			return null;
		}
	}

	public static WaterType getWater(final String waterString) {
		if (waterString.equals(SALTWATER)) {
			return Saltwater;
		} else if (waterString.equals(FRESHWATER)) {
			return Freshwater;
		} else {
			return null;
		}
	}
}