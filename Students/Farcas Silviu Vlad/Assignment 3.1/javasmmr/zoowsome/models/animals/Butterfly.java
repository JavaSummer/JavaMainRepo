package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
	public Butterfly(){
		setName("ButterfllyX");
		setNrOfLegs(6);
		canFly = true;
		isDangerous = false;
	}
	public Butterfly(String name){
		setName(name);
		setNrOfLegs(6);
		canFly = true;
		isDangerous = false;
	}
}
