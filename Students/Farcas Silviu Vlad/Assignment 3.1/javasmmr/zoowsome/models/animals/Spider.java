package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider() {
		setName("SpiderX");
		setNrOfLegs(8);
		canFly = false;
		isDangerous = true;
	}
	public Spider(String name){
		setName(name);
		setNrOfLegs(8);
		canFly = false;
		isDangerous = true;
	}
}
