package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{

	public Butterfly(){
		setNrOfLegs(6);
		setName("Butterfly");
		setCanFly(true);
		setIsDangerous(false);
	}
	public Butterfly(String theName, int theNrOfLegs, boolean flies, boolean dangerous){
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setCanFly(flies);
		setIsDangerous(dangerous);
	}
}
