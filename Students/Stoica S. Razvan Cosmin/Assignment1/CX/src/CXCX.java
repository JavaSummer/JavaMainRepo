import java.util.Scanner;

public class CXCX {
	public static int sumOfMultiples(int n, int x) {
		int sum = 0, var;
		var = n / x;
		if (x != 5)
			sum = x * (var * (var + 1)) / 2;
		else
			sum = x * (var * (var - 1)) / 2;
		return sum;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Nr=");
		int n = cin.nextInt();
		int sum = 0;
		sum = sumOfMultiples(n, 3) + sumOfMultiples(n, 5)
				- sumOfMultiples(n, 15);
		System.out.println("Sum of multiplies of 3 & 5 is " + sum);
		System.out.print("We'll have overflow for int>" + Integer.MAX_VALUE
				+ " or long>" + Long.MAX_VALUE);
	}
}
// Here's the actual implementation of the twist, I found this formula on google, I hope it's ok;