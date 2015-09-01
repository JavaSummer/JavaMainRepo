package javasmmr.zoowsome.services.factories.animal;

/**
 * 
 * @author Marius Bologa
 *
 */
public class AnimalFactory {
	/**
	 * 
	 * @param type
	 *            .
	 * @return .
	 * @throws Exception
	 *             .
	 */
	public SpeciesFactory getSpeciesFactory(String type) throws Exception {
		if (Constants.Species.Mammal.equals(type)) {
			return new MammalFactory();
		} else if (Constants.Species.Reptile.equals(type)) {
			return new ReptilesFactory();
		} else if (Constants.Species.Bird.equals(type)) {
			return new BirdsFactory();
		} else if (Constants.Species.Insect.equals(type)) {
			return new InsectsFactory();
		} else if (Constants.Species.Aquatic.equals(type)) {
			return new AquaticFactory();
		} else {
			throw new Exception("Invalid species exception");
		}
	}
}
