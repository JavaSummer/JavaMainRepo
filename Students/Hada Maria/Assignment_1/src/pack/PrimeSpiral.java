package pack;

/**
 * 
 * @author Maria
 *
 */
public class PrimeSpiral {
	/**
	 * 
	 */
	private PrimeSpiral() {
	}

	/**
	 * 
	 * @param n
	 *            - calculating the matrix diagonals
	 * @return - spiral matrix
	 */
	public static int[][] buildSpiralMatrix(final int n) {

		int[][] spiralMatrix = new int[n][n];
		int sideLength = n;
		int m = n;
		int i = 0;

		do {
			spiralMatrix[m - 1][m - 1] = sideLength * sideLength;
			spiralMatrix[m - 1][i] = spiralMatrix[m - 1][m - 1] - sideLength + 1;
			spiralMatrix[i][i] = spiralMatrix[m - 1][i] - sideLength + 1;
			spiralMatrix[i][m - 1] = spiralMatrix[i][i] - sideLength + 1;
			i++;
			m = m - 1;
			sideLength = sideLength - 2;
		} while (sideLength >= 1);

		return spiralMatrix;
	}

	/**
	 * 
	 * @param number
	 *            -> to be checked
	 * @return -> 1 if prime, 0 otherwise
	 */
	public static int checkIfPrime(final int number) {

		int prime = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				prime = 1;
			}
		}
		if (prime == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * 
	 * @param spiralM
	 *            ->the spiral matrix
	 * @param n
	 *            -> size of the matrix
	 * @return ratioPrime
	 */
	public static int primeRatio(final int[][] spiralM, final int n) {

		double ratio = 0;
		int ratioPrime = 0;
		int diagonalNumbers = 2 * n - 1;
		int primeNumbers = 0;
		final int cent = 100;

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if ((row == col) || (row + col == n - 1)) {
					if (spiralM[row][col] != 1) {
						if (checkIfPrime(spiralM[row][col]) == 1) {
							primeNumbers++;
						}
					}
				}
			}
		}
		ratio = ((double) (primeNumbers) / (double) (diagonalNumbers)) * cent;
		ratioPrime = (int) (ratio);
		return ratioPrime;
	}

	/**
	 * 
	 * @param args
	 *            -no param
	 */
	public static void main(final String[] args) {

		int[][] spiralMatrix = new int[1][1];
		final int below = 10;
		final int start = 7;
		int sideLength = start;
		int ratio = 0;

		spiralMatrix = buildSpiralMatrix(sideLength);
		ratio = primeRatio(spiralMatrix, sideLength);
		/*for (int i = 0; i < sideLength; i++) {
			for (int j = 0; j < sideLength; j++) {
				System.out.print(spiralMatrix[i][j] + "\t");
			}
			System.out.println();
		}*/
		System.out.print("The side length is " + sideLength + " ");
		System.out.println(ratio + "%");

		do {
			sideLength = sideLength + 2;
			spiralMatrix = buildSpiralMatrix(sideLength);
			ratio = primeRatio(spiralMatrix, sideLength);
			System.out.print("The side length is " + sideLength + " ");
			System.out.println(ratio + "%");
		} while (ratio >= below);

		System.out.println();
		System.out.print("The side length is " + sideLength + " ");
		System.out.print("and the ratio is " + ratio + "%");
	}
}