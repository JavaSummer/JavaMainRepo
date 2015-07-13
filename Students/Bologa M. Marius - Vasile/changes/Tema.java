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
	 * @return - Sum of the numbers that are smaller than 1000 and are
	 *         multipliers of 3 and 5.
	 */
	private static long mii() {
		long sum = 0;
		int three = 3, five = 5;
		int product = five * three;
		int value = 1000;
		int firstN = (value - 1) / three;
		int secondN = (value - 1) / five;
		int productN = (value - 1) / product;
		int sumT, sumF, sumP;
		sumT = ((firstN * (firstN + 1)) / 2) * three;
		sumF = ((secondN * (secondN + 1)) / 2) * five;
		sumP = ((productN * (productN + 1)) / 2) * product;
		sum = sumT + sumF - sumP;
		return sum;
	}

	/**
	 * 
	 * @param n
	 *           - N.
	 * @return - Sum of the numbers dividing with 3 and 5.
	 */

	private static long readn(final int n) {
		long sum = 0;
		int three = 3, five = 5;
		int product = five * three;
		int value = n;
		int firstN = (value - 1) / three;
		int secondN = (value - 1) / five;
		int productN = (value - 1) / product;
		int sumT, sumF, sumP;
		sumT = ((firstN * (firstN + 1)) / 2) * three;
		sumF = ((secondN * (secondN + 1)) / 2) * five;
		sumP = ((productN * (productN + 1)) / 2) * product;
		sum = sumT + sumF - sumP;
		return sum;
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
