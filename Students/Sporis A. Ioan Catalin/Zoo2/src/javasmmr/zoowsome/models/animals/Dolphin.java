package javasmmr.zoowsome.models.animals;


public class Dolphin extends Aquatic {
	public Dolphin(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(0);
		setName("Doplphin");
		setAvgSwimDepth(200);
		setWaterType(WaterType.saltwater);
	}
	public Dolphin(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(0);
		setName(name);
		setAvgSwimDepth(200);
		setWaterType(WaterType.saltwater);
	}
}
