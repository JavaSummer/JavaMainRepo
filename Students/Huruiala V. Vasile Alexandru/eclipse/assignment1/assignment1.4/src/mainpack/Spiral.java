package mainpack;

/**
 * 
 * @author alexh
 *
 */
public class Spiral {
	
	private int[][] spiralMatrix;
	private int size;
	private int xCenter;
	private int yCenter;
	private int xLowBound;
	private int yLowBound;
	private int xHighBound;
	private int yHighBound;
	private int layersGenerated;

	/**
	 * Constructor.
	 * @param maxSize - how many spirals it can generate
	 */
	public Spiral(final int maxSize) {
		size = maxSize;
		
		spiralMatrix = new int[2 * maxSize + 1][2 * maxSize + 1];
		
		xCenter = maxSize;
		yCenter = maxSize;
		
		xLowBound = 0;
		xHighBound = 2 * maxSize;
		yLowBound = 0;
		yHighBound = 2 * maxSize;
		
		layersGenerated = 0;
		spiralMatrix[xCenter][yCenter] = 1;
	}
	
	/**
	 * 
	 * @param count - generate "count" more spirals to the existing ones
	 * @return -1 if it cannot generate that many, 0 on success
	 */
	public final int generate(final int count) {
		if (layersGenerated + count > size) {
			return -1;
		} else {
			//find where to start form
			//it is always on the next right of down-right diagonal
			int xCursor = xCenter + layersGenerated;
			int yCursor = yCenter + layersGenerated;
			
			//it is always the square of the next odd number
			int fillValue = (2 * layersGenerated + 1) 
					* (2 * layersGenerated + 1) + 1;
			
			for (int i = 0; i < count; i++) {
				layersGenerated++;
				//1 to the right
				spiralMatrix[xCursor][++yCursor] = fillValue++;
				//Up for
				for (int j = 1; j < 2 * layersGenerated; j++) {
					spiralMatrix[--xCursor][yCursor] = fillValue++;
				}
				//Left for
				for (int j = 0; j < 2 * layersGenerated; j++) {
					spiralMatrix[xCursor][--yCursor] = fillValue++;
				}
				//Down for
				for (int j = 0; j < 2 * layersGenerated; j++) {
					spiralMatrix[++xCursor][yCursor] = fillValue++;
				}
				//Right for
				for (int j = 0; j < 2 * layersGenerated; j++) {
					spiralMatrix[xCursor][++yCursor] = fillValue++;
				}
			}
			
			return 0;
		}
	}
	
	/**
	 * 
	 * @return - the side length of the spiral
	 */
	public final int sideLength() {
		return 2 * layersGenerated + 1;
	}
	
	/**
	 * 
	 * @return - how many layers have been generated so far(excluding the core)
	 */
	public final int generatedLayers() {
		return layersGenerated;
	}
	
	/**
	 * 
	 * @param number - an int
	 * @return - true if it is prime
	 */
	private boolean isPrime(final int number) {
		boolean prime = true;
		if (number <= 1) {
			prime = false;
		}
		
		for (int q = 2; q <= Math.sqrt(number) && prime; q++) {
			if (number % q == 0) {
				prime = false;
			}
		}
		
		return prime;
	}
	
	/**
	 * 
	 * @return - the number of prime numbers in the spiral
	 */
	public final int countPrimeNumbersOnDiagonals() {
		int primeNumbers = 0;
		
		final int incomplete = size - layersGenerated;
		
		int xLow = xLowBound + incomplete;
		int xHigh = xHighBound - incomplete;
		// Since it is a square x bounds are the same with y bounds.
		//int yLow = yLowBound + incomplete;
		//int yHigh = yHighBound - incomplete;
		
		for (int i = xLow; i <= xHigh; i++) {
			if (isPrime(spiralMatrix[i][i])) {
				primeNumbers++;
			}
		}
		for (int i = xLow; i <= xHigh; i++) {
			if (isPrime(spiralMatrix[xHigh - (i - xLow)][i])) {
				primeNumbers++;
			}
		}
		return primeNumbers;
	}
	
	/**
	 * Prints the spiral that has been generated so far.
	 */
	public final void printSpiral() {
		final int incomplete = size - layersGenerated;
		
		int xLow = xLowBound + incomplete;
		int xHigh = xHighBound - incomplete;
		int yLow = yLowBound + incomplete;
		int yHigh = yHighBound - incomplete;
		
		for (int i = xLow; i <= xHigh; i++) {
			for (int j = yLow; j <= yHigh; j++) {
				System.out.printf(" %4d", spiralMatrix[i][j]);
			}
			System.out.println();
		}
	}
}
