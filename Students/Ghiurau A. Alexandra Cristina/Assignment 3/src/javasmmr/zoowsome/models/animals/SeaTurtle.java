package javasmmr.zoowsome.models.animals;

public class SeaTurtle extends Aquatic {

	public SeaTurtle() {
		super(7.5, 0.5);
		setNrOfLegs(4);
		setName("Nigel");
		setAvgSwimDepth(20);
		setWt(waterType.FRESHWATER);
	}

	public SeaTurtle(String name, int swimDepth, waterType waterType, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(4);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setWt(waterType);
	}
}
