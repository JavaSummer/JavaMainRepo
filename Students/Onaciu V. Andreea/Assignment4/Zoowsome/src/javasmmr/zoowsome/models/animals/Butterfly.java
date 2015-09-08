package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
 public Butterfly(double cost,double danger){
	 super(cost,danger);
	 setCanFly(true);
	 setIsDangerous(false);
	 setNrOfLegs(6);
	 setName("butterfly");
	 
 }
 public Butterfly(int nrOfLegs,String name,double cost,double danger,boolean canFly,boolean isDangerous){
	 super(nrOfLegs,name,cost,danger,canFly,isDangerous);
 }
}
