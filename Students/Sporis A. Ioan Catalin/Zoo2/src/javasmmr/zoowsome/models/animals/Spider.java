package javasmmr.zoowsome.models.animals;
import java.time.LocalTime;

public class Spider extends Insect{
	public Spider(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setName("Spidey");
		setCanFly(false);
		setNrLegs(6);
		setIsDangerous(true);
	}
	public Spider(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost,dangerPerc);
		setName(name);
		setNrLegs(6);
		setCanFly(false);
		setIsDangerous(true);
	}
	public double getPredisposition(){
		if (LocalTime.now().isAfter(LocalTime.of(11,0)) && LocalTime.now().isBefore(LocalTime.of(6, 0)))
				return 0.25;
		return 0;
	}
}
