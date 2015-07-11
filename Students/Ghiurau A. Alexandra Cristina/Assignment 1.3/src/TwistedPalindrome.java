/**
 * 
 * @author Alexa
 *
 */



public class TwistedPalindrome {


	public static void main(String[] args) {

		int product;
		int max = 0;
		for (int counter1 = 1000; counter1 <= 9999; counter1++) {
			for (int counter2 = 9999; counter2 >= 1000; counter2--) {
				product = counter1 * counter2;
				// System.out.println(counter1+ " * "+ counter2 +" = "+ product);
				if (checkIfPalindrome(product) == true) {
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
		if (length == 7) {
			if ((n % 10 == n / 1000000)) {
				n /= 10;
				if (n % 10 == (n / 10000) % 10) {
					n /= 10;
					if (n % 10 == (n / 100) % 10) {
						return true;
					}
				}
			}
		}
		if (length == 8) {
			if ((n % 10 == n / 10000000)) {
				n /= 10;
				if (n % 10 == (n / 100000) % 10) {
					n /= 10;
					if (n % 10 == (n / 1000) % 10) {
						n /= 10;
						if (n % 10 == (n / 10) % 10) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}
}