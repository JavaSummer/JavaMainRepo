package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;
import java.util.Random;

public class RandomEmployeePropGen {
	private static final int MAX_NAME_LENGTH = 20;
	private static final double MIN_WORKING_HOURS = 9.0;
	
	Random rand = new Random();

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
	
	long getRandomId() {
		long id = rand.nextLong();
		
		while (id < 1000000000000l) { // 10^12
			id *=10;
			id += rand.nextInt(10); 
		}		
		while (id > 10000000000000l) { // 10^13
			id /= 10;
		}
		
		return id;
	}
	
	BigDecimal getRandomSalary() {
		BigDecimal salary = new BigDecimal(rand.nextInt(10000));
		return salary;
	}
	
	double getRandomWorkingHours() {
		double wH = rand.nextDouble();
		while (wH < MIN_WORKING_HOURS) {
			wH *= 10;
		}
		return wH;
	}
}
