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
	 *            - calculating the matrix dimension
	 * @return - spiral martix
	 */
	public static int[][] buildSpiralMatrix(final int n) {

		int[][] spiralMatrix = new int[n][n];
		int spiralSize = n - 1;
		int fillCell = (int) (Math.pow(n, 2) + 1);

		for (int i = 0; i <= (n + 1) / 2; i++) {
			for (int j = i; j <= spiralSize; j++) { // right

				spiralMatrix[i][j] = --fillCell;
			}
			for (int k = i + 1; k <= spiralSize; k++) { // down
				spiralMatrix[k][spiralSize] = --fillCell;
			}
			for (int l = spiralSize - 1; l >= i; l--) { // left
				spiralMatrix[spiralSize][l] = --fillCell;
			}
			for (int p = spiralSize - 1; p > i; p--) { // up
				spiralMatrix[p][i] = --fillCell;
			}
			spiralSize--;
		}
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

		do {
			sideLength = sideLength + 1;
			spiralMatrix = buildSpiralMatrix(sideLength);
			ratio = primeRatio(spiralMatrix, sideLength);
			System.out.println(ratio + "%");
			System.out.print("The side length is " + sideLength + " ");

		} while (ratio >= below);
		System.out.println();
		System.out.print("The side length is " + sideLength + " ");
		System.out.print("and the ratio is " + ratio + "%");
	}
}
