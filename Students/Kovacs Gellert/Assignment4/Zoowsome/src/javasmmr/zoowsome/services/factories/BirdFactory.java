package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Mockingjay;
import javasmmr.zoowsome.models.animals.Pigeon;


public class BirdFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		
		RandomPropertyGenerator rpg = new RandomPropertyGenerator();
		String name = rpg.getRandomName();
		int nrOfLegs = rpg.getRandomNrOfLegs(1, 10);
		int avgFlightAltitude = rpg.getRandomAvgFligthAltitude(5, 100);
		boolean migrates = rpg.getRandomMigrates();
		double maintenanceCost = rpg.getRandomMaintenanceCost();
		
		if (Constants.Animals.Birds.Eagle.equals(type)) {
			return new Eagle(name, nrOfLegs, migrates, avgFlightAltitude, maintenanceCost, 0.5); 
		} else if (Constants.Animals.Birds.Pigeon.equals(type)) {
			return new Pigeon(name, nrOfLegs, migrates, avgFlightAltitude, maintenanceCost, 0.002);
		} else if (Constants.Animals.Birds.Mockingjay.equals(type)) {
			return new Mockingjay(name, nrOfLegs, migrates, avgFlightAltitude, maintenanceCost, 0.09);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
