package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	 public Cockroach(){
		 setCanFly(true);
		 setIsDangerous(false);
		 setNrOfLegs(6);
		 setName("cockroach");
		 
	 }
	 public Cockroach(int nrOfLegs,String name,boolean canFly,boolean isDangerous){
		 super(nrOfLegs,name,canFly,isDangerous);
	 }
}
