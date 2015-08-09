package javasmmr.zoowsome.models.animals;

import java.time.LocalTime;

public class Tiger extends Mammal {
	public Tiger(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName("Pumba");
		setNormalBodyTemp(43);
		setPercBodyHair(100);
	}
	public Tiger(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName(name);
		setNormalBodyTemp(43);
		setPercBodyHair(100);
	}
	public double getPredisposition(){
		if (LocalTime.now().isAfter(LocalTime.of(14,30)) && LocalTime.now().isBefore(LocalTime.of(16, 30)))
				return 0.25;
		return 0;
	}
}
