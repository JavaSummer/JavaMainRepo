import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long startTime = System.nanoTime();
		
		Twists objTwists = new Twists();
		Scanner input = new Scanner(System.in);

		long sum;
		long upperBound;
		System.out.println("Introduce the upper bound");
		upperBound = input.nextLong();
		sum = objTwists.getSumOfMultiples(upperBound);
		System.out.println("The sum of 3/5 multiples bellow " + upperBound + " is " + sum);

		int ovfInteger = objTwists.constructMaxInt();
		System.out.println("The largest integer for each ovf doesn't occur is " + ovfInteger);
		
		long ovfLong = objTwists.constructMaxLong();
		System.out.println("The largest long for each overflow doesn't occur is " + ovfLong);
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Time " + duration / 1000000 + " ms");
		
	}

}
