package asign;

import java.util.Scanner;

public class Asign2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Nr=");
		int n = cin.nextInt(), i, a = 1, b = 2, c;
		int sum;
		if (n < 2)
			sum = 0;
		else
			sum = 2;
		for (i = 0; i < n - 2; i++) {
			c = a + b;
			a = b;
			b = c;
			if (c % 2 == 0)
				sum = sum + c;
		}
		System.out.print("The sum is " + sum);
	}
}
