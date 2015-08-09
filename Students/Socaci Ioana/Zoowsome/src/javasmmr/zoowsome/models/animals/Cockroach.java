package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{

	public Cockroach(){
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(true);
	}
	public Cockroach(String theName, int theNrOfLegs, boolean flies, boolean dangerous){
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setCanFly(flies);
		setIsDangerous(dangerous);
	}

}
