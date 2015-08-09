package javasmmr.zoowsome.models.animals;

import java.time.LocalTime;

public class Cockroach extends Insect {
	public Cockroach(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setName("Cockroach");
		setNrLegs(10);
		setCanFly(false);
		setIsDangerous(true);
	}
	public Cockroach(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setName("name");
		setNrLegs(10);
		setCanFly(false);
		setIsDangerous(true);
	}
	public double getPredisposition(){
		if (LocalTime.now().isAfter(LocalTime.of(8,30)) && LocalTime.now().isBefore(LocalTime.of(10, 30)))
				return 0.05;
		return 0;
	}
}
