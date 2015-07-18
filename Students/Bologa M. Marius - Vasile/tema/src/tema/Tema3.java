package tema;

import java.util.Scanner;

/**
 * 
 * @author Marius Bologa
 *
 */

public final class Tema3 {
	/**
	 * 
	 */
	private Tema3() {

	}

	/**
	 * 
	 * @param n
	 *            N.
	 * @return True if a number is true false if not.
	 */
	private static boolean isEven(final long n) {
		return (n % 2 == 0);
	}

	/**
	 * 
	 * @param n
	 *            N.
	 * @return The sum of the first n numbers in Fibonacci sequence.
	 */
	// O(n) complexity;
	private static long fib(final int n) {
		long sum = 0;
		long a = 1, b = 1;
		for (int i = 3; i <= n; i++) {
			long c = a + b;
			a = b;
			b = c;
			if (isEven(b)) {
				sum += b;
			}
		}
		return sum;
	}

	/**
	 * 
	 * @param m
	 *            M
	 * @param n
	 *            N
	 * @return The matrix that is obtained after multiplying 2 matrices.
	 */
	private static int[][] multMatrix(final int[][] m, final int[][] n) {
		int a = m[0][0] * n[0][0] + m[0][1] * n[1][0];
		int b = m[0][0] * n[0][1] + m[0][1] * n[1][1];
		int c = m[1][0] * n[0][0] + m[1][1] * n[0][1];
		int d = m[1][0] * n[0][1] + m[1][1] * n[1][1];
		int[][] ret = { { a, b }, { c, d } };
		return ret;
	}

	/**
	 * 
	 * @param n
	 *            N
	 * @return The sum of the first n numbers in Fibonacci sequence.
	 */
	//O(log(n)) complexity
	private static long fib1(final int n) {
		int nCopy = n;
		long sum = 0;
		if (nCopy <= 1) {
			return 0;
		}
		int[][] fiboM = { { 1, 1 }, { 1, 0 } };
		int[][] fiboMCopy = fiboM;

		while (nCopy > 1) {
			fiboM = multMatrix(fiboMCopy, fiboM);
			if (isEven(fiboM[1][0])) {
				sum += fiboM[1][0];
			}
			nCopy--;
		}
		return sum;
	}

	/**
	 * 
	 * @param args
	 *            Command line arguments not used.
	 */

	public static void main(final String[] args) {
		int value;
		long sum = 0, sum1 = 0;

		Scanner dataIn = new Scanner(System.in);
		System.out.println("Give the number:");
		value = dataIn.nextInt();
		int x = value;

		sum = fib(x);
		System.out.println("The sum of the even numbers in O(n) complexity"
		+ " in fibonacci sequence is:");
		System.out.println(sum);
		sum1 = fib1(x);
		System.out.println("The sum of the even numbers in O(log(n)) complexity"
		+ " in fibonacci sequence is:");
		System.out.println(sum1);
		dataIn.close();
	}

}
