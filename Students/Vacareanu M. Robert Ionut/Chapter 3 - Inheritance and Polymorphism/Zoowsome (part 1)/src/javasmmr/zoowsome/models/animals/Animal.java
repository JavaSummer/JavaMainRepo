package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	private int nrOfLegs;
	private String name;

	public int getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract public void printAllAttributes();
}

abstract class Mammal extends Animal {
	private float normalBodyTemp;
	private float percBodyHair;

	public float getNormalBodyTemp() {
		return this.normalBodyTemp;
	}

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public float getPercBodyHair() {
		return this.percBodyHair;
	}

	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}

	public void printAllAttributes() {
		System.out.printf("Class: %s%n", this.getClass());
		System.out.printf("Name: %s%n", this.getName());
		System.out.printf("Legs: %d%n", this.getNrOfLegs());
		System.out.printf("Body Temperature: %.2f%n", this.getNormalBodyTemp());
		System.out.printf("Body Hair: %.2f%n", this.getPercBodyHair());
	}

}

abstract class Reptile extends Animal {
	private Boolean layEggs;

	public Boolean getLayEggs() {
		return this.layEggs;
	}

	public void setLayEggs(Boolean layEggs) {
		this.layEggs = layEggs;
	}

	public void printAllAttributes() {
		System.out.printf("Class: %s%n", this.getClass());
		System.out.printf("Name: %s%n", this.getName());
		System.out.printf("Legs: %d%n", this.getNrOfLegs());
		System.out.printf("Lay Eggs: %b%n", this.getLayEggs());
	}
}

abstract class Bird extends Animal {
	private Boolean migrate;
	private int avgFlightAltitude;

	public Boolean getMigrate() {
		return this.migrate;
	}

	public void setMigrate(Boolean migrate) {
		this.migrate = migrate;
	}

	public int getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}

	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public void printAllAttributes() {
		System.out.printf("Class: %s%n", this.getClass());
		System.out.printf("Name: %s%n", this.getName());
		System.out.printf("Legs: %d%n", this.getNrOfLegs());
		System.out.printf("Altitude: %d%n", this.getAvgFlightAltitude());
		System.out.printf("Migrate: %b%n", this.getMigrate());
	}
}

abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	private WaterType waterType;

	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public WaterType getWaterType() {
		return this.waterType;
	}

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}

	public void printAllAttributes() {
		System.out.printf("Class: %s%n", this.getClass());
		System.out.printf("Name: %s%n", this.getName());
		System.out.printf("Legs: %d%n", this.getNrOfLegs());
		System.out.printf("Swim Depth: %d%n", this.getAvgSwimDepth());
		// Enums already have a toString() method
		System.out.printf("Water Type: %s%n", this.getWaterType());
	}
}

abstract class Insect extends Animal {
	private Boolean canFly;
	private Boolean isDangerous;

	public Boolean getCanFlys() {
		return this.canFly;
	}

	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}

	public Boolean getIsDangerous() {
		return this.isDangerous;
	}

	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public void printAllAttributes() {
		System.out.printf("Class: %s%n", this.getClass());
		System.out.printf("Name: %s%n", this.getName());
		System.out.printf("Legs: %d%n", this.getNrOfLegs());
		System.out.printf("Can Fly: %b%n", this.getCanFlys());
		System.out.printf("Is Dangerous: %b%n", this.getIsDangerous());
	}
}