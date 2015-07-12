import java.util.Scanner;
import java.math.BigInteger;
public class Sum
{
	public static void main(String arg[])
	{
		//////////////////// Twist 0 ////////////////////
		int sum = 0;
		int i = 0;

		for(i = 1 ; i <= 1000 ; i++)
			if(i % 3 == 0 || i % 5 == 0)
				sum += i;

		System.out.println("The sum of the terms which can be divided by 3 or 5 < 1000 is " +sum );

		//////////////////// Twist 1 ////////////////////

		System.out.println("Please insert the value of range");
		Scanner number = new Scanner(System.in);
		int num;
		num = number.nextInt();
		sum = 0;

		for(i = 1 ; i < num ; i++)
			if(i % 3 == 0 || i % 5 == 0)
			{
				sum += i;
			}
		System.out.println("The sum of the terms which can be devided by 3 or 5 < " + num + " is " + sum);

		/////////////////// Twist 2 ////////////////////
		long testint = Integer.MAX_VALUE; // int is included in long, so I declared as long because I need somthing bigger than int.MAX_VALUE
		long sumint = 0;
		long j = 1;
		for(;;j++)
		{
			if(j % 3 == 0 || j % 5 == 0)
				if (sumint < testint)
				{
				sumint += j;
				}
				else
					break;
		}
		System.out.println("The biggest number that won't overflow the sum as integer is " +j);

		////////////////////////////////////////////

		//I haven't found a solution because it takes too much time to do all the sums.
		//I've been thinking, since 'long' is the biggest type that I could use, how could I use somthing bigger than 'long'?
		//	I've done some research(googled) and found that I can use the class 'BigInteger' to represent a number larger
		//		than long.

		BigInteger sumbig = BigInteger.ZERO; 	//Initialize the sum with 0.
		BigInteger testlong = new BigInteger("9223372036854775807"); // This is the value of Long.MAX_VALUE.
		BigInteger three = new BigInteger("3");	//I've declared three and five as BigInteger.
		BigInteger five = new BigInteger("5");
		BigInteger k= new BigInteger("1000000000000");

		for( ; ; k=k.add(BigInteger.ONE)) // It makes an infinite loop and stops when it reaches a sum bigger than the value of 'testlong'.
		{
			if((k.remainder(three) == BigInteger.ZERO) || (k.remainder(five) == BigInteger.ZERO))
				if(sumbig.compareTo(testlong) <= 0 ) //compares the sumbig to testlong, if it's higher than testlong it will break the loop.
				{
					sumbig = sumbig.add(k); //Makes the add operation, adding the k to the initial sum
				}
				else
					break;
		}

		System.out.println("The biggest number that won't overflow the sum as long is " +k);
		System.out.println("And the sumbig is " +sumbig);


		//After several hours of SWTOR and a long chat with my girlfriend it reached 552697831 and the sum 71277474909914325.
		//I think it would take a huge amount of time(weeks) to determinate the biggest number that won't overflow the long sum.

		//Later Edit:
		//Found a solution. If I would initialize k with 1000000000000 (13 digits) it gives the solution in 3-4 sec.
		//The last number that won't overflow the sum as long is 1000019764175
		//And the sumbig is 9223372145259997000


	}

}
