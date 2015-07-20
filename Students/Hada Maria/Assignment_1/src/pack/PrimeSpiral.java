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
			if (checkIfPrime(botRightCorner) == 1) {
				primeNumbers++;
			}
			botLeftCorner = botRightCorner - k;
			if (checkIfPrime(botLeftCorner) == 1) {
				primeNumbers++;
			}
			topLeftCorner = botLeftCorner - k;
			if (checkIfPrime(topLeftCorner) == 1) {
				primeNumbers++;
			}
			topRightCorner = topLeftCorner - k;
			if (checkIfPrime(topRightCorner) == 1) {
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
	public static int checkIfPrime(int number) {

		int prime = 1;
		if (number % 2 == 0) {
			prime = 0;
		}
		for (int i = 3; i * i <= number; i += 2) {
			if (number % i == 0) {
				prime = 0;
			}
		}
		if (prime == 1) {
			return 1;
		} else {
			return 0;
		}
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