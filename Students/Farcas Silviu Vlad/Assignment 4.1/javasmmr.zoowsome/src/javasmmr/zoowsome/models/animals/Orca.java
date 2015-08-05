package javasmmr.zoowsome.models.animals;

import java.time.LocalTime;

import javasmmr.zoowsome.models.animals.WaterType.water;

public class Orca extends Aquatic {
	public Orca(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("OrcaX");
		setNrOfLegs(0);
		setAvgSwimDepth(20);
		setWaterType(water.SALTWATER);
	}

	public Orca(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(20);
		setWaterType(water.SALTWATER);

	}
	public double getPredisposition(){
		if(LocalTime.now().isAfter(LocalTime.of(12, 0))&&LocalTime.now().isBefore(LocalTime.of(22, 0))){
			return 0.4;
		}
		return 0;
	}
}
