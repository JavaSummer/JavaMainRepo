package palindrome;
/**
 * 
 * @author Adina
 *
 */
public final class Digits4 {
	/**
	 * Private constructor.
	 */
	private Digits4() {
		
	}
	/**
	 * 
	 * @param nr - integer
	 * @return True/False
	 */
	public static boolean isPalindrome(final int nr) {
		int rev = 0;
		int x = nr;
		while (x > 0){
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		return nr == rev;
		
	}
	
	/**
	 * 
	 * @param args for main
	 */

	public static void main(final String[] args) {
		System.out.println("The largest palindrome nr is:");
		int max = 1000001;
		for (int i = 9999; i>= 1000; i-- ){
			for (int j = 9999; j>= 1000; j-- ){
				int p = i * j;
				if (max < p && isPalindrome(p)){
					max = p;
				}
			}
		}
		
	System.out.println(max);

	}
}
