public class Assignment_Palindrome {
	public static void main(String[] args) {
		int i, j, max = 0;
		for (i = 1000; i < 10000; i++) {
			for (j = 1000; j < 10000; j++) {
				if (palindrom(i * j) == 1) {
					if (i * j > max) {
						max = i * j;
					}
				}
			}
		}
		System.out.println("The largest palindrome number is " + max);
	}

	public static int palindrom(int n) {
		int inv = 0, x;
		x = n;
		while (x != 0) {
			inv = (inv * 10) + (x % 10);
			x = x / 10;
		}
		if (n == inv) {
			return 1;
		} else {
			return 0;
		}
	}
}
