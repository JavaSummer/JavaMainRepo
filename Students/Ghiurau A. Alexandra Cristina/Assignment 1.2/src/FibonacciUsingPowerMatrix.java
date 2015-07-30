import java.util.Scanner;

public class FibonacciUsingPowerMatrix {

	public static void main(String[] args) {

		int number, aux;

		do {
			Scanner userInput = new Scanner(System.in);
			number = userInput.nextInt();
			if (number <= 0) {
				System.err.println("no can do");
			}
			userInput.close();
		} while (number < 0);
		aux = number;

		int[][] result = { { 1, 0 }, { 0, 1 } };

		int[][] fiboM = { { 1, 1 }, { 1, 0 } };
		
		//a bit of comment can help
		/*         n
	     * [ 1 1 ]     [ F(n+1) F(n)   ]
	     * [ 1 0 ]   = [ F(n)   F(n-1) ]
	     */
		
		while (number > 0) {
			if (number % 2 == 1) {
				result = Multiplication(result, fiboM);
			}
			number = number / 2;
			fiboM = Multiplication(fiboM, fiboM);
		}
		System.out.println("Result = " + result[1][0] + " for the" + aux + "th term.");

	}

	private static int[][] Multiplication(int[][] m, int[][] n) {
		int[][] ret = { { m[0][0] * n[0][0] + m[0][1] * n[1][0], m[0][0] * n[0][1] + m[0][1] * n[1][1] },
				{ m[1][0] * n[0][0] + m[1][1] * n[0][1], m[1][0] * n[0][1] + m[1][1] * n[1][1] } };
		return ret;
	}

}
