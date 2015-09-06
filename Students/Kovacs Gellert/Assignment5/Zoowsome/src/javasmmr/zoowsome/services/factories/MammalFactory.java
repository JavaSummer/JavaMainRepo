package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Wolf;

public class MammalFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		
		RandomAnimalPropGen rpg = new RandomAnimalPropGen();
		String name = rpg.getRandomName();
		int nrOfLegs = rpg.getRandomNrOfLegs(1, 10);
		float normalBodyTemp = rpg.getRandomNormalBodyTemp();
		float percBodyHair = rpg.getRandomPercBodyHair();
		double maintenanceCost = rpg.getRandomMaintenanceCost();
		
		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(name, nrOfLegs, normalBodyTemp, percBodyHair, maintenanceCost, 0.15); // leave empty constructor, for now!
		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(name, nrOfLegs, normalBodyTemp, percBodyHair, maintenanceCost, 0.99);
		} else if (Constants.Animals.Mammals.Wolf.equals(type)) {
			return new Wolf(name, nrOfLegs, normalBodyTemp, percBodyHair, maintenanceCost, 0.80);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
