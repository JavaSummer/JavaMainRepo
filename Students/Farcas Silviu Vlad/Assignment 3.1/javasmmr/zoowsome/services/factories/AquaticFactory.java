package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory{
	public Animal getAnimal (String type) throws Exception{
		if(Constants.Animal.Aquatic.Dolphin.equals(type)){
			return new Dolphin(AnimalFactory.names[(int)(Math.random()*100)]);
		}else if (Constants.Animal.Aquatic.Frog.equals(type)){
			return new Frog(AnimalFactory.names[(int)(Math.random()*100)]);
		}else if(Constants.Animal.Aquatic.Orca.equals(type)){
			return new Orca(AnimalFactory.names[(int)(Math.random()*100)]);
		}else{
			throw new Exception ("Invalid animal exception!");
		}
	}
}
