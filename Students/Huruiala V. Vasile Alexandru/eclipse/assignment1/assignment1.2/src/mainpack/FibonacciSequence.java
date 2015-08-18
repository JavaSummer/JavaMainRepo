package mainpack;

/**
 * 
 * @author alexh
 *
 */
public final class FibonacciSequence {
	/**
	 * The sequence is stored in an array.
	 * To calculate the next elements withour recalculating them every time.
	 */
	private static int[] fibSeq = new int[1000];
	/**
	 * The number of elements calculated so far.
	 */
	private static int elementsGenerated;
	
	/**
	 * Constructor.
	 */
	private FibonacciSequence() {
		fibSeq[0] = 0;
		fibSeq[1] = 1;
		elementsGenerated = 2;
	}
	
	/**
	 * Necessary since no no instance will be use.
	 */
	public static void initialize() {
		fibSeq[0] = 0;
		fibSeq[1] = 1;
		elementsGenerated = 2;
	}
	
	/**
	 * 
	 * @param number - it stops generating elements after it reaches "number"
	 */
	public static void generateUpToNumber(final int number) {
		boolean notDone = true;
		while (notDone) {
			int temp = fibSeq[elementsGenerated - 2] + fibSeq[elementsGenerated - 1];
			if (temp < number) {
				fibSeq[elementsGenerated] = temp;
				elementsGenerated++;
			} else {
				notDone = false;
			}
		}
	}
	
	/**
	 * 
	 * @param index - the index of the array
	 * @return - the index-th element of the array
	 */
	public static int fibonacciElement(final int index) {
		return fibSeq[index];
	}
	
	/**
	 * 
	 * @return - number of elements generated so far
	 */
	public static int fibbonaciGeneratedElementCount() {
		return elementsGenerated;
	}
	
	/**
	 * Debug method.
	 */
	public static void printAll() {
		for (int i = 0; i < elementsGenerated; i++) {
			System.out.println(i + "\t" + fibSeq[i]);
		}
	}
}
