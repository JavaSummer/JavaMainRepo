package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{

	public Butterfly(){
		nrOfLegs = 6;
		name = "Butterfly";
		canFly = true;
		isDangerous = false;
	}
	public Butterfly(String theName, int theNrOfLegs, boolean flies, boolean dangerous){
		nrOfLegs = theNrOfLegs;
		name = theName;
		canFly = flies;
		isDangerous = dangerous;
	}
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(){
		nrOfLegs = 6;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		name = "Butterfly";
	}
}
