package javasmmr.zoowsome.services.factories;

public class AnimalFactory {
	public SpeciesFactory getSpeciesFactory(String type) throws Exception {
		if (Constants.Species.Mammals.equals(type)) {
			return new MammalFactory();
		} else if (Constants.Species.Reptiles.equals(type)) {
			return new ReptileFactory();
		} else if (Constants.Species.Birds.equals(type)) {
			return new BirdFactory();
		} else if (Constants.Species.Insects.equals(type)) {
			return new InsectFactory();
		} else if (Constants.Species.Aquatics.equals(type)) {
			return new AquaticFactory();
		} else if (Constants.Species.Random.equals(type)) {
			return new RandomFactory();
		} else
			throw new Exception("Invalid species exception");
	}
}
