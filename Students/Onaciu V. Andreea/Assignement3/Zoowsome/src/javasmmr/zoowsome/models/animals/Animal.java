package javasmmr.zoowsome.models.animals;

abstract public class Animal {
 int nrOfLegs;
 String name;
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
 }
