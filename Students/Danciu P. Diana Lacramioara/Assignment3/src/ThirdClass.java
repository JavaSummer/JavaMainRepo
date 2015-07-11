import java.text.DecimalFormat;
import java.util.Scanner;

public class ThirdClass {
	private static long startTime = System.currentTimeMillis();

	public static void main(String[] args) {

		Scanner in1 = new Scanner(System.in);
		int limit1 = in1.nextInt(); // lowest limit
		Scanner in2 = new Scanner(System.in);
		int limit2 = in2.nextInt(); // highest limit

		long product = 0;
		long max = 0;
		for (int i = limit2; i > limit1; i--) {
			for (int j = i; j > limit1; j--) {
				product = i * j;

				if (isPalindrome(product)) {
					// Just store maximum value of product.
					if (product > max) {
						max = product;
					}
				}
			}
		}

		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(3);
		df.setMaximumFractionDigits(6);

		System.out.println(max);

		long endTime = System.currentTimeMillis();
		System.out.println("It took " + df.format((float) (endTime - startTime) / 1000) + " seconds"); // check execution time

		in1.close();
		in2.close();
	}

	public static boolean isPalindrome(long number) {
		String a = String.valueOf(number);
		String b = new StringBuffer(a).reverse().toString();
		if (a.equals(b))
			return true;
		return false;
	}
}