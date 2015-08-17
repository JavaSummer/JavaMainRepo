package javasmmr.zoowsome.services.factories.employees;

import java.math.BigDecimal;
import java.util.Random;

public class GenerateData {
	static long uniqueId = 999_999_999;
	public long getId (){
		
	    return ++uniqueId;
	}

	public String getName() {
	
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
	
	public BigDecimal getSalary(){
		BigDecimal sal = new BigDecimal (1000);
		return sal;
	}
	public double getWorkingHours (){
		return 8.0;
	}

}
