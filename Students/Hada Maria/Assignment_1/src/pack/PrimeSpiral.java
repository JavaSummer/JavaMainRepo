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
		int[] firstRow = new int[n];
		int[] secondRow = new int[n];
		int[] thirdRow = new int[n];
		int[] fourthRow = new int[n];

		// the lower part of the principal diagonal
		for (int i = 0; i <= (n + 1) / 2 - 1; i++) {
			firstRow[i] = (int) (Math.pow(1 + 2 * i, 2));
			spiralMatrix[0][i] = firstRow[i];
		}

		// the lower part of the secondary diagonal
		for (int i = 0; i <= (n + 1) / 2 - 1; i++) {
			secondRow[i] = firstRow[i] - 2 * i;
			spiralMatrix[1][i] = secondRow[i];
		}

		// the upper part of the principal diagonal
		for (int i = 0; i <= (n + 1) / 2 - 1; i++) {
			thirdRow[i] = firstRow[i] - 4 * i;
			spiralMatrix[2][i] = thirdRow[i];
		}

		// the upper part of the secondary diagonal
		for (int i = 0; i <= (n + 1) / 2 - 1; i++) {
			fourthRow[i] = firstRow[i] - 6 * i;
			spiralMatrix[3][i] = fourthRow[i];
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
		int diagonalNumbers = 1;
		int primeNumbers = 0;
		final int cent = 100;

		for (int row = 0; row <= 3; row++) {
			for (int col = 0; col <= (n + 1) / 2 - 1; col++) {
				if (spiralM[row][col] != 0) {
					if (spiralM[row][col] != 1) {
						diagonalNumbers++;
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