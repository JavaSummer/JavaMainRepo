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
		int n = 0;

		if (inputNumber % firstNumber == 0) {
			n = inputNumber / firstNumber - 1;
		} else {
			n = inputNumber / firstNumber;
		}
		mult3 = firstNumber * (n * (n + 1)) / 2;

		if (inputNumber % secondNumber == 0) {
			n = inputNumber / secondNumber - 1;
		} else {
			n = inputNumber / secondNumber;
		}
		mult5 = secondNumber * (n * (n + 1)) / 2;

		if (inputNumber % thirdNumber == 0) {
			n = inputNumber / thirdNumber - 1;
		} else {
			n = inputNumber / thirdNumber;
		}
		mult15 = thirdNumber * (n * (n + 1)) / 2;

		sumOfMultiples = mult3 + mult5 - mult15;
		System.out.print("The sum of multiples is " + sumOfMultiples);

	}
}
