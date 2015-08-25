package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.WaterType;

public class RandomPropertyGenerator {
	
	final int MAX_NAME_LENGTH = 20;
	final float MIN_ALLOWED_BODY_TEMP = 10.0f;
	Random rand = new Random();
	
	int getRandomNrOfLegs(int min, int max) {
		return min + rand.nextInt(max-min+1);
	}
	
	String getRandomName() {
		int length = 1 + rand.nextInt(MAX_NAME_LENGTH);
		final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 ";
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < length; i++) {
			int pos = rand.nextInt(alphabet.length());
			sb.append(alphabet.charAt(pos));
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
	
	
}
