package mainpack;

/**
 * 
 * @author alexh
 *
 */
public final class SumEvenFib {
	
	/**
	 * Necessary.
	 */
	private SumEvenFib() {
	}
	/**
	 * 
	 * @param args
	 * sums the even element of the Fibonacci sequence.
	 */
	public static void main(final String[] args) {
		final int cap = 4000000;
		
		int sum = solve(cap);
		
		System.out.println("The sum of the even Fibbonaci terms up to "
				+ cap + " is " + sum);
		
		//FibonacciSequence.printAll();
	}
	
	/**
	 * @param cap - max fib number
	 * @return - the sum of the even fib numbers below cap
	 */
	public static int solve(final int cap) {
		int sum = 0;
		
		FibonacciSequence.initialize();
		FibonacciSequence.generateUpToNumber(cap);
		
		int elements = FibonacciSequence.fibbonaciGeneratedElementCount();
		for (int i = 0; i < elements; i++) {
			int fibElement = FibonacciSequence.fibonacciElement(i);
			if (fibElement % 2 == 0) {
				sum += fibElement;
			}
		}
		
		return sum;
	}

}
