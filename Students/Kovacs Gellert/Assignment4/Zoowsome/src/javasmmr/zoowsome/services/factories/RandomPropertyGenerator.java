package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.WaterType;

public class RandomPropertyGenerator {
	
	final static int MAX_NAME_LENGTH = 20;
	final static float MIN_ALLOWED_BODY_TEMP = 10.0f;
	final static int MAINTENANCE_COST_MULTIPLIER = 6;
	Random rand = new Random();
	
	int getRandomNrOfLegs(int min, int max) {
		return min + rand.nextInt(max-min+1);
	}
	
	String getRandomName() {
		int length = 1 + rand.nextInt(MAX_NAME_LENGTH);
		final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 ";
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < length; i++) {
			int index = rand.nextInt(alphabet.length());
			sb.append(alphabet.charAt(index));
		}
		
		return sb.toString();
	}
	
	int getRandomAvgSwimDepth(int min, int max) {
		return min + rand.nextInt(max-min+1);
	}
	
	WaterType getRandomWaterType() {
		if(rand.nextBoolean()) 
			return WaterType.FRESHWATER;
		else 
			return WaterType.SALTWATER;
	}
	
	int getRandomAvgFligthAltitude(int min, int max) {
		return min + rand.nextInt(max-min+1);
	}
	
	boolean getRandomMigrates() {
		return rand.nextBoolean();
	}
	
	boolean getRandomCanFly() {
		return rand.nextBoolean();
	}
	
	boolean getRandomIsDangerous() {
		return rand.nextBoolean();
	}
	
	float getRandomNormalBodyTemp() {
		float temp = rand.nextFloat();
		while (temp < MIN_ALLOWED_BODY_TEMP) temp*=10;
		return temp;
	}
	
	float getRandomPercBodyHair() {
		return rand.nextFloat();
	}
	
	boolean getRandomLaysEggs() {
		return rand.nextBoolean();
	}
	
	double getRandomMaintenanceCost() {
		return rand.nextDouble() * MAINTENANCE_COST_MULTIPLIER;
		//restrictions for value to remain in [0.1,8.0] are made in the constructor of the Animal class
	}
	
	double getRandomDangerPerc() {
		return rand.nextDouble();
	}
}
