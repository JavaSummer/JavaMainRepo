package javasmmr.zoowsome.models.animals;

public class Orca extends Aquatic{
	public Orca(){
		setName("OrcaX");
		setNrOfLegs(0);
		avgSwimDepth = 20;
		waterType=water.SALTWATER;
	}
	public Orca(String name){
		setName(name);
		setNrOfLegs(0);
		avgSwimDepth = 20;
		waterType=water.SALTWATER;
	}
}
