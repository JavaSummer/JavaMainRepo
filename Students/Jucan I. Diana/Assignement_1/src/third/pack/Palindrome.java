package third.pack;

public class Palindrome {
/**
 * 
 * @param args
 * param args are not used.
 */
	public static void main(final String[] args) {
		
		int logic = 0; // a variable that shows us when we find the largest palindrome
		for (int i = 99; i >= 10 && logic == 0; i--) {
			for (int j = 99; j >= 10 && logic == 0; j--) {
				if (isPalindrome(i * j) == 1) {
					logic = 1;
					System.out.println("The largest palindorme made from the product of two 2-digit numbers is: " + i * j + " made by " + i + "*" + j);
				}
			}
		}
		
		logic = 0; 
		for (int i = 999; i >= 100 && logic == 0; i--) {
			for (int j = 999; j >= 100 && logic == 0; j--) {
				if (isPalindrome(i * j) == 1) {
					logic = 1;
					System.out.println("The largest palindorme made from the product of two 3-digit numbers is: " + i * j + " made by " + i + "*" + j);
				}
			}
		}
		
		
		 logic = 0; // a variable that shows us when we find the largest palindrome
		for (int i = 9999; i >= 1000 && logic == 0; i--) {
			for (int j = 9999; j >= 1000 && logic == 0; j--) {
				if (isPalindrome(i * j) == 1) {
					logic = 1;
					System.out.println("The largest palindorme made from the product of two 4-digit numbers is: " + i * j + " made by " + i + "*" + j);
				}
			}
		}
	}
	
	/**
	 * 
	 * @param n is a number we want to verify
	 * @return 1 if n is palindrome, and 0 if not.
	 */
	public static int isPalindrome(final int n) {
		int copy = n;
		int ogl = 0;
		while (copy != 0) {
			ogl = ogl * 10 + copy % 10;
			copy = copy / 10;
		} 
		if (ogl == n) {
			return 1; 
		} else {
			return 0;
		}	
	}
}
