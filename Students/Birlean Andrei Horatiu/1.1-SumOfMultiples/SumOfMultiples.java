import java.util.Scanner;

public class SumOfMultiples
{
	public static void main (String[] args)
	{
		 Scanner keyboard = new Scanner(System.in);
		 
		 System.out.println("Enter a number");
		 
		 int n = keyboard.nextInt();
		 int sum = 0;
		 int i;
		 
		for (i=0;i<n;i=i+3)
		{
			sum=sum + i;
		}
		
		for (i=0;i<n;i=i+5)
		{
			sum=sum + i;
		}
		
		System.out.println("The sum of the multiples is : " + sum);
		 
	}
}