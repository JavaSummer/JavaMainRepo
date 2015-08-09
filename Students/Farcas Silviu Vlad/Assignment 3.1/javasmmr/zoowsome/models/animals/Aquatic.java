package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal{
	int avgSwimDepth;
	public enum water {
		SALTWATER, FRESHWATER
	}
	water waterType;
}
