package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.Constants;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.CaretakerFactory;
import javasmmr.zoowsome.models.employees.Caretaker;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory;
		int nrOfAnimals=50;// nr of species we have at zoo
		final int maximum=16;
		Animal[] a=new Animal[nrOfAnimals];
	    
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
		
		int nrOfEmployees=20;
		Caretaker employees[]=new Caretaker[nrOfEmployees];
		EmployeeAbstractFactory caretakers=new CaretakerFactory();
		for (int i=0;i<nrOfEmployees;i++){
			 employees[i]=(Caretaker) caretakers.getEmployee(Constants.Employees.Employee.Caretaker);
			 
		}
		
		for (int i=0;i<nrOfEmployees;i++){
			for (int j=0;j<nrOfAnimals;j++)
			{
			if(!employees[i].getIsDead() && !a[j].getTakeCareOf()){
			String result = employees[i].takeCareOf(a[j]);
			if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
			employees[i].setIsDead(true);
			
			}
			else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
				continue;
			}
			else {
			a[j].setTakeCareOf(true);
			}
			}
			}
			}
		boolean allTakenCare=true;
		for (int j=0;j<nrOfAnimals;j++){
			if (!a[j].getTakeCareOf()) 
				System.out.println(j+" The caretakers haven't take care of the "+ a[j].getName()+" yet.");
				allTakenCare=false;
			}
		
		if (allTakenCare) System.out.println("All the animals are fine.");
}
}

