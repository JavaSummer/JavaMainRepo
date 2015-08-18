package javasmmr.zoosome.services.factories.animals;

import javasmmr.zoosome.models.animals.*;
import javasmmr.zoosome.models.employees.Caretaker;
import javasmmr.zoosome.models.employees.Employee;
import javasmmr.zoosome.services.factories.Constants;
import javasmmr.zoosome.services.factories.employees.*;

public class BigFactory {
	//holding fields
	private AnimalFactory animalFactory;
	private SpeciesFactory[] factories;
	private HumanFactory humanFactory;
	private EmployeeFactory[] efactories;
	
	public BigFactory() {
		this.animalFactory = new AnimalFactory();
		
		this.factories = new SpeciesFactory[Constants.Species.SPECIES.length];
		
		try {
			for (int i = 0; i < Constants.Species.SPECIES.length; i++) {
				this.factories[i] = this.animalFactory.getSpeciesFactory(Constants.Species.SPECIES[i]);
			}
		} catch (Exception e) {
			System.out.println("Exception 1 at BigFactory Constructor: " + e.getMessage());
		}
		
		this.humanFactory = new HumanFactory();
		
		this.efactories = new EmployeeFactory[Constants.Jobs.JOBS.length];
		
		try {
			for (int i = 0; i < Constants.Jobs.JOBS.length; i++) {
				this.efactories[i] = this.humanFactory.getEmployeeFactory(Constants.Jobs.JOBS[i]);
			}
		} catch (Exception e) {
			System.out.println("Exception 2 at BigFactory Constructor: " + e.getMessage());
		}
	}
	
	/**
	 * Generates an animal with random parameters of the selected species and type
	 */
	public Animal generateRandomAnimal(int speciesCode, String type) throws Exception {
		return this.factories[speciesCode].getRandomAnimalOfType(type);
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
	
	public Employee generateRandomEmployee(String job){
		try {
		return this.efactories[0].getRandomEmployeeOfType(job);
		} catch (Exception e) {
			System.out.println("gre " + e.getMessage());
			return null;
		}
	}
	
	public Employee[] generateRandomeEmployeeTeam(int size, String job){
		Employee[] arr = new Employee[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = generateRandomEmployee(job);
		}
		
		return arr;
	}
	
	public static void printDetails(Animal a) {
		if (a instanceof Mammal) {
			Mammal an = (Mammal) a;
			System.out.printf("%s has %d legs, %f normal body temperature, %f%% covered in hair, ", 
					an.getName(), an.getNoOfLegs(), an.getNormalBodyTemp(), an.getPercBodyHair());
		} else if (a instanceof Reptile) {
			Reptile an = (Reptile) a;
			System.out.printf("%s has %d legs, ", an.getName(), an.getNoOfLegs());
			System.out.print("the fact that it lays eggs is " + an.getLaysEggs() + ", ");
		} else if (a instanceof Bird) {
			Bird an = (Bird) a;
			System.out.printf("%s has %d legs, ", an.getName(), an.getNoOfLegs());
			System.out.print("the fact that it migrates is " + an.getMigrates() 
				+ ", its average flight height is " + an.getFlightAltitude() + ", ");
		} else if (a instanceof Aquatic) {
			Aquatic an = (Aquatic) a;
			System.out.printf("%s has %d legs, %d average swim depth, lives in %s, ", 
					an.getName(), an.getNoOfLegs(), an.getAvgSwimDepth(), an.getWaterType().toString());
		} else if (a instanceof Insect) {
			Insect an = (Insect) a;
			System.out.printf("%s has %d legs, ", an.getName(), an.getNoOfLegs());
			System.out.print("the fact that it flies is " + an.getCanFly() 
			+ ", the fact that it is dangerous is " + an.getIsDangerous() + ", ");
		} else if (a instanceof Siege) {
			Siege an = (Siege) a;
			System.out.printf("%s has %d wheels, it has %dm range, ", an.getName(), an.getNoOfLegs(), an.getRange());
			System.out.print("the fact that it can be moved is " + an.getIsMobile() + ", ");
		} else {
			System.out.println("Animalic exception.");
		}
		
		System.out.printf("Maintanance: %f, Danger: %f%%, ", a.getMaintenanceCost(), a.getDangerPerc());
		System.out.println("fed: " + a.getTakenCareOf() + ".");
	}
	
	public static void printDetails(Employee e) {
		if (e instanceof Caretaker) {
			Caretaker em = (Caretaker) e;
			System.out.printf("%s, id: %d, paid %s, works for %f", em.getName(), em.getId(), em.getSalary(), em.getWorkingHours());
			System.out.println(" Dead?: " + em.getIsDead() + ".");
		}
	}
}
