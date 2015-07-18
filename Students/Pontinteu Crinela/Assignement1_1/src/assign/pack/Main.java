package assign.pack;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum,givenNr;

		Scanner in = new Scanner(System.in);
		System.out.println("Input the number ");
		givenNr = in.nextInt();

		int limitSum3, limitSum5, limitSum15;
		
		if ((givenNr % 3) == 0) {
			limitSum3 = givenNr / 3 - 1;
		} else {
			limitSum3 = givenNr / 3;
		}
		
		if ((givenNr % 5) == 0) {
			limitSum5 = givenNr / 5 - 1;
		} else {
			limitSum5 = givenNr / 5;
		}
		
		if ((givenNr % 15) == 0) {
			limitSum15 = givenNr / 15 - 1;
		} else {
			limitSum15 = givenNr / 15;
		}

		sum =  3* ((limitSum3*(limitSum3+1))/2);
		sum += 5* ((limitSum5*(limitSum5+1))/2);
		sum -= 15* ((limitSum15*(limitSum15+1))/2);
	
		System.out.print("The sum of all the mupliples of 3 and 5 below "+ givenNr +" is: " + sum);

	}

}
