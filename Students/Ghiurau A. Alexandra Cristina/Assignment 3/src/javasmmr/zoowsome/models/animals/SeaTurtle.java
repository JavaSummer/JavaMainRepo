package javasmmr.zoowsome.models.animals;

public class SeaTurtle extends Aquatics {

	public SeaTurtle() {
		setMammal(false);
		setNrOfLegs(4);
		setName("Nigel");
		setAvgSwimDepth(20);
		setWt(waterType.FRESHWATER);
	}

	public SeaTurtle(String name, int swimDepth, waterType waterType) {
		setMammal(false);
		setNrOfLegs(4);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setWt(waterType);
	}
}
