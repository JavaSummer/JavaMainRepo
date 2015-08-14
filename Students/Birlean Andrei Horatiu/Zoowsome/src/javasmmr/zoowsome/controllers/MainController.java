package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.*;
import java.util.*;

public class MainController 
{
	public static void main(String[] args) throws Exception 
	{
		
		//Create 4 animals
		AnimalFactory animalFactory = new AnimalFactory();
		SpeciesFactory mammalFactory = animalFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory reptileFactory = animalFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory aquaticFactory = animalFactory.getSpeciesFactory(Constants.Species.Aquatics);
		
		ArrayList<Animal> a = new ArrayList<Animal>();
		
		a.add(mammalFactory.getAnimal(Constants.Animals.Mammals.Tiger));
		a.add(mammalFactory.getAnimal(Constants.Animals.Mammals.Monkey));
		a.add(reptileFactory.getAnimal(Constants.Animals.Reptiles.Aligator));
		a.add(aquaticFactory.getAnimal(Constants.Animals.Aquatics.Shark));
		
		//Create 4 CareTakers
		
		EmployeeFactory employeeFactory = new EmployeeFactory();
		
		ArrayList<Employee> c = new ArrayList<Employee>();
		
		c.add(employeeFactory.getEmployee(Constants.Employees.CareTaker));
		c.add(employeeFactory.getEmployee(Constants.Employees.CareTaker));
		c.add(employeeFactory.getEmployee(Constants.Employees.CareTaker));
		c.add(employeeFactory.getEmployee(Constants.Employees.CareTaker));
		
		for(int i = 0;i<a.size();i++)
		{
			for(int j = 0;j<c.size();j++)
			{
				if((a.get(i).getTakenCareOf() == false) && (c.get(j).getIsDead() == false))
				{
					String result = ((CareTaker) c.get(j)).takeCareOf(a.get(i));
					if(result.equals(Constants.Employees.CareTakers.TCO_KILLED))
					{
						c.get(j).setIsDead(true);
					}
					else if (result.equals(Constants.Employees.CareTakers.TCO_NO_TIME))
					{
						break;
					}
					else
					{
						a.get(i).setTakenCareOf(true);
					}
					
				}
			}
		}
		for (int i = 0;i < a.size();i++)
		{
			if(a.get(i).getTakenCareOf())
			{
				System.out.println("The animal has been taken care of");
			}
			else
			{
				System.out.println("The animal has not been taken care of");
			}
		}
	}
	
}
