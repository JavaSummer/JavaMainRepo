package pack;

import java.util.Scanner;

/**
 * 
 * @author Maria
 *
 */
public class SumOfMultiples {
	/**
	 * 
	 */
	private SumOfMultiples() {
	}

	/**
	 * 
	 * @param args
	 *            -no param args
	 */
	public static void main(final String[] args) {

		Scanner keyboardNumber = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int inputNumber = keyboardNumber.nextInt();
		keyboardNumber.close();

		int sumOfMultiples = 0;
		final int firstNumber = 3;
		final int secondNumber = 5;
		final int thirdNumber = 15;
		int mult3 = 0, mult5 = 0, mult15 = 0;

		for (int i = 1; i < inputNumber; i++) {

			if (i % firstNumber == 0) {
				mult3 += i;
			}
			if (i % secondNumber == 0) {
				mult5 += i;
			}
			if (i % thirdNumber == 0) {
				mult15 += i;
			}
		}

		sumOfMultiples = mult3 + mult5 - mult15;
		System.out.print("The sum of multiples is " + sumOfMultiples);

	}
}
