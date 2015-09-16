package javasmmr.zoowsome.models.animals;

public class Catfish extends Aquatic {

	public Catfish(Integer nrOfLegs, String name,Integer avgSwimDepth, Water waterType, double maintenanceCost, double dangerPerc) {

		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Catfish() {
		this(new Integer(0),"catfish", new Integer(100), Water.FRESHWATER,3, 0);
	}

}


