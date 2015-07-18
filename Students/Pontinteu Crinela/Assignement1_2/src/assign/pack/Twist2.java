package assign.pack;

import java.util.*;

public class Twist2 {

	public static void main(String[] args) {
		// Solution based on Donald E. Knuth matrix identity
		int n, aux;
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Input the number ");
			n = in.nextInt();
			if (n <= 0) {
				System.out.println("The number is not valid, input another one !");
			}

		} while (n < 0);
		aux = n;
        
		int[][] result = { { 1, 0 }, { 0, 1 } }; // identity matrix.
		int[][] q = { { 1, 1 }, { 1, 0 } };

		while (n > 0) {
			if (n % 2 == 1) {
				multiplyMat(result, q);
			}
			n = n / 2;
			multiplyMat(q, q);
		}

		System.out.println("The " + aux + "th termen of Fibonacci sequence is " + result[1][0]);
	}

	private static void multiplyMat(int[][] m, int[][] n) {
		int a11, a12, a21, a22;
		a11 = m[0][0] * n[0][0] + m[0][1] * n[1][0];
		a12 = m[0][0] * n[0][1] + m[0][1] * n[1][1];
		a21 = m[1][0] * n[0][0] + m[1][1] * n[1][0];
		a22 = m[1][0] * n[0][1] + m[1][1] * n[1][1];

		m[0][0] = a11;
		m[0][1] = a12;
		m[1][0] = a21;
		m[1][1] = a22;
	}

}
