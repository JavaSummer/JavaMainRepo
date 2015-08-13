package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
 public Butterfly(){
	 setCanFly(true);
	 setIsDangerous(false);
	 setNrOfLegs(6);
	 setName("butterfly");
	 
 }
 public Butterfly(int nrOfLegs,String name,boolean canFly,boolean isDangerous){
	 super(nrOfLegs,name,canFly,isDangerous);
 }
}
