/**
 * 
 * @author Alexa
 *
 */
public class Palindrome {

	public static void main(String[] args) {

		int product;
		int max = 0;
		for (int counter1 = 100; counter1 <= 999; counter1++) {
			for (int counter2 = 999; counter2 >= 100; counter2--) {
				product = counter1 * counter2;
				if (checkIfPalindrome(product)) {
					if (product > max) {
						max = product;
						System.out.println(product + " is palindrome");
						System.out.println( counter1 + " * " + counter2 + " = " + product);

					}
				}
			}
		}
		System.out.println("The largest of them all is " + max);

	}

	public static boolean checkIfPalindrome(int n) {

		int length = (int) (Math.log10(n) + 1);
		int a = 10000;
		int b = 100;
		final int TEN = 10;
		if (length == 5) {
			if ((n / a == n % TEN)) {
				n /= TEN;
				if (n % TEN == (n / b) % TEN) {
					return true;
				}
			}
		}
		if (length == 6) {
			a*=10;
			b*=10;
			if ((n / a == n % TEN)) {
				n /= TEN;
				if (n % TEN == (n / b) % TEN) {
					n /= TEN;
					if (n % TEN == (n / TEN) % TEN)
						return true;
				}
			}
		}

		return false;

	}
}	
	

