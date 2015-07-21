package pack;

import java.util.Scanner;

/**
 * 
 * @author Maria
 *
 */
public class FibonacciEvenSum {
	/**
	 *  
	 */
	private FibonacciEvenSum() {
	}

	/**
	 * 
	 * @param inputNumber
	 *            n
	 * @return the sum of the even terms in O(n)
	 */
	public static int fibonacciTwist(final int inputNumber) {

		final int limitN = 4000000;
		int firstN = 0;
		int secondN = 1;
		int fibo = 0;
		int sumOfEvenTerms = 0;

		if (inputNumber == 0) {
			return firstN;
		} else {
			if (inputNumber == 1) {
				return secondN;
			}
		}
		for (int i = 1; i <= inputNumber; i++) {

			if ((fibo % 2 == 0) && (fibo <= limitN)) {
				sumOfEvenTerms = sumOfEvenTerms + fibo;
			}
			if (fibo < limitN) {
				fibo = firstN + secondN;
				firstN = secondN;
				secondN = fibo;
			}
		}
		return sumOfEvenTerms;
	}

	/**
	 * the sum of even terms in O(log(n))
	 *       n 
	 *  [1 1] = [F(n+1) F(n) ] 
	 *  [1 0]   [F(n) F(n-1) ]
	 */

	/**
	 * 2 matrices are multiplied and the result is put back in fibo.
	 * 
	 * @param fibo
	 *            - matrix
	 * @param mat
	 *            - matrix
	 */
	public static void multiplyMat(final int[][] fibo, final int[][] mat) {

		int w = fibo[0][0] * mat[0][0] + fibo[0][1] * mat[1][0];
		int x = fibo[0][0] * mat[0][1] + fibo[0][1] * mat[1][1];
		int y = fibo[1][0] * mat[0][0] + fibo[1][1] * mat[1][0];
		int z = fibo[1][0] * mat[0][1] + fibo[1][1] * mat[1][1];

		fibo[0][0] = w;
		fibo[0][1] = x;
		fibo[1][0] = y;
		fibo[1][1] = z;
	}

	/**
	 * fibo is raised to the power n.
	 * 
	 * @param fibo
	 *            - matrix
	 * @param inputNumber
	 *            - n
	 */
	public static void powerF(final int[][] fibo, final int inputNumber) {

		int[][] mat = { { 1, 1 }, { 1, 0 } };
		int i = 0;
		for (i = 2; i <= inputNumber; i++) {
			multiplyMat(fibo, mat);
		}
	}

	/**
	 * 
	 * @param inputNumber
	 *            n
	 * 
	 * @return - the nth Fibonacci number
	 */
	public static int fibonacciTwist2(final int inputNumber) {

		int[][] fibo = { { 1, 0 }, { 0, 1 } };
		if (inputNumber == 0) {
			return 0;
		}
		powerF(fibo, inputNumber);
		return fibo[0][0];
	}

	/**
	 * 
	 * @param args
	 *            -no param
	 */
	public static void main(final String[] args) {

		final int limitN = 4000000;
		int sumOfEvenTerms = 0;
		int fibo = 0;

		Scanner keyboardNumber = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int inputNumber = keyboardNumber.nextInt();
		keyboardNumber.close();

		System.out.print("The sum of the even terms is ");
		System.out.print(fibonacciTwist(inputNumber));
		System.out.println();
		System.out.println("Twist 2: ");

		for (int i = 1; i <= inputNumber; i++) {

			fibo = fibonacciTwist2(i);
			if ((fibo % 2 == 0) && (fibo <= limitN)) {
				if (fibo >= 0) {
					sumOfEvenTerms = sumOfEvenTerms + fibo;
				}
			}
		}
		System.out.print(sumOfEvenTerms);
	}
}
