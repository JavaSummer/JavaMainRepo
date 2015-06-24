package Package;

/**
 * 
 * @author Vlad Dolineanu
 *
 */

public final class Main {

	/**
	 * Hiding the constructor.
	 */
	
	private Main() {
		
	}
	
	/**
	 * 
	 * @param number - Our number to be tested
	 * @return - Returns whether the number is a palindrome or not
	 */
	private static boolean isPalindrome(final int number) {
		int numberCopy = number;
		int invertedNumber = 0;
		final int ten = 10;  
		
		//By the way...I really hate the magic number warning.
		//I can see its use but this is too much xD.
		
		while (numberCopy > 0) {
			int lastDigit = numberCopy % ten;
			
			numberCopy /= ten;
			invertedNumber = invertedNumber * ten + lastDigit;
		}
		
		return (number == invertedNumber);
		
	}
	
	/**
	 * 
	 * @return - Returns the largest palindrome.
	 */
	private static int largestPalindrome() {
		int palindrome = 0;
		final int max = 999;
		final int min = 100;
		
		for (int i = max; i >= min; i--) {
			for (int j = i; j >= min; j--) {
				int prod = i * j;
				
				if (isPalindrome(prod)) {
					if (prod > palindrome) {
						palindrome = prod;
					}
				}
			}
		}
		
		return palindrome;
	}
	
	
	
	/**
	 * 
	 * @param args - Arguments from the command line(not used).
	 */
	public static void main(final String[] args) {
		
		System.out.println(largestPalindrome());
		
	}

}
