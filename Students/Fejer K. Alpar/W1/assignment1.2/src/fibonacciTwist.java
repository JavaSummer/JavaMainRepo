
public class fibonacciTwist {
	public static void main(String[] args) {
		int f1 = 1, f2 = 2, f3 = 3;
		long sum = 2;
		while (f3 <= 4000000) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			if (f3 % 2 == 0)
				sum += f3;
		}
		System.out.println("The sum of even-valued fibonacci numbers below four million is " + sum);
	}
}
