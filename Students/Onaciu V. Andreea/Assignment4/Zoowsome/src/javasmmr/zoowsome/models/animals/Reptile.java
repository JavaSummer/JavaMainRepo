package javasmmr.zoowsome.models.animals;

abstract public class Reptile extends Animal {
    private boolean laysEggs;
	 
	 
	 public boolean getLaysEggs(){
		 return laysEggs;
	 }
	 
	 public void setLaysEggs(boolean eggs){
		 this.laysEggs=eggs;
	 }
	 
	 public Reptile(int nrOfLegs,String name,double cost,double danger,boolean eggs){
		 super(cost,danger);
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setLaysEggs(eggs);
	 }
	 public Reptile(double cost,double danger){
		 super(cost,danger);
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setLaysEggs(laysEggs);	
	 }

}
