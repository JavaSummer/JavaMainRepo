package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	
	public Cockroach(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(6);
		setCanFly (false);
		setIsDangerous(true);
	}
	
	public Cockroach(String name, int nrLegs, boolean canFly, boolean isDangerous,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setCanFly (canFly);
		setIsDangerous(isDangerous);
		setTakenCareOf(takenCareof);
		
	}

}
