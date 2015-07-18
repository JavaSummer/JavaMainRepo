package tema;

import java.util.Scanner;

/**
 * 
 * @author Marius Bologa
 *
 */

public final class Tema {
	/**
	 * 
	 */

	private Tema() {

	}

	/**
	 * 
	 * @return - Sum of the numbers that are smaller than 1000 and are multipliers
	 *  of 3 and 5.
	 */
	private static long mii() {
		long sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	/**
	 * 
	 * @param n
	 *            - N.
	 * @return - Sum of the numbers dividing with 3 and 5.
	 */

	private static long readn(final int n) {
		long sum1 = 0;
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum1 += i;
			}
		}
		return sum1;
	}

	/**
	 * 
	 * @param args
	 *            - Command line arguments not used.
	 */

	public static void main(final String[] args) {
		int value;
		long suma, suma1;
		System.out.println("The sum of the numbers that are dividing "
				+ "by 5 and 3, and are smaller than 1000 is:");
		suma1 = mii();
		System.out.println(suma1);
		System.out.println("Give a value:");
		Scanner dataIn = new Scanner(System.in);

		value = dataIn.nextInt();
		suma = readn(value);	
		System.out.println("The sum of the numbers that are dividing by 5 "
				+ "and 3 smaller than " + value + " is:");
		System.out.println(suma);
		
		
		dataIn.close();
	}

}
