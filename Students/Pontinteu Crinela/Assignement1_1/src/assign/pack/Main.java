package assign.pack;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int givenNr;

		Scanner in = new Scanner(System.in);
		System.out.println("Input the number ");
		givenNr = in.nextInt();

		int endLimit;
		endLimit = (givenNr - 1) / 3;

		for (int i = 1; i <= endLimit; i++) {
			sum += i * 3;
		}
		endLimit = (givenNr - 1) / 5;
		for (int i = 1; i <= endLimit; i++) {
			sum += i * 5;
		}
		System.out.print("The sum of all the mupliples of 3 and 5 below ");
		System.out.print(givenNr);
		System.out.print(" is: " + sum);
	}

}
