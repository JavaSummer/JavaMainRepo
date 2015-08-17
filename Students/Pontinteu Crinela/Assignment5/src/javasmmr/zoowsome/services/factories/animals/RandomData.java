package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;

import java.util.Random;

public class RandomData {

	public String getRandName() {

		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Random randomGenerator = new Random();
		int randNr = randomGenerator.nextInt(10) + 3;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < randNr; i++) {
			char c = chars[randomGenerator.nextInt(chars.length)];
			sb.append(c);
		}
		return sb.toString();
	}

	public int getRandNrOfLegs(String name) {

		int sum = 0;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			sum += (int) c;
		}
		return sum % 9;

	}
	public double getCost (String species, String type ){
		double cost = 0.0;
		if (Constants.Species.Mammals.equals(species)) {
			if (Constants.Animals.Mammals.Tiger.equals(type)) {
				cost = 4.2;
			} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
				cost = 5.5;
			} else if (Constants.Animals.Mammals.Cow.equals(type)) {
				cost = 7.9;
			} 
		}
		if (Constants.Species.Reptiles.equals(species)){
			if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
				cost = 3.2;
			} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
				cost =  2.9;
			} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
				cost = 3.5;
			}  
		}
		if (Constants.Species.Birds.equals(species)) {
			if (Constants.Animals.Birds.Ostrich.equals(type)) {
				cost = 4.6;
			} else if (Constants.Animals.Birds.Owl.equals(type)) {
				cost = 2.1;
			} else if (Constants.Animals.Birds.Woodpecker.equals(type)) {
				cost = 2.4;
			} 
		}
		if (Constants.Species.Insects.equals(species)) {
			if (Constants.Animals.Insects.Butterfly.equals(type)) {
				cost = 0.2;
			} else if (Constants.Animals.Insects.Spider.equals(type)) {
				cost = 0.1;
			} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
				cost = 0.2;
			}
		}
		if (Constants.Species.Aquatics.equals(species)) {
			if (Constants.Animals.Aquatics.Trout.equals(type)) {
				cost = 0.4;
			} else if (Constants.Animals.Aquatics.Catfish.equals(type)) {
				cost = 0.3;
			} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
				cost = 0.5;
			} 
		}
		
		return cost;
		
	}
	public double getDanger (String species, String type ){
		double danger = 0.0;
		if (Constants.Species.Mammals.equals(species)) {
			if (Constants.Animals.Mammals.Tiger.equals(type)) {
				danger = 0.9;
			} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
				danger = 0.4;
			} else if (Constants.Animals.Mammals.Cow.equals(type)) {
				danger = 0.1;
			} 
		}
		if (Constants.Species.Reptiles.equals(species)){
			if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
				danger = 0.9;
			} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
				danger =  0.4;
			} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
				danger = 0.95;
			}  
		}
		if (Constants.Species.Birds.equals(species)) {
			if (Constants.Animals.Birds.Ostrich.equals(type)) {
				danger = 0.33;
			} else if (Constants.Animals.Birds.Owl.equals(type)) {
				danger = 0.2;
			} else if (Constants.Animals.Birds.Woodpecker.equals(type)) {
				danger = 0.4;
			} 
		}
		if (Constants.Species.Insects.equals(species)) {
			if (Constants.Animals.Insects.Butterfly.equals(type)) {
				danger = 0.1;
			} else if (Constants.Animals.Insects.Spider.equals(type)) {
				danger = 0.8;
			} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
				danger = 0.5;
			}
		}
		if (Constants.Species.Aquatics.equals(species)) {
			if (Constants.Animals.Aquatics.Trout.equals(type)) {
				danger = 0.1;
			} else if (Constants.Animals.Aquatics.Catfish.equals(type)) {
				danger = 0.1;
			} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
				danger = 0.7;
			} 
		}
		
		return danger;
		
	}

	public class MammalAttributes {
	
		public float getRandNormalBodyTemp(String name) {
			float randNr = (float) (Math.random() *40 + 20);
			return (randNr);

		}

		// a random float number in range [0, 100]
		public float getRandPercBodyHair() {
			return (float) (Math.random() * 100);
		}

	}

	public class ReptileAttributes {
		public boolean getRandLaysEggs(String name, String type) {
			int sumName = 0, sumType = 0;
			for (int i = 0; i < name.length(); i++)
				sumName += (int) name.charAt(i);
			for (int i = 0; i < type.length(); i++)
				sumType += (int) type.charAt(i);

			return sumType < sumName;
		}
	}

	public class BirdAttributes {
		public boolean getRandMigrates(String name, String type) {
			return name.length() < type.length();
		}

		public int getRandAvgFlightAltitude(String name, String type) {
			Random randomGenerator = new Random();
			int randNr = randomGenerator.nextInt(5000);
			int sumName = 0;
			for (int i = 0; i < name.length(); i++)
				sumName += (int) name.charAt(i);
			return randNr*10 / (sumName);
		}
	}

	public class AquaticAttributes {
		public int getRandAvgSwimDepth(String name) {
			Random randomGenerator = new Random();
			int randNr = randomGenerator.nextInt(100);
			int sumName = 0;
			for (int i = 0; i < name.length(); i++)
				sumName += (int) name.charAt(i);
			return sumName + randNr;
		}

		public TypesOfWater getRandWaterType(String name) {
			Random randomGenerator = new Random();
			int randNr = randomGenerator.nextInt(name.charAt(0));
			if ( randNr % 2 == 1)
				return TypesOfWater.saltwater;
			else
				return TypesOfWater.freshwater;
		}
	}

	public class InsectAttributes {
		public boolean getRandCanFly() {
			Random randomGenerator = new Random();
			return randomGenerator.nextBoolean();
		}

		public boolean getRandIsDangerous(String name) {
			int sumName = 0;
			for (int i = 0; i < name.length(); i++)
				sumName += (int) name.charAt(i);
			Random randomGenerator = new Random();
			return ((randomGenerator.nextBoolean()) ||(sumName % 2 == 1));
		}
	}

}
