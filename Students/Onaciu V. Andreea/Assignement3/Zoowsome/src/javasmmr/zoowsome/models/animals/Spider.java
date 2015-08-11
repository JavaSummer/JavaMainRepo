package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{
	 public Spider(){
		 setCanFly(false);
		 setIsDangerous(true);
		 setNrOfLegs(6);
		 setName("spider");
		 
	 }
	 
	 public Spider(int nrOfLegs,String name,boolean canFly,boolean isDangerous){
		 super(nrOfLegs,name,canFly,isDangerous);
	 }
}
