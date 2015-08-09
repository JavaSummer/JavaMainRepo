package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{

	public Spider(){
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(false);
		setIsDangerous(true);
	}
	public Spider(String theName, int theNrOfLegs, boolean flies, boolean dangerous){
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setCanFly(flies);
		setIsDangerous(dangerous);
	}

}
