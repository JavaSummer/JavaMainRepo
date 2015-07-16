public class Second{
	//Twist 1 :the program has time complexity of O(n)
	public static int term(int f0,int f1)
	{
		return (f0+f1);
	}	
	
	public static void main(String args[])
	{
		int f0=0,f1=1,t=0;
		System.out.println("The program starts:");
		int sum=0;
		while(true)
		{
			t=term(f0,f1);
			if(t>4000000)
			{
				break;
			}
			if(t%2==0)
			{
				sum+=t;
			}
			f0=f1;
			f1=t;
		}
		System.out.println("The sum of the even numbers from the Fibonacci sequence whose limit is "+4000000+" is: "+sum);
	}
}