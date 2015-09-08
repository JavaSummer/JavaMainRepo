package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{
	 public Spider(double cost,double danger){
		 super(cost,danger);
		 setCanFly(false);
		 setIsDangerous(true);
		 setNrOfLegs(6);
		 setName("spider");
		 
	 }
	 
	 public Spider(int nrOfLegs,String name,double cost,double danger,boolean canFly,boolean isDangerous){
		 super(nrOfLegs,name,cost,danger,canFly,isDangerous);
	 }
}
