package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.CaretakerFactory;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class CreationOfModels {
	public Animal[] createAnimals(int nrOfAnimals) throws Exception{
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory;
		Animal[] a=new Animal[nrOfAnimals];
		final int maximum=16;
		for (int i=0;i<nrOfAnimals;i++){
		int choice = (int)(Math.random()*maximum); 
		switch (choice){
		case 0: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Birds.Albatross);
			 break;
		}
		case 1:{
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Birds.Flamingo);
			 break;
		}
		case 2:{
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Birds.Owl);
		     break;
		}
		case 3: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Birds.Penguin);
			 break;
		}
		case 4: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Aquatics.Salmon);
			 break;
		}
		case 5: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Aquatics.SeaHorse);
			 break;
		}
		case 6: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Aquatics.Shark);
			 break;
		}
		case 7: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Insects.Butterfly);
			 break;
		}
		case 8: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Insects.Cockroach);
			 break;
		}
		case 9: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Insects.Spider);
			 break;
		}
		case 10: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Mammals.Cow);
			 break;
		}
		case 11: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Mammals.Monkey);
			 break;
		}
		case 12: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Mammals.Tiger);
			 break;
		}
		case 13: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Reptiles.Amphisbaenian);
			 break;
		}
		case 14: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Reptiles.Chameleon);
			 break;
		}
		case 15: {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
			 a[i]=speciesFactory.getAnimal(Constants.Animals.Reptiles.Tuataras);
			 break;
		}
		default: {
			System.out.println("Problem occurs in the creation of animals.");
		}
		}

		}
		return a;
		}

		public Caretaker[] createCaretakers(int nrOfEmployees) throws Exception{
			Caretaker employees[]=new Caretaker[nrOfEmployees];
			EmployeeAbstractFactory caretakers=new CaretakerFactory();
			for (int i=0;i<nrOfEmployees;i++){
				 employees[i]=(Caretaker) caretakers.getEmployee(Constants.Employees.Employee.Caretaker);
				 
			}
			return employees;
		}
}
