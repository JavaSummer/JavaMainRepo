package javasmmr.zoowsome.services.factories;

import java.util.Random;
import javasmmr.zoowsome.models.animals.*;

public class RandomFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		//Random attributes
		Random randomGenerator = new Random();
		int random = randomGenerator.nextInt(15);
		int legs = randomGenerator.nextInt(9);
		float bodyTemp = randomGenerator.nextInt(1000) / 10f;
		float bodyHair = randomGenerator.nextFloat();
		Boolean eggs = randomGenerator.nextBoolean();
		Boolean migrate = randomGenerator.nextBoolean();
		int altitude = randomGenerator.nextInt(15000);
		int depth = randomGenerator.nextInt(10000);
		WaterType water;
		if (randomGenerator.nextInt(2) == 0) {
			water = WaterType.FRESHWATER;
		} else {
			water = WaterType.SALTWATER;
		}
		Boolean fly = randomGenerator.nextBoolean();
		Boolean dangerous = randomGenerator.nextBoolean();
		
		if (type.equals("Random")) {
			if (random == 0) {
				return new Cow();
			} else if (random == 1) {
				return new Monkey();
			} else if (random == 2) {
				return new Tiger();
			} else if (random == 3) {
				return new Nightjar();
			} else if (random == 4) {
				return new Owl();
			} else if (random == 5) {
				return new Woodpecker();
			} else if (random == 6) {
				return new Goldfish();
			} else if (random == 7) {
				return new Shark();
			} else if (random == 8) {
				return new Whale();
			} else if (random == 9) {
				return new Butterfly();
			} else if (random == 10) {
				return new Cockroach();
			} else if (random == 11) {
				return new Spider();
			} else if (random == 12) {
				return new Crocodile();
			} else if (random == 13) {
				return new Lizard();
			} else if (random == 14) {
				return new Snake();
			} else {
				throw new Exception("Invalid animal exception!");
			}
		} else if (type.equals("RandomAttributes")) {
			if (random == 0) {
				return new Cow(legs, bodyTemp, bodyHair);
			} else if (random == 1) {
				return new Monkey(legs, bodyTemp, bodyHair);
			} else if (random == 2) {
				return new Tiger(legs, bodyTemp, bodyHair);
			} else if (random == 3) {
				return new Nightjar(legs, migrate, altitude);
			} else if (random == 4) {
				return new Owl(legs, migrate, altitude);
			} else if (random == 5) {
				return new Woodpecker(legs, migrate, altitude);
			} else if (random == 6) {
				return new Goldfish(legs, depth, water);
			} else if (random == 7) {
				return new Shark(legs, depth, water);
			} else if (random == 8) {
				return new Whale(legs, depth, water);
			} else if (random == 9) {
				return new Butterfly(legs, fly, dangerous);
			} else if (random == 10) {
				return new Cockroach(legs, fly, dangerous);
			} else if (random == 11) {
				return new Spider(legs, fly, dangerous);
			} else if (random == 12) {
				return new Crocodile(legs, eggs);
			} else if (random == 13) {
				return new Lizard(legs, eggs);
			} else if (random == 14) {
				return new Snake(legs, eggs);
			} else {
				throw new Exception("Invalid animal exception!");
			}
		} else {
			throw new Exception("Not a good type!");
		}
	}
}
