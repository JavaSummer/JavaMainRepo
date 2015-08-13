package javasmmr.zoowsome.models.animals;

abstract public class Mammal extends Animal {
	 private float normalBodyTemp;
	 private float percBodyHair;
	 
	 public float getNormalBodyTemp(){
		 return normalBodyTemp;
	 }
	 
	 public float getPercBodyHair(){
		 return percBodyHair;
	 }
	 
	 public void setNormalBodyTemp(float bodyTemp){
		 this.normalBodyTemp=bodyTemp;
	 }
	 
	 public void setPercBodyHair(float bodyHair){
		 this.percBodyHair=bodyHair;
	 }
	 
	 public Mammal(int nrOfLegs,String name,float bodyTemp,float bodyHair){
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setNormalBodyTemp(bodyTemp);
		 setPercBodyHair(bodyHair);
	 }
	 public Mammal(){
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setNormalBodyTemp(normalBodyTemp);
		 setPercBodyHair(percBodyHair);	
	 }
}
