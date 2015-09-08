package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	 public Cockroach(double cost,double danger){
		 super(cost,danger);
		 setCanFly(true);
		 setIsDangerous(false);
		 setNrOfLegs(6);
		 setName("cockroach");
		 
	 }
	 public Cockroach(int nrOfLegs,String name,double cost,double danger,boolean canFly,boolean isDangerous){
		 super(nrOfLegs,name,cost,danger,canFly,isDangerous);
	 }
}
