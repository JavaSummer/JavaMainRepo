package javasmmr.zoowsome.models.animals;

public class Wolf extends Mammal {
	public Wolf(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
	public Wolf() {
		this.setName("John Snow");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp(38.0f);
		this.setPercBodyHair(100.0f);
	}
}
