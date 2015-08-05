package javasmmr.zoowsome.models.animals;

import java.time.LocalTime;

public class Tiger extends Mammal {
	public Tiger(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(37.5f);
		setPercBodyHair(98 / 100f);
	}

	public Tiger(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("TigerX");
		setNrOfLegs(4);
		setNormalBodyTemp(37.5f);
		setPercBodyHair(98 / 100f);

	}
	public double getPredisposition(){
		if(LocalTime.now().isAfter(LocalTime.of(12, 0))&&LocalTime.now().isBefore(LocalTime.of(20, 0))){
			return 0.35;
		}
		return 0;
	}
}
