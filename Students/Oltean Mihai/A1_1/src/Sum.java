import java.util.Scanner;
import java.math.BigInteger;

public class Sum {
	public static final long lVal = Long.MAX_VALUE;

	public static void main(String arg[]) {
		// ////////////////// Twist 0 ////////////////////
		/*
		 * NOTE: The first methode was to verify all the numbers between 1-1000
		 * if they could devide by 3 or 5 => Not efficient
		 * 
		 * The second method is to use a more mathematical approach First, I
		 * determine how many numbers can be devided by 3,5 or 3*5. We common
		 * factorize(I hope is the right term) the sum Eg: 3 + 6 + 9 = 3 * (1 +
		 * 2 + 3) We can see that we have an arithmetic progression and we have
		 * the formula [n*(n+1)]/2. This reduce the time complexity from O(n) to
		 * O(1), which is nice. :)
		 * If I come to think about it, this is very very simple.
		 */
		long sum = 0;
		int tLim = 999 / 3; // / How many numbers can be divided by 3
		int fLim = 999 / 5; // / How many numbers can be divided by 5
		int fteenLim = 999 / 15; // / How many numbers can be divided by 15

		sum = 3 * ((tLim * (tLim + 1)) / 2) + 5 * ((fLim * (fLim + 1)) / 2)
				- 15 * ((fteenLim * (fteenLim + 1)) / 2);

		System.out
				.println("The sum of the terms which can be divided by 3 or 5 < 1000 is "
						+ sum);

		// ////////////////// Twist 1 ////////////////////

		System.out.println("Please insert the value of range");
		Scanner number = new Scanner(System.in);
		long num;
		num = number.nextLong();
		sum = 0;

		long tLimN = num / 3; // / How many numbers can be divided by 3
		long fLimN = num / 5; // / How many numbers can be divided by 5
		long fteenLimN = num / 15; // / How many numbers can be divided by 15

		sum = 3 * ((tLimN * (tLimN + 1)) / 2) + 5 * ((fLimN * (fLimN + 1)) / 2)
				- 15 * ((fteenLimN * (fteenLimN + 1)) / 2);

		System.out
				.println("The sum of the terms which can be devided by 3 or 5 < "
						+ num + " is " + sum);

		// ///////////////// Twist 2 ////////////////////
		long testint = Integer.MAX_VALUE; // int is included in long, so I
											// declared as long because I need
											// somthing bigger than
											// int.MAX_VALUE
		long sumint = 0;
		long j = 1;
		for (;; j++) {
			if (j % 3 == 0 || j % 5 == 0)
				if (sumint < testint) {
					sumint += j;
				} else
					break;
		}
		System.out
				.println("The biggest number that won't overflow the sum as integer is "
						+ j);

		// //////////////////////////////////////////

		// I haven't found a solution because it takes too much time to do all
		// the sums.
		// I've been thinking, since 'long' is the biggest type that I could
		// use, how could I use somthing bigger than 'long'?
		// I've done some research(googled) and found that I can use the class
		// 'BigInteger' to represent a number larger
		// than long.
		BigInteger sumbig = BigInteger.ZERO; // Initialize the sum with 0.
		BigInteger testlong = BigInteger.valueOf(Long.MAX_VALUE); // This is the
																	// value of
																	// Long.MAX_VALUE.
		BigInteger three = new BigInteger("3"); // I've declared three and five
												// as BigInteger.
		BigInteger five = new BigInteger("5");
		BigInteger k = new BigInteger("1000000000000");
		for (;; k = k.add(BigInteger.ONE)) // It makes an infinite loop and
											// stops when it reaches a sum
											// bigger than the value of
											// 'testlong'.
		{
			if ((k.remainder(three) == BigInteger.ZERO)
					|| (k.remainder(five) == BigInteger.ZERO))
				if (sumbig.compareTo(testlong) <= 0) // compares the sumbig to
														// testlong, if it's
														// bigger than testlong
														// it will break the
														// loop.
				{
					sumbig = sumbig.add(k); // Makes the add operation, adding
											// the k to the initial sum
				} else
					break;
		}

		System.out
				.println("The biggest number that won't overflow the sum as long is "
						+ k);
		System.out.println("And the sumbig is " + sumbig);

		// After several hours of SWTOR and a long chat with my girlfriend it
		// reached 552697831 and the sum 71277474909914325.
		// I think it would take a huge amount of time(weeks) to determinate the
		// biggest number that won't overflow the long sum.

		// Later Edit:
		// Found a solution. If I would initialize k with 1000000000000 (13
		// digits) it gives the solution in 3-4 sec.
		// The last number that won't overflow the sum as long is 1000019764175
		// And the sumbig is 9223372145259997000

	}

}
