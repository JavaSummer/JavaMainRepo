package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName("ButterFly");
		setCanFly(true);
		setIsDangerous(false);
	}
	public Butterfly(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName(name);
		setCanFly(true);
		setIsDangerous(false);
	}
}
