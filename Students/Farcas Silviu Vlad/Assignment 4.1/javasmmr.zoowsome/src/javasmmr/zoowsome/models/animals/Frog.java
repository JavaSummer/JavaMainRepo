package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.WaterType.water;

public class Frog extends Aquatic {
	public Frog(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("FrogX");
		setNrOfLegs(4);
		setAvgSwimDepth(1);
		setWaterType(water.FRESHWATER);
	}

	public Frog(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(4);
		setAvgSwimDepth(1);
		setWaterType(water.FRESHWATER);
	}
}
