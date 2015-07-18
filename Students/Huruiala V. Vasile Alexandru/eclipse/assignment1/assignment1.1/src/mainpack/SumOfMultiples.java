package mainpack;

import java.util.Scanner;

/**
 * 
 * @author alexh
 *
 */
public final class SumOfMultiples {
	
	/**
	 *  Convention constructor.
	 */
	private SumOfMultiples() {
	}

	/**
	 * 
	 * @param args 
	 * return the sum of the multiples of 3 or 5 (<= a specified number)
	 */
	public static void main(final String[] args) {
		
		int number = readInt();
		
		int sumOfMultiples = solveInt(number);
		
		System.out.println("The sum of multiples of 3 or 5 below " 
				+ number + " is " + sumOfMultiples);
		
		overflow();
	}
	
	/**
	 * 
	 * @return int from console
	 */
	public static int readInt() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type an integer and press enter!");
		int output = input.nextInt();
		
		input.close();
		return output;
	}
	
	/**
	 * @param number 
	 * @return the sum of the multiples of 3 and 5 below number
	 */
	public static int solveInt(final int number) {
		int sum = 0;
		final int mult1 = 3;
		final int mult2 = 5;
		
		//We first sum all the multiples of 3 and 5 below "number"
		int partialSum = mult1;
		while (partialSum < number) {
			sum += partialSum;
			partialSum += mult1; 
		}
		partialSum = mult2;
		while (partialSum < number) {
			sum += partialSum;
			partialSum += mult2;
		}
		//Keep in mind we were asked to sum the multiples of 3 OR 5.
		//Because we added the multiples of 3 AND 5, the multiples of 15 were
		//added twice, so we will subtract the multiples of 15 below "number"
		//basically |A or B| = |A| + |B| - |A and B|
		int mult3 = mult1 * mult2;
		partialSum = mult3;
		while (partialSum < number) {
			sum -= partialSum;
			partialSum += mult3;
		}
		
		return sum;
	}
	
	/**
	 * @param number 
	 * @return the sum of the multiples of 3 and 5 below number
	 */
	public static long solveLong(final long number) {
		long sum = 0;
		final int mult1 = 3;
		final int mult2 = 5;
		
		//We first sum all the multiples of 3 and 5 below "number"
		int partialSum = mult1;
		while (partialSum < number) {
			sum += partialSum;
			partialSum += mult1; 
		}
		partialSum = mult2;
		while (partialSum < number) {
			sum += partialSum;
			partialSum += mult2;
		}
		//Keep in mind we were asked to sum the multiples of 3 OR 5.
		//Because we added the multiples of 3 AND 5, the multiples of 15 were
		//added twice, so we will subtract the multiples of 15 below "number"
		//basically |A or B| = |A| + |B| - |A and B|
		int mult3 = mult1 * mult2;
		partialSum = mult3;
		while (partialSum < number) {
			sum -= partialSum;
			partialSum += mult3;
		}
		
		return sum;
	}
	
	/**
	 *  Prints the first number that causes an overflow.
	 */
	public static void overflow() {
		long number = 1;
		do {
			number++;
		} while (solveInt((int) number) >= 0);
		System.out.println("Overflow for " + number + " for int.");
		/*
		do {
			number++;
		} while (solveLong(number) >= 0);
		System.out.println("Overflow for " + number + " for Long.");
		*/
	}
	
}
