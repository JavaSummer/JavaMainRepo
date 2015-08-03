package javasmmr.zoowsome.models.animals;


public class SeaHorse extends Aquatics {

	public SeaHorse() {
		setMammal(false);
		setNrOfLegs(12);
		setName("Dory");
		setAvgSwimDepth(20);
		setWt(waterType.FRESHWATER);
	}

	public SeaHorse(String name, int swimDepth, waterType waterType, int nrOflegs) {
		setMammal(false);
		setNrOfLegs(nrOflegs);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setWt(waterType);
	}
}
