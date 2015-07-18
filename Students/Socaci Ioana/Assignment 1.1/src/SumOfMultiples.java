
public class SumOfMultiples {
	public static void main(String[] args) {
		int multipleOfThree = 333, multipleOfFive = 199, multipleOfFifteen = 66;
		int sum;
		sum = 3 * calculateSum(multipleOfThree) + 5 * calculateSum(multipleOfFive)
				- 15 * calculateSum(multipleOfFifteen);
		System.out.println("The required sum is: " + sum);
	}

	public static int calculateSum(int n) {
		return (n * (n + 1)) / 2;
	}
}
