package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory{
	public Animals getAnimal(String type) throws Exception{
		if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else if (Constants.Animals.Insects.Cockroach.equals(type)){
			return new Cockroach((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else
			throw new Exception("Invalid animal exceeption!");
		
		
	}
}
