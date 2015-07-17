
public class Fibonacci {
	
	/**
	 * Container for the limit of the sum of the Fibonacci numbers.
	 */
	private int limit;
	
	/**
	 * Basic constructor.
	 * @param limitForTheSum - the limit of the sum. 
	 */
	Fibonacci(final int limitForTheSum) {
		limit = limitForTheSum;
	};
	
	/**
	 * Computes the sum in exponential time.
	 * @return the sum of the Fibonacci numbers.
	 */
	public final int exponential() {
		int sum = 0;
		int i = 0, term = 0;
		while (term < limit) {
			term = fibRec(i);
			if (term % 2 == 0) {
				sum += term;
			}
			i++;
		}
		return sum;
	}
	
	/**
	 * Computes recursively the Nth Fibonacci number.
	 * @param n - the position of the number in the series.
	 * @return the Nth Fibonacci number.
	 */
	private int fibRec(final int n) {
		if (n < 3) {
			return 1;
		} else {
			return fibRec(n - 1) + fibRec(n - 2);
		}
	}

	/**
	 * Computes the sum in O(n) time.
	 * @return the sum of the Fibonacci numbers.
	 */
	public final long polynomialN() {
		long sum = 0;
		long prev2 = 1, prev1 = 1, curr = 0;
		if (limit == 1 || limit == 2) {
			return 0;
		} else {
			while (curr < limit) {
				curr = prev1 + prev2;
				if (curr % 2 == 0) {
					sum += curr;
				}
				prev2 = prev1;
				prev1 = curr;
			}
		}
		return sum;
	}
	
	/**
	 * Computes the sum in O(log(n)) time.
	 * @return the sum of the Fibonacci numbers.
	 */
	public final int logarithmic() {
		int sum = 0, term = 0, i = 1;
		while (term < limit) {
			term = fibFromMatrix(i);
			if (term % 2 == 0) {
				sum += term;
			}
			i++;
		}
		return sum;
	}
	
	/**
	 * Computes the Nth Fibanacci number.
	 * @param k - the position of the number is the series.
	 * @return the Nth Fibonacci number.
	 */
	private int fibFromMatrix(int k) {
		// matrix for Fibonacci
		int[][] a = {
				{1, 1},
				{1, 0} };
		int[][] b = {
				{1, 0},
				{0, 1} };
		while (k > 0) {
			if (k % 2 == 1) {
				b = multMatrix(a, b);
			}
			k /= 2;
			a = multMatrix(a, a);
		}
		return b[0][1];
	}
	
	/**
	 * Multiplies two 2x2 matrices. 
	 * @param a - first matrix.
	 * @param b - second matrix.
	 * @return resulting square matrix of 2x2.
	 */
	private int[][] multMatrix(final int[][] a, final int[][] b) {
		int c1 = a[0][0] * b[0][0] + a[0][1] * b[1][0];
		int c2 = a[0][0] * b[0][1] + a[0][1] * b[1][1];
		int c3 = a[1][0] * b[0][0] + a[1][1] * b[1][0];
		int c4 = a[1][0] * b[0][1] + a[1][1] * b[1][1];
		int[][] result = {
			{c1, c2},
			{c3, c4} };
		return result;
	}
}
