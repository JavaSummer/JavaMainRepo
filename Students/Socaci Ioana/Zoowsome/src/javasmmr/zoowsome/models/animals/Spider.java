package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{

	public Spider(){
		nrOfLegs = 8;
		name = "Spider";
		canFly = false;
		isDangerous = true;
	}
	public Spider(String theName, int theNrOfLegs, boolean flies, boolean dangerous){
		nrOfLegs = theNrOfLegs;
		name = theName;
		canFly = flies;
		isDangerous = dangerous;
	}
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(){
		nrOfLegs = 8;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		name = "Spider";
	}
}
