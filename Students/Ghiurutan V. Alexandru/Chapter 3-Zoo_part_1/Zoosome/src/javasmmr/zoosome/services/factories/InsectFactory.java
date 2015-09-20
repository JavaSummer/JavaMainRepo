package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Butterfly;
import javasmmr.zoosome.models.animals.Cockroach;
import javasmmr.zoosome.models.animals.Spider;

public class InsectFactory extends SpeciesFactory {
	// Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly();
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach();
		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider();
		} else {
			throw new Exception("Ilegal animal exception!");
		}
	}
}
