package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	
	public Monkey(Integer nrOfLegs, String name, float normalBodyTemp, float hairPerc){
		
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(hairPerc);
	}
	
	public Monkey (){
	    this(new Integer(2),"monkey",37,0.75f);	
	}

}
