package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.WaterType.water;

public class Dolphin extends Aquatic {
	public Dolphin(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("DolphinX");
		setNrOfLegs(0);
		setAvgSwimDepth(25);
		setWaterType(water.SALTWATER);
	}

	public Dolphin(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(25);
		setWaterType(water.SALTWATER);
	}
}
