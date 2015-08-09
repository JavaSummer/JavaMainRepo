package javasmmr.zoowsome.models.animals;

import java.time.LocalTime;

public class Crocodile extends Reptile {
	public Crocodile(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName("Croco");
		setLaysEgg(true);
	}
	public Crocodile(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName(name);
		setLaysEgg(true);
	}
	public double getPredisposition(){
		if (LocalTime.now().isAfter(LocalTime.of(21,30)) && LocalTime.now().isBefore(LocalTime.of(22, 30)))
				return 0.5;
		return 0;
	}
}
