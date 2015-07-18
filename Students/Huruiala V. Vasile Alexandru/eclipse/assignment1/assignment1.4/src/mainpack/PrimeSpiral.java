package mainpack;

/**
 * 
 * @author alexh
 *
 */
public final class PrimeSpiral {

	/**
	 * Constructor.
	 */
	private PrimeSpiral() {
	}
	
	/**
	 * 
	 * @param args 
	 */
	public static void main(final String[] args) {
		final int maxSize = 10000;
		Spiral sp = new Spiral(maxSize);
		
		int iteration = 0;
		double ratio;
		do {
			ratio = step(sp);
			iteration++;
		} while (ratio >= 0.1 && iteration < maxSize);
		
		if (ratio >= 0.1) {
			System.out.println("Out of space - choose a bigger maxSize");
		} else {
		System.out.printf("Reached below 10% for %d side length.", sp.sideLength());
		}
	}
	
	/**
	 * 
	 * @param sp - Spiral object
	 * @return - the ratio(when the algorithm ends)
	 */
	public static double step(final Spiral sp) {
		sp.generate(1);
		int sideLen = sp.sideLength();
		int totalElementsOnDiagonals = 2 * sideLen - 1;
		int primeElementsOnDiagonals = sp.countPrimeNumbersOnDiagonals();
		
		double ratio = (double) primeElementsOnDiagonals / totalElementsOnDiagonals;
		
		System.out.printf("Step %3d: side length of %5d; ratio: %2.5f%%.\n", sp.generatedLayers(), sideLen, 100 * ratio);
		
		return ratio;
	}

}
