
public class First{
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
	
		System.out.print("The sum of the multiples of 3 and 5 below " + 1000 + " is:"+ multiple(1000));
	}
}
