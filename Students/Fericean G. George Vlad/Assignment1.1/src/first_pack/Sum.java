package first_pack;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sum1 = 0, sum2 = 0, x, nr;
		x = scan.nextDouble();
		if (x == 1) {
			sum1 = 3 * ((1000 / 3) * (1000 / 3 + 1)) / 2 + 5 * ((1000 / 5 - 1) * (1000 / 5)) / 2 - 15 * ((1000 / 15) * (1000 / 15 + 1)) / 2;
			System.out.println("the sum is");
			System.out.println(sum1);
		} else // twist1
		{
			nr = scan.nextDouble();
			sum2 = 3 * ((nr / 3) * (nr / 3 + 1)) / 2 + 5 * ((nr / 5 - 1) * (nr / 5)) / 2 - 15 * ((nr / 15) * (nr / 15 + 1)) / 2;
			System.out.println("the sum is");
			System.out.println(sum2);
		}
		System.out.println("Overflows will occur for integers greater than " + Integer.MAX_VALUE
				+ " or longs greater than " + Long.MAX_VALUE);
	}

}
