package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{
	public Lizard(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName("Lizy");
		setLaysEgg(true);
	}
	public Lizard(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName(name);
		setLaysEgg(true);
	}
}
