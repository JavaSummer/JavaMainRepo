import java.util.Scanner;
public class Twist {
public static int multiple(int n)
{
	int sum=0;
	for(int i=3;i<n;i++)
	{
		if((i%3==0)||(i%5==0))
		{
			sum+=i;
		}
	}
	return sum;
}
	
public static void main(String args[])
{
	System.out.println("Give the upper boundary:");
Scanner input=new Scanner(System.in);
int n=input.nextInt();
System.out.println("The sum of the multiples below "+n+" is "+multiple(n));
	input.close();
}
}
