package javasmmr.zoowsome.models.animals;

public class SeaTurtle extends Aquatic {

	public SeaTurtle() {
		setNrOfLegs(4);
		setName("Nigel");
		setAvgSwimDepth(20);
		setWt(waterType.FRESHWATER);
	}

	public SeaTurtle(String name, int swimDepth, waterType waterType) {
		setNrOfLegs(4);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setWt(waterType);
	}
}
