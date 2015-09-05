package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Scarabeus;

public class InsectFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		
		RandomAnimalPropGen rpg = new RandomAnimalPropGen();
		String name = rpg.getRandomName();
		int nrOfLegs = rpg.getRandomNrOfLegs(1, 100);
		boolean canFly = rpg.getRandomCanFly();
		boolean isDangerous = rpg.getRandomIsDangerous();
		double maintenanceCost = rpg.getRandomMaintenanceCost();
		
		if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(name, nrOfLegs, canFly, isDangerous, maintenanceCost, 0.000001); 
		} else if (Constants.Animals.Insects.Scarabeus.equals(type)) {
			return new Scarabeus(name, nrOfLegs, canFly, isDangerous, maintenanceCost, 0.01);
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach(name, nrOfLegs, canFly, isDangerous, maintenanceCost, 0.1995);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
