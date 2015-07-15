package mainpack;

/**
 * 
 * @author alexh
 *
 */
public final class Spiral {
	
	/**
	 * Constructor.
	 */
	private Spiral() {
	}

	/**
	 * 
	 * @param args 
	 */
	public static void main(final String[] args) {
		final double lowerLimit = 0.1;
		final int numbersOnDiagPerLayer = 4;
		final int cent = 100;
		
		//Start at 1
		long currentValue = 1;
		long primeElementsOnDiag = 0;
		long totalElementsOnDiag = 1;
		
		//In this code I use the fact that the numbers on the diagonals
		//correspond to the sequence:
		//1,
		//3, 5, 7, 9,     - difference of 2 for layer 1
		//13, 17, 21, 25, - difference of 4 for layer 2
		//31, 37, 43, 49, - difference of 6 for layer 3
		//so the gap is 2 * layer (iteration below)
		//also note that between layers the difference is 2*nextLayer
		
		int iteration = 0;
		double ratio;
		int sideLength;
		do {
			iteration++;
			//This code generated the next 4 numbers that are
			//on the next layer on the diagonals and tests them
			for (int i = 0; i < numbersOnDiagPerLayer; i++) {
				currentValue += 2 * iteration;
				if (isPrime(currentValue)) {
					primeElementsOnDiag++;
				}
			}
			//Increment by 4 since we just generated some
			totalElementsOnDiag += numbersOnDiagPerLayer;
			
			sideLength = 2 * iteration + 1;
			ratio = (double) primeElementsOnDiag / totalElementsOnDiag;
			
			System.out.printf(
					"Step %5d: side legth of %5d; ratio %2.7f%% (%5d/%-5d)\n.",
					iteration, 2 * iteration + 1, cent * ratio,
					primeElementsOnDiag, totalElementsOnDiag);
		} while (ratio >= lowerLimit);
		
		
		System.out.printf("Reached below 10%% for %d side length.", sideLength);
	}
	
	/**
	 * 
	 * @param number - a long variable
	 * @return - true if it is prime, false if not
	 */
	public static boolean isPrime(final long number) {
		if (number <= 1) {
			return false;
		}
		
		boolean prime = true;
		for (long q = 2; q <= Math.sqrt(number) && prime; q++) {
			if (number % q == 0) {
				prime = false;
			}
		}
		
		return prime;
	}

}
