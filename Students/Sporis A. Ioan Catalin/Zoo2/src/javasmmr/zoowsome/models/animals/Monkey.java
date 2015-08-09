package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	public Monkey(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName("Chimpy");
		setNormalBodyTemp(40);
		setPercBodyHair(87);
	}
	public Monkey(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName(name);
		setNormalBodyTemp(40);
		setPercBodyHair(87);
	}
}
