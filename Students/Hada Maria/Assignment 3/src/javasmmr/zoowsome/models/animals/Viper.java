package javasmmr.zoowsome.models.animals;

public class Viper extends Reptile{

	public Viper() {
		setNrOfLegs(0);
		setName("Nagini");
		setLaysEggs(true);
	}
	
	public Viper(String name, boolean eggs) {
		setNrOfLegs(0);
		setName(name);
		setLaysEggs(eggs);
	}

}
