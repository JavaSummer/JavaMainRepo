package myPackage;

import java.util.*;

public class Operations {
	private int greater;

	protected void ADD(int[] a, int[] b, int m, int n) {
		if (m >= n) {
			greater = m;
		} else
			greater = n;
		int i = 0;
		int j = 0;
		System.out.println("The addition of the polynomials is: ");
		while ((i < m) && (j < n)) {
			int result = a[i] + b[j];
			if (result >= 0) {
				System.out.print("+" + result + "*" + "x^" + greater-- + " ");
			} else {
				System.out.print(result + "*" + "x^" + greater-- + " ");
			}
			i += 1;
			j += 1;
		}
		while (i < m) {
			if (a[i] >= 0) {
				System.out.print("+" + a[i] + "*" + "x^" + greater-- + " ");
			} else {
				System.out.print(a[i] + "*" + "x^" + greater-- + " ");
			}
			i += 1;
		}

		while (j < n) {
			if (b[j] >= 0) {
				System.out.print("+" + b[j] + "*" + "x^" + greater-- + " ");
			} else {
				System.out.print(b[j] + "*" + "x^" + greater-- + " ");
			}
			j += 1;
		}

	}

	protected void SUBTRACT(int[] a, int[] b, int m, int n) {

		if (m >= n) {
			greater = m;
		} else
			greater = n;
		int i = 0;
		int j = 0;
		System.out.println("The subtraction of the polynomials is: ");
		while ((i < m) && (j < n)) {
			int result = a[i] - b[j];
			if (result >= 0) {
				System.out.print("+" + result + "*" + "x^" + greater-- + " ");
			} else {
				System.out.print(result + "*" + "x^" + greater-- + " ");
			}
			i += 1;
			j += 1;
		}
		while (i < m) {
			if (a[i] >= 0) {
				System.out.print("+" + a[i] + "*" + "x^" + greater-- + " ");
			} else {
				System.out.print(a[i] + "*" + "x^" + greater-- + " ");
			}
			i += 1;
		}

		while (j < n) {
			if (b[j] >= 0) {
				System.out.print("+" + b[j] + "*" + "x^" + greater-- + " ");
			} else {
				System.out.print(b[j] + "*" + "x^" + greater-- + " ");
			}
			j += 1;
		}
		System.out.println("");
	}

	protected void MULTIPLY(int[] a, int[] b, int m, int n) {
		int[] c;
		c = new int[m + n];
		int result;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				result = 1;
				result = a[i] * b[j];
				c[i + j] += result;
			}
		}
		System.out.println("The result of multiplication is : ");
		int z = m + n;
		int maxDegree = z;
		for (int k = 0; k < z; k++) {
			if (c[k] >= 0) {
				System.out.print("+" + c[k] + "*" + "x^" + maxDegree-- + " ");
			} else {
				System.out.print(c[k] + "*" + "x^" + maxDegree-- + " ");
			}
		}
		System.out.println("");
	}

	protected void MUL_SCALAR(int[] a, int[] b, int m, int n, int K) {

		int ct1 = m;
		int ct2 = n;
		for (int i = 0; i < m; i++) {
			int result = a[i] * K;
			if (result >= 0) {
				System.out.print("+" + result + "*" + "x^" + ct1-- + " ");
			} else {
				System.out.print(result + "*" + "x^" + ct1-- + " ");
			}
		}
		System.out.println();
		for (int j = 0; j < n; j++) {
			int result = b[j] * K;
			if (result >= 0) {
				System.out.print("+" + result + "*" + "x^" + ct2-- + " ");
			} else {
				System.out.print(result + "*" + "x^" + ct2-- + " ");
			}

		}

	}

	protected void EVAL(int[] a, int[] b, int m, int n, int K) {
		int ct1 = n;
		int ct2 = m;
		if ((K >= ct1)) {
			for (int i = 0; i < n; i++) {
				if (a[i] >= 0) {
					System.out.print("+" + a[i] + "*" + "x^" + ct1-- + " ");
				} else {

					System.out.print(a[i] + "*" + "x^" + ct1-- + " ");
				}

			}
			System.out.println("");
		}

		else {
			ct1 = K;
			for (int i = 0; i < K; i++) {
				if (a[i] >= 0) {
					System.out.print("+" + a[i] + "*" + "x^" + ct1-- + " ");
				} else {
					System.out.print(a[i] + "*" + "x^" + ct1-- + " ");
				}
			}
			System.out.println("");
		}

		if ((K >= ct2)) {
			for (int j = 0; j < m; j++) {
				if (b[j] >= 0) {
					System.out.print("+" + b[j] + "*" + "x^" + ct2-- + " ");
				} else {

					System.out.print(b[j] + "*" + "x^" + ct2-- + " ");
				}

			}
			System.out.println("");
		}

		else {
			ct2 = K;
			for (int j = 0; j < K; j++) {
				if (b[j] >= 0) {
					System.out.print("+" + b[j] + "*" + "x^" + ct2-- + " ");
				} else {
					System.out.print(b[j] + "*" + "x^" + ct2-- + " ");
				}
			}
			System.out.println("");
		}
	}
}
