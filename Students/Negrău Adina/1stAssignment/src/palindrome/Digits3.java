package palindrome;
/**
 * 
 * @author Adina
 *
 */
public final class Digits3 {
	/**
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	
	private Digits3() {
		/**
		 * Private constructor.
		 */
		
	}
	/**
	 * @param nr - integer
	 * @return True/False
	 */
	public static boolean isPalindrome(final int nr) {
	
	int rev = 0;
	int x = nr;
	while (x > 0) {
		rev = 10 * rev + x % 10;
		x = x / 10;
	}
	return nr == rev;
	
}

	/**
	 * 
	 * @param args - arg.
	 */
public static void main(final String[] args) {
	System.out.println("The largest palindrome nr is:");
	int max = 100001;
	for (int i = 999; i >= 100; i-- ) {
		for (int j = 999; j >= 100; j--) {
			int p = i * j;
			if (max < p && isPalindrome(p)) {
				max = p;
			}
		}
	}
System.out.println(max);
}


	}


