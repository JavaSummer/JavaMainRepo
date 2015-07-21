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
	 * @return - ratio
	 */
	public static void primeRatio(final int n) {

		final int below = 10;
		final int cent = 100;
		double ratio = 0;
		int sideLength = n;
		int ratioPrime = 0;
		int diagonalNumbers = 13;
		int primeNumbers = 8;
		int botRightCorner = 49, botLeftCorner = 43;
		int topLeftCorner = 37, topRightCorner = 31;
		int k = 6;

		ratio = ((double) (primeNumbers) / (double) (diagonalNumbers)) * cent;
		ratioPrime = (int) (ratio);
		sideLength = sideLength + 2;
		k = k + 2;
		do {
			botRightCorner = sideLength * sideLength;
			if (isPrime(botRightCorner)) {
				primeNumbers++;
			}
			botLeftCorner = botRightCorner - k;
			if (isPrime(botLeftCorner)) {
				primeNumbers++;
			}
			topLeftCorner = botLeftCorner - k;
			if (isPrime(topLeftCorner)) {
				primeNumbers++;
			}
			topRightCorner = topLeftCorner - k;
			if (isPrime(topRightCorner)) {
				primeNumbers++;
			}
			k = k + 2;
			sideLength = sideLength + 2;
			diagonalNumbers = diagonalNumbers + 4;
			ratio = ((double) (primeNumbers) / (double) (diagonalNumbers)) * cent;
			ratioPrime = (int) (ratio);

		} while (ratioPrime >= below);
		System.out.print("The side length is " + sideLength + " ");
		System.out.println("and the ratio is " + ratioPrime + "%.");
	}

	/**
	 * 
	 * @param number
	 *            -> to be checked
	 * @return -> 1 if prime, 0 otherwise
	 */
	public static boolean isPrime(int number) {

		int prime = 1;
		for (int i = 2; i * i <= number; i += 1) {
			if (number % i == 0) {
				prime = 0;
			}
		}
		return (prime == 1);
	}

	/**
	 * 
	 * @param args
	 *            -no param
	 */
	public static void main(final String[] args) {

		final int start = 7;
		primeRatio(start);
	}
}