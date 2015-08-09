package javasmmr.zoowsome.models.animals;

import java.time.LocalTime;

public class Shark extends Aquatic {
	public Shark(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(0);
		setName("Jaws");
		setAvgSwimDepth(2000);
		setWaterType(WaterType.saltwater);
	}
	public Shark(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(0);
		setName(name);
		setAvgSwimDepth(2000);
		setWaterType(WaterType.saltwater);
	}
	public double getPredisposition(){
		if (LocalTime.now().isAfter(LocalTime.of(22,30)) && LocalTime.now().isBefore(LocalTime.of(00, 30)))
				return 0.95;
		return 0;
	}
}
