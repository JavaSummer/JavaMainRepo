package javasmmr.zoowsome.models.animals;
abstract public class Animal implements Killer{
 int nrOfLegs;
 String name;
 final double maintenanceCost;
 final double dangerPerc;
 boolean takeCareOf;
 public int getNrOfLegs(){
	 return nrOfLegs;
 }
 public void setNrOfLegs(int legs){
	 this.nrOfLegs=legs;
 }
 public String getName(){
	 return name;
 }
 public void setName(String name){
	 this.name=name;
 }
 
 public double getMaintenanceCost(){
	 return maintenanceCost;
 }
 public double getDangerPerc(){
	 return dangerPerc;
 }
 
 public void setTakeCareOf(boolean care){
	 this.takeCareOf=care;
 }
 
 public boolean getTakeCareOf(){
	 return takeCareOf;
 }
 
 public  Animal(double maintenanceCost,double dangerPerc){
	 this.maintenanceCost=maintenanceCost;
	 this.dangerPerc=dangerPerc;
 }
 
 
 public boolean kill(){
	 double random=Math.random();
	 if (random<dangerPerc) return true;
	 else return false;
 }
 }
interface Killer{
	public boolean kill();
}
