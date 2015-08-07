package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	int avgSwimDepth;
	boolean isDangerous;

	public Aquatic(double cost, double danger) {
		super(cost, danger);
	}

	public void setAvgSwimDepth(int depth) {
		avgSwimDepth = depth;
	}

	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setIsDangerous(boolean dangerous) {
		isDangerous = dangerous;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

}
