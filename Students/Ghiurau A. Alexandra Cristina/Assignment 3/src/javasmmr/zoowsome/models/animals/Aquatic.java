package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	int avgSwimDepth;

	public enum waterType {
		SALTWATER, FRESHWATER
	}

	waterType wt;

	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public waterType getWt() {
		return wt;
	}

	public void setWt(waterType wt) {
		this.wt = wt;
	}
}
