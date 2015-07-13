import java.util.Scanner;

public class Fibonacci {

	// / The recursive method of Fibonacci series
	static long FR(long n) {
		if ((n == 2) || (n == 1))
			return n;
		return FR(n - 1) + FR(n - 2);
	}

	// //////////////////////////////////////////////////////////////////////////////////////
	/*
	 * I need this function to for the matrix representation of Fibonacci. The
	 * mathematic representation is n ( [1] [1] ) = ( [Fibo(n+1)] [Fibo (n) ] )
	 * ( [1] [0] ) = ( [ Fibo(n) ] [Fibo(n-1)] )
	 */
	// //////////////////////////////////////////////////////////////////////////////////////
	static void matrix_multiplication(long m1[][], long m2[][]) {
		long a1 = (m1[0][0] * m2[0][0]) + (m1[0][1] * m2[1][0]);
		long a2 = (m1[0][0] * m2[0][1]) + (m1[0][1] * m2[1][1]);
		long a3 = (m1[1][0] * m2[0][0]) + (m1[1][1] * m2[0][1]);
		long a4 = (m1[1][0] * m2[0][1]) + (m1[1][1] * m2[1][1]);

		m1[0][0] = a1;
		m1[0][1] = a2;
		m1[1][0] = a3;
		m1[1][1] = a4;
	}

	// //////////////////////////////////////////////////////////////////////////////////////
	static long fiboLog(long n) {
		long nr[][] = { { 1, 0 }, { 0, 1 } };
		long fibo[][] = { { 1, 1 }, { 1, 0 } };
		if (n < 2)
			return n;
		while (n > 0) {
			if (n % 2 == 1) {
				matrix_multiplication(nr, fibo);
			}
			n = n / 2;
			matrix_multiplication(fibo, fibo);
		}
		return nr[1][0];
	}

	// //////////////////////////////////////////////////////////////////////////////////////
	static void recursive(long n) {
		System.out.println("Recursive ------------");
		int i, j;
		long sumFR = 0;
		for (j = 1; j <= n + 1 && FR(j) < 4000000; j++) {
			System.out.print(FR(j) + " ");
			if (FR(j) % 2 == 0)
				sumFR += FR(j);
		}
		System.out.println();
		System.out
				.println("The sum of the even numbers of Fibonacci series is:"
						+ sumFR);
	}

	// //////////////////////////////////////////////////////////////////////////////////////
	static void iterative(long n) {
		long f0 = 1;
		long f1 = 2;
		long f2 = 0;
		long sum = 2;
		int i;
		System.out.println("Iterative ------------");
		System.out.print(f0 + " ");
		System.out.print(f1);
		for (i = 2; i <= n && f2 < 4000000; i++) {
			f2 = f1 + f0;
			if (f2 % 2 == 0)
				sum += f2;
			f0 = f1;
			f1 = f2;
			System.out.print(" " + f2);
		}
		System.out.println();
		System.out
				.println("The sum of the even numbers of Fibonacci series is "
						+ sum);
	}

	// //////////////////////////////////////////////////////////////////////////////////////
	public static void main(String arg[]) {
		// ///////// Twist 0 /////////////
		long n, j, i, sum = 2, sumFR = 0;
		long f0 = 1;
		long f1 = 2;
		long f2 = 0;
		Scanner read = new Scanner(System.in);
		System.out.print("Please insert the range: ");
		n = read.nextLong();
		recursive(n);
		// //////// Twist 1 ///////////
		System.out.println();
		iterative(n);
		// ////////Twist 2 ///////////
		long sumLog = 0;
		System.out.println();
		System.out
				.println("The matrix version of Fibonacci series ------------");
		for (i = 2; i <= n + 2 && fiboLog(i) < 4000000; i++) {
			if (fiboLog(i) % 2 == 0)
				sumLog += fiboLog(i);
			System.out.print(fiboLog(i) + " ");
		}
		System.out.println();
		System.out
				.println("The sum of the even numbers of Fibonacci series si "
						+ sumLog);
	}
}
