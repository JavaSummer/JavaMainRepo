package javasmmr.zoosome.models.animals;

public enum WaterType {
	Saltwater, Freshwater;
	
	private int code;
	
	static {
		Saltwater.code = 0;
		Freshwater.code = 1;
	}
	
	public int code() {
		return this.code;
	}
		
	public static WaterType getWater(final int waterCode) {
		switch(waterCode) {
		case 0: return Saltwater;
		case 1: return Freshwater;
		default: return null;
		}
	}
}