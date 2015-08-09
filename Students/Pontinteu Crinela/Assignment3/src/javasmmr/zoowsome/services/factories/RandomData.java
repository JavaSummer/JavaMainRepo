package javasmmr.zoowsome.services.factories;

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

	public class MammalAttributes {
		// the ratio between the ASCII code of the first letter from its name
		// and a random number.
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
			int sumName = 0, sumType = 0;
			for (int i = 0; i < name.length(); i++)
				sumName += (int) name.charAt(i);
			for (int i = 0; i < type.length(); i++)
				sumType += (int) type.charAt(i);
			return randNr*10 / (Math.abs(sumName - sumType));
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
