package javasmmr.zoowsome.models.animals;



abstract public class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;
	 
	 public boolean getCanFly(){
		 return canFly;
	 }
	 
	 public boolean getIsDangerous(){
		 return isDangerous;
	 }
	 
	 public void setCanFly(boolean canFly){
		 this.canFly=canFly;
	 }
	 
	 public void setIsDangerous(boolean isDangerous){
		 this.isDangerous=isDangerous;
	 }
	 public Insect(int nrOfLegs,String name,double cost,double danger,boolean canFly,boolean isDangerous){
		 super(danger,cost);
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setCanFly(canFly);
		 setIsDangerous(isDangerous);
	 }
	 public Insect(double cost,double danger){
		 super(cost,danger);
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setCanFly(canFly);
		 setIsDangerous(isDangerous);	
	 }
}
