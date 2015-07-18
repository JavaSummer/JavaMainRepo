package assign.pack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long antePrecedent = 1;
		long precedent = 2;
		long fib = antePrecedent + precedent;
		long sum = 0;

		while (fib < 4_000_000) {
			if (fib % 2 == 0) {
				sum += fib;
			}

			antePrecedent = precedent;
			precedent = fib;
			fib = antePrecedent + precedent;
		}
		System.out.println("The sum of the even-valued terms is "+sum);

	}

}
