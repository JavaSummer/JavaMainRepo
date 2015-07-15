
public class Main {

	public static void main(String[] args) {

		helperFunctions obj = new helperFunctions();/// i am sorry but I keep
													/// forgetting to write the
													/// name of a class with a
													/// capital letter

		float ratio = 100;// I initialized it with 100 because although it
							// should be 0 for 1, I assume it can be considered
							// an exception
		float nrOfPrimeNr = 0, nrOfNrOnTheDiagonals = 1;// the names explain a
														// lot
		int sideLength = 1;

		while (ratio > 10) {

			sideLength += 2;// at each iteration I "wrap" the square, increasing
							// the sideLength by 2
			nrOfNrOnTheDiagonals += 4;// I add the 4 of corners of newly added
										// square

			for (int i = 1; i < 4; i++) {/// covers the bottom left and top left
											/// and right corners

				// I took as a reference number the squares, as there were
				// actually the squares of the sideLength. The rules i then used
				// for accessing the other points are quite straightforward
				if (obj.isPrime(sideLength * sideLength - i * (sideLength - 1))) {
					nrOfPrimeNr++;
				}
			}
			ratio = (nrOfPrimeNr / nrOfNrOnTheDiagonals) * 100;

		}

		System.out.println("The side length of the square spiral for which the ratio"
				+ " of primes along both diagonals first falls below 10% is " + sideLength);

	}

}
