package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
 
	/**
	 * 'default' constructor for setting the attributes to some predefined values
	 */
	public Tiger() {
		setNrOfLegs(4);
		setNormalBodyTemp(37); // (? not sure how should I write this) normalBodyTemp = 37;
		setName("Crookshanks");
		percbodyHair = 100/100;
		
	}
	/**
	 * constructor with arguments
	 * @param name - the name of the tiger
	 * the rest of the attributes are the 'default' ones (e.g. all tigers normally have 4 legs etc)
	 */
	
	public Tiger(String name){
		setNrOfLegs(4);
		setNormalBodyTemp(37);
		setPercBodyTemp(100/100);
	}
}
