package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Aquatic;
import javasmmr.zoosome.models.animals.Bird;
import javasmmr.zoosome.models.animals.Insect;
import javasmmr.zoosome.models.animals.Mammal;
import javasmmr.zoosome.models.animals.Reptile;
import javasmmr.zoosome.models.animals.Siege;

public class BigFactory {
	//holding fields
	private AnimalFactory animalFactory;
	private SpeciesFactory[] factories;
	
	public BigFactory() {
		this.animalFactory = new AnimalFactory();
		
		this.factories = new SpeciesFactory[Constants.Species.SPECIES.length];
		
		try {
			for (int i = 0; i < Constants.Species.SPECIES.length; i++) {
				factories[i] = this.animalFactory.getSpeciesFactory(Constants.Species.SPECIES[i]);
			}
		} catch (Exception e) {
			System.out.println("Exception at BigFactory Constructor: " + e.getMessage());
		}
	}
	
	/**
	 * Generates an animal with random parameters of the selected species and type
	 */
	public Animal generateRandomAnimal(int speciesCode, String type) throws Exception {
		return factories[speciesCode].getRandomAnimalOfType(type);
	}
	
	/**
	 * Generates an animal with random parameters of the selected species and random type
	 */
	public Animal generateRandomAnimal(int speciesCode) throws Exception{
		int typeCode = (int) (Math.random() * Constants.Animals.SPECIES_TYPE[speciesCode].length); 
		String type = Constants.Animals.SPECIES_TYPE[speciesCode][typeCode];
		 
		return generateRandomAnimal(speciesCode, type);
	}
	
	/**
	 * Generates an animal with random parameters of random species and random type
	 */
	public Animal generateRandomAnimal() {
		int speciesCode = (int) (Math.random() * Constants.Species.SPECIES.length);
		
		try {
		return generateRandomAnimal(speciesCode);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		} 
	}
	
	/**
	 * Generates an array of animals with random parameters random species and random type
	 */
	public Animal[] generateRandomAnimalAmount(int individuals) {
		Animal[] arr= new Animal[individuals];
		
		for (int i = 0; i < individuals; i++) {
			try {
				arr[i] = generateRandomAnimal();
			} catch (Exception e) {
				System.out.println("Exception at gen rand animal am: " + e.getMessage());
			}
		}
		
		return arr;
	}
	
	/**
	 * Generates an array of animals with random parameters of selected species and random type
	 */
	public Animal[] generateSpeciesEvenAmount(int speciesCode, int individuals) {
		Animal[] arr = new Animal[individuals];
		
		for (int i = 0; i < individuals; i++) {
			try {
				arr[i] = generateRandomAnimal(speciesCode);
			} catch (Exception e) {
				System.out.println("Exception at gen spec even am " + e.getMessage());
			}
		}
		
		return arr;
	}
	
	/**
	 * Generates a matrix of animals with random parameters of all species and all type evenly
	 */
	public Animal[][] generateZooEvenAmount(int individuals) {
		Animal[][] mat = new Animal[Constants.Species.SPECIES.length][individuals];
		
		for (int i = 0; i < Constants.Species.SPECIES.length; i++) {
			mat[i] = generateSpeciesEvenAmount(i, individuals);
		}
		
		return mat;
	}
	
	public static void printDetails(Animal a) {
		if (a instanceof Mammal) {
			Mammal an = (Mammal) a;
			System.out.printf("%s has %d legs, %f normal body temperature, %f%% covered in hair.\n", 
					an.getName(), an.getNoOfLegs(), an.getNormalBodyTemp(), an.getPercBodyHair());
		} else if (a instanceof Reptile) {
			Reptile an = (Reptile) a;
			System.out.printf("%s has %d legs, ", an.getName(), an.getNoOfLegs());
			System.out.println("the fact that it lays eggs is " + an.getLaysEggs() + ".");
		} else if (a instanceof Bird) {
			Bird an = (Bird) a;
			System.out.printf("%s has %d legs, ", an.getName(), an.getNoOfLegs());
			System.out.println("the fact that it migrates is " + an.getMigrates() 
			+ ", its average flight height is " + an.getFlightAltitude() + ".");
		} else if (a instanceof Aquatic) {
			Aquatic an = (Aquatic) a;
			System.out.printf("%s has %d legs, %d average swim depth, lives in %s.\n", 
					an.getName(), an.getNoOfLegs(), an.getAvgSwimDepth(), an.getWaterType().toString());
		} else if (a instanceof Insect) {
			Insect an = (Insect) a;
			System.out.printf("%s has %d legs, ", an.getName(), an.getNoOfLegs());
			System.out.println("the fact that it flies is " + an.getCanFly() 
			+ ", the fact that it is dangerous to humans is " + an.getIsDangerous() + ".");
		} else if (a instanceof Siege) {
			Siege an = (Siege) a;
			System.out.printf("%s has %d wheels, it has %dm range, ", an.getName(), an.getNoOfLegs(), an.getRange());
			System.out.println("the fact that it can be moved is " + an.getIsMobile() + ".");
		}
	}
}
