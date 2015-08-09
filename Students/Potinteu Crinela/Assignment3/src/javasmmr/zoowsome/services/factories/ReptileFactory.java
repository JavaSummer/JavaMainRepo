
package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {

		if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile(); 
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle();
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();
		} else {
			throw new Exception("Invalid animal exception!");
		}  
	}
}
