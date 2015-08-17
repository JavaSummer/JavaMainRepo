package javasmmr.zoowsome.models.animals;


public class SeaHorse extends Aquatic {

	public SeaHorse() {
		setNrOfLegs(12);
		setName("Dory");
		setAvgSwimDepth(20);
		setWt(waterType.FRESHWATER);
	}

	public SeaHorse(String name, int swimDepth, waterType waterType, int nrOflegs) {
		setNrOfLegs(nrOflegs);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setWt(waterType);
	}
}
