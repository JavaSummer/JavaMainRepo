
public class Twist {
//This program should have O(Log(n)) time complexity.
	public static int multiply(int a[][],int b[][])
	{
		int x=a[0][0]*b[0][0]+a[0][1]*b[1][0];
		int y=a[1][0]*b[0][0]+a[1][1]*b[1][0];
		int z=a[0][0]*b[0][1]+a[0][1]*b[1][1];
		int w=a[1][0]*b[0][1]+a[1][1]*b[1][1];
		b[0][0]=x;
		b[0][1]=z;
		b[1][0]=y;
		b[1][1]=w;
		return z;
	}
	
	public static int even(int m[][])
	{
		int sum=0,n;
		int f[][]={{1,1},{1,0}};
		while(true)
		{
			n=multiply(m,f);
			if(n>4000000)
			{
				break;
			}
			if(n%2==0)
			{
				sum+=n;
			}
		}
		return sum;
	}
	public static void main(String args[])
{
	int m[][]={{1,1},{1,0}};
	System.out.println("The sum of the even Fibonacci terms below 4000000 is "+even(m));
	
}
}
