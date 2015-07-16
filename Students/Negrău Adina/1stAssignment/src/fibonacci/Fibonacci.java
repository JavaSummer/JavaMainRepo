package fibonacci;

/**
 * 
 * @author Adina
 *
 */
public final class Fibonacci {
	/**
	 * Private constructor.
	 */
	private Fibonacci() {
		
	}
	
	/**
	 * 
	 * @param args for main
	 */
	public static void main(final String[] args) {
		System.out.println("The sum is:");
		int i = 1;
		int j = 2;
		int k;
		int sum2 = 0;
		while (true) {
			k = i + j;
			if (k % 2 != 0) {
				sum2 = sum2 + k;
			}
			i = j;
			j = k;
			if (j >= 4000000) {
				break;
			}
		}
		System.out.println(sum2);

	}

}
	