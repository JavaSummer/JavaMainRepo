package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {

	/**
	 * 'default' constructor for setting the attributes to some predefined values
	 */
	public Monkey() {
		setNrOfLegs(4);
		setNormalBodyTemp(37); // (? not sure how should I write this) normalBodyTemp = 37;
		setName("Rafiki");
		percbodyHair = 100/100;
		
	}
	/**
	 * constructor with arguments
	 * @param name - the name of the monkey
	 * the rest of the attributes are the 'default' ones (e.g. all monkeys normally have 4 legs etc)
	 */
	
	public Monkey(String name){
		setNrOfLegs(4);
		setNormalBodyTemp(37);
		setPercBodyTemp(100/100);
	}
}
