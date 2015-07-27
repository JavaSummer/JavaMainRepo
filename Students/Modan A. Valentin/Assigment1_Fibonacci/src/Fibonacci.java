import java.util.Scanner;
public class Fibonacci {
	

	

		public static void main(String[] args) {
		int i;
		
		System.out.println(fibo(32));
		/*int x=new Scanner(System.in).nextInt();
		System.out.println("Rezultatul este "+(x-1));
		int a=1,b=1,c,i=1;
		while(b<4000000) 
		{
			c=a+b;
			a=b;
			b=c;
			i++;
		}
		System.out.println("\n"+a+"  "+b);
		for(i=1;i<=32;i++)
		System.out.println(i+": "+fibo(i));*/
		
		
		/*Description
		 I made a program to determine how many fibonacci 
		 numbers are between 1 and 4_000_000
		 i made it bf because i needed just their number
		 so i find out the number then i look at the fibonnaci sequence
		 (1,1, 2) (3,5 ,8) (13,21, 34) (55, 89 , 144)
		 If we group in pairs of 3 we can see that the sum of the 
		 even numers is actually the sum of all the numbers divided 
		 by 2.
		 And the recurrence program for fibonacci Sum is 
		 S(n)=S(n-1)+S(n-2)+2;
		 S(1)=1;
		 S(2)=3;
		 S(3)=6;
		 and so on
		 And from the number of elements( "n") we have to find the 
		 biggest number that is the form 3*k+2 smaller than n and that 
		 number increased by 1 and the result divided by 2 
		 results the number we searched
		 Hope i made it right, sorry for delayed time 
		 */
	}
		/*The function returns the sum of all the event numbers
		 of the fibo sequence until the n-th element
		 Since we have 32 elements untill 4_000_000 we 
		 take as n=32
		 */
		public static int fibo(int n)
		{
			int a1=1,a2=3,a3,i;
			if(n==1)
				return 0;
			if(n>2)
			n-=2;
			n=(n/3)*3+2;
			for(i=2;i<n;i++)
			{
				a3=a2+a1+2;
				a1=a2;
				a2=a3;
			}
			return (a2+1)/2;
		}

		
		
		
		
	}


