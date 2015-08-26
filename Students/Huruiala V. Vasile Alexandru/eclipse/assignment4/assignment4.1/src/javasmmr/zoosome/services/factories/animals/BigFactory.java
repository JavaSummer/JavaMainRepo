package javasmmr.zoosome.services.factories.animals;

import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Iterator;

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
	public Animal generateRandomAnimal(int speciesCode, String type) {
		try {
			return this.factories[speciesCode].getRandomAnimalOfType(type);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	/**
	 * Generates an animal with random parameters of the selected species and random type
	 */
	public Animal generateRandomAnimal(int speciesCode) {
		int typeCode = (int) (Math.random() * Constants.Animals.SPECIES_TYPE[speciesCode].length); 
		String type = Constants.Animals.SPECIES_TYPE[speciesCode][typeCode];
		 
		return generateRandomAnimal(speciesCode, type);
	}
	
	/**
	 * Generates an animal with random parameters of random species and random type
	 */
	public Animal generateRandomAnimal() {
		int speciesCode = (int) (Math.random() * Constants.Species.SPECIES.length);
		
		return generateRandomAnimal(speciesCode);
	}
	
	/**
	 * Generates an array of animals with random parameters random species and random type
	 */
	public Animal[] generateRandomAnimalAmount(int individuals) {
		Animal[] arr= new Animal[individuals];
		
		for (int i = 0; i < individuals; i++) {
			arr[i] = generateRandomAnimal();
		}
		
		return arr;
	}
	
	/**
	 * Generates an array of animals with random parameters of selected species and random type
	 */
	public Animal[] generateSpeciesEvenAmount(int speciesCode, int individuals) {
		Animal[] arr = new Animal[individuals];
		
		for (int i = 0; i < individuals; i++) {
			arr[i] = generateRandomAnimal(speciesCode);
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
	
	public Employee generateRandomEmployeeOfJob(String job){
		try {
		return this.efactories[0].getRandomEmployeeOfType(job);
		} catch (Exception e) {
			System.out.println("gre " + e.getMessage());
			return null;
		}
	}
	
	public Employee[] generateRandomeEmployeeTeamOfJob(int size, String job){
		Employee[] arr = new Employee[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = generateRandomEmployeeOfJob(job);
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
				+ ", its average flight height is " + an.getAvgFlightAltitude() + ", ");
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
	
	public static void printArrayDetails(Animal[] a) {
		for (int i = 0; i < a.length; i++) {
			printDetails(a[i]);
		}
	}
	
	public static void printArrayListAnimalDetails(ArrayList<Animal> al) {
		Iterator<Animal> itr = al.iterator();
		while(itr.hasNext()) {
			printDetails(itr.next());
		}
	}
	
	public static void nicePrint(final String s, final int verticalEmptyCount, final int verticalFillerCount, final int horizontalFillerCount) {
		final int len = s.length();
		
		// Before empty
		for (int e = 0; e < verticalEmptyCount; e++) {
			System.out.println();
		}
		// Before filler
		for (int vf = 0; vf < verticalFillerCount; vf++) {
			for (int hf = 0; hf < len + 2 * horizontalFillerCount + 2; hf++) {
				System.out.print("#");
			}
			System.out.println();
		}
		// Main line
			// Before hFiller
		for (int hf = 0; hf < horizontalFillerCount; hf++) {
			System.out.print("#");
		}
			// Main message
		System.out.print(" " + s + " ");
			// After hFiller
		for (int hf = 0; hf < horizontalFillerCount; hf++) {
			System.out.print("#");
		}
		System.out.println();
		// After filler
		for (int vf = 0; vf < verticalFillerCount; vf++) {
			for (int hf = 0; hf < len + 2 * horizontalFillerCount + 2; hf++) {
				System.out.print("#");
			}
			System.out.println();
		}
		// After empty
		for (int e = 0; e < verticalEmptyCount; e++) {
			System.out.println();
		}
	}
	
	public static void nicePrint(final String s) {
		final int verticalEmptyCount = 1;
		final int verticalFillerCount = 1;
		final int horizontalFillerCount = 3;
		
		nicePrint(s, verticalEmptyCount, verticalFillerCount, horizontalFillerCount);
	}
	
	public static void printDetails(Employee e) {
		if (e instanceof Caretaker) {
			Caretaker em = (Caretaker) e;
			System.out.printf("%s, id: %d, paid %s, works for %f", em.getName(), em.getId(), em.getSalary(), em.getWorkingHours());
			System.out.println(" Dead?: " + em.getIsDead() + ".");
		}
	}
	
	public static void printArrayDetails(Employee[] e) {
		for (int i = 0; i < e.length; i++) {
			printDetails(e[i]);
		}
	}
	
	public static void printArrayListEmployeeDetails(ArrayList<Employee> el) {
		Iterator<Employee> itr = el.iterator();
		while (itr.hasNext()) {
			printDetails(itr.next());
		}
	}
	
	public static ArrayList<Animal> convertAnimalArrayToArrayList(Animal[] zooLine) {
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		for (int i = 0; i < zooLine.length; i++) {
			animalList.add(zooLine[i]);
		}
		
		return animalList;
	}
	
	public static ArrayList<Animal> convertAnimalMatrixToArrayList(Animal[][] zooLine) {
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		for (int i = 0; i < zooLine.length; i++) {
			for (int j = 0; j < zooLine[i].length; j++) {
				animalList.add(zooLine[i][j]);
			}
		}
		
		return animalList;
	}
	
	public static ArrayList<ArrayList<Animal>> convertAnimalMatrixToArrayListArrayList(Animal[][] zooLine) {
		ArrayList<ArrayList<Animal>> animalListList = new ArrayList<ArrayList<Animal>>();
		
		for (int i = 0; i < zooLine.length; i++) {
			ArrayList<Animal> animalList = new ArrayList<Animal>();
			for (int j = 0; j < zooLine[i].length; j++) {
				animalList.add(zooLine[i][j]);
			}
			animalListList.add(animalList);
		}
		
		return animalListList;
	}
	
	public static ArrayList<Employee> convertEmployeeArrayToArrayList(Employee[] employeeTeam) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		for (int i = 0; i < employeeTeam.length; i++) {
			employeeList.add(employeeTeam[i]);
		}
		
		return employeeList;
	}
}
