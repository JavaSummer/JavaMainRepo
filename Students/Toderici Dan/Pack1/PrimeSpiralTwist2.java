package Pack1;

/**
 * .
 */

public final class PrimeSpiral2 {
	/**
	 * .
	 * @param args
	 */
	public static void main(final String args[]) {
		double ratio = 100;
		int n = 21401;
		/**
		 * maximum n that can be run is 21403 after that Exception in thread
		 * "main" java.lang.OutOfMemoryError: Java heap space at
		 * Pack1.PrimeSpiral2.main(PrimeSpiral2.java:15)  
		 * error is displayed
		 * probabbly around 25001 or so 
		 */
		while (ratio > 10) {
			int i = n;
			int j = n;
			int primeNumbersOnDiagonals = 0;
			int numbersOnDiagonals = 0;
			int value = i * j;
			int[][] spiralMatrix = new int[n + 1][n + 1];
			while (value >= 1) {
				while (spiralMatrix[i][j] == 0) {
					spiralMatrix[i][j] = value;
					value--;

					if (j == 1) {
						break;
					}

					if (spiralMatrix[i][j - 1] != 0) {
						break;
					}
					j--;
				}
				i--;
				while (spiralMatrix[i][j] == 0) {
					spiralMatrix[i][j] = value;
					value--;

					if (i == 1) {
						break;
					}

					if (spiralMatrix[i - 1][j] != 0) {
						break;
					}
					i--;

				}
				j++;
				while (spiralMatrix[i][j] == 0) {
					spiralMatrix[i][j] = value;
					value--;

					if (j == n) {
						break;
					}

					if (spiralMatrix[i][j + 1] != 0) {
						break;
					}
					j++;
				}

				i++;

				while (spiralMatrix[i][j] == 0) {
					spiralMatrix[i][j] = value;
					value--;

					if (spiralMatrix[i + 1][j] != 0) {
						break;
					}
					i++;
				}
				j--;
			}
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= n; j++) {
					if (i == j || i + j == n + 1) {
						double aux = (double) spiralMatrix[i][j];
						if (prime(aux)) {
							primeNumbersOnDiagonals++;
						}
						numbersOnDiagonals++;
					}

					// System.out.print(spiralMatrix[i][j] + "\t");
				}
				// System.out.println();
			}

			ratio = (double) (primeNumbersOnDiagonals * 100) / (double) numbersOnDiagonals;
			System.out.println("The ratio is : " + ratio);
			n += 2;
		}
		System.out.println("The ratio is : " + ratio);
		System.out.println("With maximum lenght: " + n);
	}
/**
 * .
 * @param a
 * @return
 */
	static boolean prime(final double a) {
		if (a == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}