
public class Twist {
	public static void main(String[] args) {
		int fibNum1 = 1, fibNum2 = 2, currentFibNum = fibNum2;
		int sumOfEven = 0;
		while (currentFibNum <= 4000000) {
			if (currentFibNum % 2 == 0) {
				sumOfEven += currentFibNum;
			}
			currentFibNum = fibNum1 + fibNum2;
			fibNum1 = fibNum2;
			fibNum2 = currentFibNum;

		}
		System.out.println("Sum of the even-valued terms: " + sumOfEven);
	}

}
