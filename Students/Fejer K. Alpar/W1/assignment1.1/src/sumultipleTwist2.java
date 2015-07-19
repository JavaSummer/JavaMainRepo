
public class sumultipleTwist2 {

	public static void main(String[] args) {
		int b = 0, c = 0;
		long a = 1000, sum1, sum2, sum3;
		sum1 = 3 * ((a / 3) * (a / 3 + 1)) / 2;
		sum2 = 5 * ((a / 5 - 1) * (a / 5)) / 2;
		sum3 = 15 * ((a / 15) * (a / 15 + 1)) / 2;
		while (b == 0) {
				if (a % 3 == 0)
					sum1 += a;
				else if (a % 5 == 0)
					sum2 += a;
				if ((sum1 + sum2 > Integer.MAX_VALUE) && (c == 0)) {
					System.out.println("Int overflow for " + a);
					c++;

				}
				if (Long.MAX_VALUE - sum1 < sum2 - sum3) {

					System.out.println("Long overflow for " + a);
					b++;
				}
			a++;
		}
	}
}