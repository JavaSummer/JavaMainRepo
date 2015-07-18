import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		HelperFunctions helpObj = new HelperFunctions();

		System.out.println("Introduce the order of the fibonacci term ");
		int n = input.nextInt();

		/// recursive approach
		int term = 0, sum = 0;
		int i = 1;
		System.out.println("RECURSIVELY");
		System.out.println("The terms are");
		while (i <= n && term < 4000000) {

			term = helpObj.fibonacciRec(i);/// obtain each term and add it to
											/// the sum if even
			if (term % 2 == 0) {
				sum += term;
			}
			System.out.print(term + " ");
			i++;
		}
		System.out.println();
		System.out.println("The sum of the fibbonacci terms is: " + sum);

		/// iterative method
		int fn1 = 2, fn2 = 1;
		sum = 2;
		term = 0;
		System.out.println("\nITERATIVE METHOD");
		System.out.print("The terms are\n"+fn2+" "+fn1+" ");

		for (i = 3; (i <= n) && (term < 4000000); i++) {// with the iterative
														// method the terms and
														// the sum are generated
														// in the same loop,
														// being therefore the
														// best approach for
														// solving this
														// particular problem
			term = fn1 + fn2;
			if (term % 2 == 0) {
				sum += term;
			}
			fn2 = fn1;
			fn1 = term;
			System.out.print(term + " ");
		}
		System.out.println("\nThe sum of the fibonacci terms is (iterative method): " + sum);

		/// O(logn) complexity for determining the n-th fibonnacci nr
		sum = 0;
		i = 1;
		System.out.println("\nWITH THE MATRIX");
		System.out.println("The terms are");
		while (i <= n && term < 4000000) {

			term = helpObj.fibonacciRec(i);
			if (term % 2 == 0) {
				sum += term;
			}
			System.out.print(term + " ");
			i++;
		}
		System.out.println();
		System.out.println("The sum of the fibbonacci terms is: " + sum);

	}

}
