//4 digit numbers
public class Twist {
public static void main(String args[])
	{int max=0,first=0,second=0;
	Palindrom palindromObject=new Palindrom();
	for(int i=9999;i>=1000;i--)
	{
		for(int j=9999;j>=1000;j--)
		{if(palindromObject.verify(i,j))
		{
			if(max<(i*j))
			{
				max=i*j;
				first=i;
				second=j;
			}
		}
		}
		}
	System.out.println("The maximum palindrom made from the product of 4 digit numbers "+first+" * "+second+" is "+max);
}

}
