package first_pack;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sum1 = 0, sum2 = 0, x, nr;
		x = scan.nextDouble();
		if (x == 1) {
			for (int i = 1; i < 1000; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum1 = sum1 + i;
				}
			}
			System.out.println("the sum is");
			System.out.println(sum1);
		} else // twist1
		{
			nr = scan.nextDouble();
			for (int i = 1; i < nr; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum2 = sum2 + i;
				}
			}
			System.out.println("the sum is");
			System.out.println(sum2);
		}
		System.out.println("Overflows will occur for integers greater than " + Integer.MAX_VALUE
				+ " or longs greater than " + Long.MAX_VALUE);
	}

}
