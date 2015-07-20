import java.util.Scanner;
public class sumultipleTwist {
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		int a = userInput.nextInt();
		System.out.println("Sum of multiples of 3 or 5 below " + a +" is " + sum(a));
	}

	public static int sum(int a) {
		int sum;
		sum = 3 * ((a / 3) * (a / 3 + 1)) / 2 + 5 * ((a / 5 - 1) * (a / 5)) / 2 - 15 * ((a / 15) * (a / 15 + 1)) / 2;
		return sum;
	}
}