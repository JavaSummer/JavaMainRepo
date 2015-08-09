package javasmmr.zoowsome.models.animals;

import java.time.LocalTime;

public class Snake extends Reptile {
	public Snake(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(0);
		setName("Cobra");
		setLaysEgg(true);
	}
	public Snake(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(0);
		setName(name);
		setLaysEgg(true);
	}
	public double getPredisposition(){
		if (LocalTime.now().isAfter(LocalTime.of(2,30)) && LocalTime.now().isBefore(LocalTime.of(22, 30)))
				return 0.70;
		return 0;
	}
}
