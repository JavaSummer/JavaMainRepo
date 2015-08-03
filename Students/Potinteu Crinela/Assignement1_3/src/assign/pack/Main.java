package assign.pack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int LOWER_LIMIT = 100;
		final int UPPER_LIMIT = 999; // To find 4-digit numbers:
		// LOWER_LIMIT will be 1000 and UPPER_LIMIT will be 9999

		int i = UPPER_LIMIT;
		int j = UPPER_LIMIT;
		int firstNr = 0, secondNr = 0;
		int maxPal = -1;

		while (i >= LOWER_LIMIT) {
			int aux = i * j;
			if ((isPalindrome(aux)) && (aux > maxPal)) {
				maxPal = aux;
				firstNr = i;
				secondNr = j;
			}

			if (j >= LOWER_LIMIT) {
				j--;
			} else {
				i--;
				j = i;
			}

		}
		if (maxPal != -1) {
			System.out.println("The largest palindrom is " + maxPal);
			System.out.print("The numbers are " + firstNr);
			System.out.print(" and " + secondNr);
		} else {
			System.out.println("There are no palindroms !");
		}
	}

	public static boolean isPalindrome(int nr) {

		int inv = 0;
		int aux = nr;
		while (nr > 0) {
			inv = inv * 10 + nr % 10;
			nr = nr / 10;

		}
		if (aux == inv) {
			return true;
		} else {
			return false;
		}
	}

}
