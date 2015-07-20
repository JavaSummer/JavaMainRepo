package pack;
import java.util.Scanner;
public class Fib {
	static  Scanner scan  = new Scanner(System.in);
	public static void main(String[] args)
	{  
		System.out.print("give the number of Fib. terms: ");
		int n=scan.nextInt();
		sum(n);
	}
		public static void sum(int n)
		{
		double t1=1,t2=2,sum,evens=2;
		for(int k=1;k<n-2;k++)
		{
			sum=t1+t2;
			t1=t2;
			t2=sum;
			if(sum%2==0)
				evens=evens+sum;
		}
		System.out.print("The sum of the even "+ n + " Fibonacci numbers is "+evens);
	}

}
