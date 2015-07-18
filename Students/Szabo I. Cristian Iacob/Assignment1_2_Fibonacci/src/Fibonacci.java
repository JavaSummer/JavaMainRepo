import java.util.Scanner;

public class Fibonacci {

	static  Scanner scan  = new Scanner(System.in);
	public static void main(String[] args)
	{
		 
		  System.out.print("Give the number of Fibonacci numbers to compute the even sum for:  ");
		  int n = scan.nextInt();
		  computeEvenSum(n);
		  
	}
	 
	public static void computeEvenSum(int m)
	 {
		  int a1=1,a2=2,a3;
	      int sum;
	      if(m<2)
	    	  sum = 0;
	      else
	    	  sum = 2;
		  for(int i=0;i<m-2;i++)
		  { a3 = a1 + a2;
		    a1= a2;
		    a2= a3;
		    if(a3%2==0)
		     sum+=a3;
	      }
		  System.out.println("The even sum of the first " + m + " Fibonacci numbers is " + sum);
      }
}
