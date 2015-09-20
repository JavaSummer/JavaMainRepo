package javasmmr.zoosome.services.factories.animals;

import javasmmr.zoosome.services.factories.Constants;

public class AnimalFactory {
	public SpeciesFactory getSpeciesFactory(final String type) throws Exception {
		if (Constants.Species.MAMMAL.equals(type)) {
			return new MammalFactory();
		} else if (Constants.Species.REPTILE.equals(type)) {
			return new ReptileFactory();
		} else if (Constants.Species.BIRD.equals(type)) {
			return new BirdFactory();
		} else if (Constants.Species.AQUATIC.equals(type)) {
			return new AquaticFactory();
		} else if (Constants.Species.INSECT.equals(type)) {
			return new InsectFactory();
		} else if (Constants.Species.SIEGE.equals(type)) {
			return new SiegeWorkshop();
		} else {
			System.out.println("af");
			throw new Exception("Invalid species exceprion!");
		}

	}
}
