public class SumOfMultiples {

	public static void main(String[] args) {

		int sum = 0;

		for (int counter = 0; counter < 1000; counter++) {
			if (counter % 3 == 0 || counter % 5 == 0) {
				sum += counter;
			}
		}

		System.out.println("The sum of multiples of 3 or 5 below 1000 is " + sum);
	}
}