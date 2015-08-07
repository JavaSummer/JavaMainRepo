package javasmmr.zoowsome.models.animals;

public class Frog extends Aquatic{
	public Frog(){
		setName("FrogX");
		setNrOfLegs(4);
		avgSwimDepth = 1;
		waterType = water.FRESHWATER;
	}
	public Frog(String name){
		setName(name);
		setNrOfLegs(4);
		avgSwimDepth = 1;
		waterType = water.FRESHWATER;
	}
}
