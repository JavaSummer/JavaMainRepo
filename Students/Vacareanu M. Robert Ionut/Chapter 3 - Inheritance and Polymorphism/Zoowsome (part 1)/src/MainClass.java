
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainClass {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Random);
		Animal[] animals = new Animal[50];
		for(int i=0; i<50; i++){
			animals[i] = speciesFactory1.getAnimal("RandomAttributes");
			animals[i].printAllAttributes();
			System.out.println();
		}
	}

}
