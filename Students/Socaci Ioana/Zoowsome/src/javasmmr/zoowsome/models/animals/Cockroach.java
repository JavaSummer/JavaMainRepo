package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{

	public Cockroach(){
		nrOfLegs = 6;
		name = "Cockroach";
		canFly = false;
		isDangerous = true;
	}
	public Cockroach(String theName, int theNrOfLegs, boolean flies, boolean dangerous){
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
		name = "Cockroach";
	}
}
