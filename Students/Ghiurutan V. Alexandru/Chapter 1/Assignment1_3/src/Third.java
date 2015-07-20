public class Third {
public static void main(String args[])
{
	int max=0,first=0,second=0;
	Palindrom palindromObject=new Palindrom();
	for(int i=999;i>=100;i--)
	{
		for(int j=999;j>=100;j--)
		{if(palindromObject.palindrom(i,j))
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
	System.out.println("The maximum palindrom made from the product of 3 digit numbers "+first+" * "+second+" is "+max);
}
}
