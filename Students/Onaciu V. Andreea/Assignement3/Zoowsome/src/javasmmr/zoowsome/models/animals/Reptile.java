package javasmmr.zoowsome.models.animals;

abstract public class Reptile extends Animal {
    private boolean laysEggs;
	 
	 
	 public boolean getLaysEggs(){
		 return laysEggs;
	 }
	 
	 public void setLaysEggs(boolean eggs){
		 this.laysEggs=eggs;
	 }
	 
	 public Reptile(int nrOfLegs,String name,boolean eggs){
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setLaysEggs(eggs);
	 }
	 public Reptile(){
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setLaysEggs(laysEggs);	
	 }

}
