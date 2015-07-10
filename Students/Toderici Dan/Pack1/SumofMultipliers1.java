package Pack1;

import java.util.Scanner;

/**
 * . javadoc comment
 * 
 * @author T
 *
 */
public final class SumofMultipliers {
	/**
	 * . javadoc comment
	 */
	public static void main(final String[] args) {
		Scanner numberFromKeyboard = new Scanner(System.in);
		/*
		 * this is how i solved twist 1 also i could have used buffer from pack
		 * java.io.*
		 */
		System.out.println("Insert number:");
		int number, sumofMultiplier = 0;
		number = numberFromKeyboard.nextInt();
		/*
		 * solving twist 2 for 2,147,483,648 a problem will occur if the number
		 * var is int for 9,223,372,036,854,775,808 a problem will occur if the
		 * number var is long
		 */
		for (int i = 3; i <= number; i += 3) {
			sumofMultiplier += i;
		}
		for (int i = 5; i <= number; i += 5) {
			sumofMultiplier += i;
		}
		for (int i = 15; i <= number; i += 15) {
			sumofMultiplier -= i;
		}

		System.out.println("SumofMultipliers of 3 or 5 smaller than " + number);
		System.out.println(sumofMultiplier);
		
		numberFromKeyboard.close();
	}

}
