package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);

	}

	public Butterfly(String name, int nrLegs, boolean canFly, boolean isDangerous, double cost, double danger,
			boolean takenCareof) {
		super(cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setTakenCareOf(takenCareof);

	}

}
