import java.util.Scanner;

public class SumOfMultiples
{
	public static void main (String[] args)
	{
		 Scanner keyboard = new Scanner(System.in);
		 
		 System.out.println("Enter a number");
		 
		 int n = keyboard.nextInt();
		 int aux1 = (n-1)/3;
		 int aux2 = (n-1)/5;
		 int aux3 = (n-1)/15;
		 
		 int sum = 3*(aux1*(aux1 + 1)/2) + 5*(aux2*(aux2+1)/2) - 15*(aux3*(aux3 + 1)/2);
		 
		System.out.println("The sum of the multiples is : " + sum);
		 
	}
}