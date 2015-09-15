package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	
	public Tiger(Integer nrOfLegs, String name, float normalBodyTemp, float hairPerc){
		
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(hairPerc);
	}
	
	public Tiger (){
	    this(new Integer(4),"tiger",37,0.9f);	
	}

}
