package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory{
	public Animal getAnimal (String type) throws Exception{
		if(Constants.Animal.Mammal.Tiger.equals(type)){
			return new Tiger(AnimalFactory.names[(int)(Math.random()*100)]);
		}else if (Constants.Animal.Mammal.Monkey.equals(type)){
			return new Monkey(AnimalFactory.names[(int)(Math.random()*100)]);
		}else if (Constants.Animal.Mammal.Cow.equals(type)){
			return new Cow(AnimalFactory.names[(int)(Math.random()*100)]);
		}else {
			throw new Exception("Invalid animal exception!");
		}
		
	}
}
