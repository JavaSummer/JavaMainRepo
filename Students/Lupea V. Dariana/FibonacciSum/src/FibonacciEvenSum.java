import java.util.Scanner;

public class FibonacciEvenSum {
	static Scanner userInput = new Scanner(System.in);

	public static long GenerateFibonacci(int term) {

		long sum = 0;
		long fib = 0;
		long f1 = 0;
		long f2 = 1;
		if (term <= 1)
			return term;
		for (int i = 1; i <= term; i++) {
			fib = f1 + f2;
			f1 = f2;
			f2 = fib;
			if (fib < 4000000 && fib % 2 == 0)
				sum += fib;
		}
		return sum;

	}

	public static void main(String[] args) {

		System.out.println("Enter the last term of the Fibonacci sequence:");
		int n = userInput.nextInt();
		long result = GenerateFibonacci(n);
		System.out.println("The sum of the even Fibonacci terms is: " + result);
	}
}