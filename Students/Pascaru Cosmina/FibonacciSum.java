package assignments1;

public class FibonacciSum {
	public static void main(String args[]) {
		int sum =0, i = 0;

		while (fibonacci(i) < 4000000) {
			int number = fibonacci(i);
			if (number % 2 == 0) {
				sum += number;
			}
			i++;
		}
		System.out.print("The fibonacci sum is ");
		System.out.println(sum);
	}

	public static int fibonacci(int i) {
		int[] fibArray = new int[50];
		fibArray[0] = 0;
		fibArray[1] = 1;
		fibArray[2] = 1;

		int j;

		for (j = 3; j <= i; j++) {
			fibArray[j] = fibArray[j - 1] + fibArray[j - 2];
		}
		return fibArray[i];
	

	}

}
