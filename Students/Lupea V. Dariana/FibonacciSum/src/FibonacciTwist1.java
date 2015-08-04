public class FibonacciTwist1 {

	public static int fibo(int fibCurrent, int fibPrevious, int n) {
		if (n == 1)
			return fibCurrent;
		else
			return fibo(fibCurrent + fibPrevious, fibCurrent, n - 1);
	}

	public static int fibonacciStart(int n) {
		return fibo(1, 0, n);
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 50; i++) {
			int term = fibonacciStart(i);
			System.out.println(term);
		}

	}

}
