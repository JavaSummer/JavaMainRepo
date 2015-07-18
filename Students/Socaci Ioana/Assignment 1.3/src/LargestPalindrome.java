
public class LargestPalindrome {
	public static void main(String[] args) {
		int firstNum = 111, SecondNum = 111, maxPalindrome = 0;

		for (int i = 999; i > 100; i--) {
			for (int j = i; j > 100; j--) {
				if ((i * j) % 10 != 0) {
					if (checkIfNumberIsPalindrome(i * j) == 1) {
						if (i * j > maxPalindrome) {
							maxPalindrome = i * j;
							firstNum = i;
							SecondNum = j;
						}
					}
				}
			}
		}
		System.out.println("The two 3-digit numbers are: " + firstNum + " " + SecondNum);
		System.out.print("The palindrome is: " + maxPalindrome + " = " + firstNum + " * " + SecondNum);

	}

	public static int checkIfNumberIsPalindrome(int number) {
		int inverseNumber = 0, currentNumber;
		currentNumber = number;
		while (number != 0) {
			inverseNumber = inverseNumber * 10 + number % 10;
			number = number / 10;
		}
		if (inverseNumber == currentNumber)
			return 1;
		return 0;
	}
}
