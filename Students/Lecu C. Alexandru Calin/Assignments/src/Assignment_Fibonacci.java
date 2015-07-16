import java.util.Scanner;

public class Assignment_Fibonacci {

	public static void main(String[] args) {
		Scanner fib = new Scanner(System.in);
		int n, a = 1, b = 2, next = 0, sum;
		System.out.print("n = ");
		n = fib.nextInt();
		System.out.println();
		System.out.print(a + " " + b);
		sum = b;
		while (next < n) {
			next = a + b;
			a = b;
			b = next;
			if (next > n) {
				break;
			}
			System.out.print(" " + next);
			if (next % 2 == 0) {
				sum += next;
			}

		}
		System.out.println();
		System.out.println("sum = " + sum);
		fib.close();
	}
}
