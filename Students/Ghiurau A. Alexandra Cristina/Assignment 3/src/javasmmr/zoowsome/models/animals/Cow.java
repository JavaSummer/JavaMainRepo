package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	
	/**
	 * 'default' constructor for setting the attributes to some predefined values
	 */
	public Cow() {
		setNrOfLegs(4);
		setNormalBodyTemp(37); // (? not sure how should I write this) normalBodyTemp = 37;
		setName("Milka");
		percbodyHair = 100/100;
		
	}
	/**
	 * constructor with arguments
	 * @param name 
	 */
	
	public Cow(String name){
		setNrOfLegs(4);
		setNormalBodyTemp(37);
		setPercBodyTemp(100/100);
	}
}
