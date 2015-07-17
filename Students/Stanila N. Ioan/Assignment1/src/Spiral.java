
/**
 * 
 * @author Ion
 * A class built for constructing spiraling matrices and performing operations
 * on them.
 * !!! Due to efficiency reasons, it is not recommended to use matrices.
 */
public class Spiral {
	
	/**
	 * Basic constructor.
	 * The side length is set by default to be 3.
	 */
	Spiral() {
		n = 3;
	};
	
	/**
	 * Square matrix of variable side length.
	 */
	private int[][] a;
	/**
	 * Size of the matrix.
	 */
	private int n;
	
	/**
	 * Set the size of the matrix.
	 * @param k - size of the matrix.
	 */
	public final void setN(final int k) {
		n = k;
	}
	
	/**
	 * Prints the matrix in the console.
	 */
	public final void showMatrix() {
		allocateMatrix();
		padWithZeroes();
		buildMatrix();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	/**
	 * Finds the maximum side length for which the ratio of prime numbers from
	 * the main diagonals falls under '0.1'.
	 * @return maximum side length.
	 */
	public final int maximumSideLength() {
		int i = 3;
		double ratio = 1.0;
		while (ratio > 0.1) {
			n = i;
			allocateMatrix();
			padWithZeroes();
			buildMatrix();
			ratio = (double) getNumberOfPrimes() / (2 * n - 1);
			i += 2;
		}
		return n - 2;
	}
	
	/**
	 * Get the ratio of the prime numbers from the main diagonals.
	 * @return the ratio.
	 */
	public final double getRatio() {
		double ratio = 1.0;
		allocateMatrix();
		padWithZeroes();
		buildMatrix();
		ratio = (double) getNumberOfPrimes() / (2 * n - 1);
		
		return ratio;
	}
	
	/**
	 * Allocates memory for the matrix.
	 */
	private void allocateMatrix() {
		a = null;
		a = new int[n][n];
	}
	
	/**
	 * Pads the matrix with zero.
	 */
	private void padWithZeroes() {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = 0;
			}
		}
	}
	
	/**
	 * Builds the spiraling matrix.
	 */
	private void buildMatrix() {
		int i = n / 2;
		int j = n / 2;
		int k = 1;
		/*
		 * Variable "direction" used for storing the padding direction.
		 * 1 - go right.
		 * 2 - go up.
		 * 3 - go left.
		 * 4 - go down.
		 */
		a[i][j] = k;
		int direction = 1;
		while (i != n - 1 || j != n - 1) {
			a[i][j] = k;
			switch (direction) {
			case 1:
				if (k != 1 && a[i - 1][j] == 0) {
					// turn up
					direction = 2;
					i--;
				} else {
					j++;
				}
				break;
			case 2:
				if (a[i][j - 1] == 0) {
					// turn left
					direction = 3;
					j--;
				} else {
					i--;
				}
				break;
			case 3:
				if (a[i + 1][j] == 0) {
					// turn down
					direction = 4;
					i++;
				} else {
					j--;
				}
				break;
			case 4:
				if (a[i][j + 1] == 0) {
					// turn right
					direction = 1;
					j++;
				} else {
					i++;
				}
				break;
			default:
				break;
			}
			k++;
		}
		a[i][j] = k;
	}
	
	/**
	 * Find the number of primes from the two diagonals of the matrix.
	 * @return the number of primes.
	 */
	private int getNumberOfPrimes() {
		int s = 0;
		int i;
		for (i = 0; i < n; i++) {
			if (isPrime(a[i][i])) {
				s++;
			}
			if (isPrime(a[i][n - i - 1])) {
				s++;
			}
		}
		return s;
	}
	
	/**
	 * Finds the maximum side length for which the ratio of prime numbers from
	 * the main diagonals falls under '0.1'.
	 * @return the maximum side length.
	 */
	public final int maximumSideLengthEfficient() {
		// 26241
		int k = 1, step = 1, dist = 2;
		int nrOfPrimes = 0, nrOfNumbers = 1;
		int sideLength = 1;
		double ratio = 1.0;
		while (ratio > 0.1) {
			while (step <= 4) {
				k += dist;
				if (isPrime(k)) {
					nrOfPrimes++;
				}
				nrOfNumbers++;
				step++;
			}
			step = 1;
			dist += 2;
			sideLength += 2;
			ratio = (double) nrOfPrimes / nrOfNumbers;
		}
		return sideLength;
	}
	
	/**
	 * Verifies if a number is prime.
	 * @param x - the number to verify.
	 * @return true if the number is prime, false otherwise.
	 */
	private boolean isPrime(final int x) {
		int i = 3;
		if (x == 2) {
			return true;
		} else if (x == 0 || x == 1 || x % 2 == 0) {
			return false;
		} else {
			int s = (int) Math.sqrt(x);
			while (i <= s) {
				if (x % i == 0) {
					return false;
				}
				i += 2;
			}
		}
		return true;
	}
}