package javasmmr.zoowsome.models.animals;

public class Piranha extends Aquatic{
	public Piranha(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(0);
		setName("Pyra");
		setAvgSwimDepth(20);
		setWaterType(WaterType.freshwater);
	}
	public Piranha(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(0);
		setName(name);
		setAvgSwimDepth(200);
		setWaterType(WaterType.freshwater);
	}
}
