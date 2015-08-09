package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public Cow(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName("Milka");
		setNormalBodyTemp(40);
		setPercBodyHair(87);
	}
	public Cow(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(4);
		setName(name);
		setNormalBodyTemp(40);
		setPercBodyHair(87);
	}
}
