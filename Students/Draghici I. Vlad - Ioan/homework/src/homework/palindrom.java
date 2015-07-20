package homework;

public class palindrom {
public static int Pal(int nr)
	{
		int a,b=0,cif;
		a=nr;
		while(a!=0)
		{
			cif=a%10;
			a=a/10;
			b=b*10+cif;
		}
		if(b==nr)
			return 1;
		else
			return 0;
		
	}
public static double castToDouble(Object o) {
    Number n = (Number) o;
    return n.doubleValue();
}
public static double Pal2(double nr)
{
	double a,b=0,cif;
	a=nr;
	while(a!=0)
	{
		cif=a%10;
		a=a/10;
		b=b*10+cif;
	}
	if(b==nr)
		return 1;
	else
		return 0;
	
}
	
	public static void main(String[] args) {
		int i,j,max1=0;
		int p1=0;
		double p2,max2=0;
		for(i=999;i>100;i--)
			for(j=999;j>=100;j--)
			{
				p1=i*j;
				 if(Pal(p1)==1)
					if(p1>max1)
						max1=p1;
				}
		System.out.print("the largest palindrome made from the product of two 3-digit numbers is: ");
		System.out.println(max1);
		for(i=9999;i>=7000;i--)
			for(j=9999;j>=7000;j--)
			{
				p2=castToDouble(i*j);
				 if(Pal2(p2)==1)
					if(p2>max1)
						max2=p1;
				}
			
	System.out.print("the largest palindrome made from the product of two 4-digit numbers is: ");
	System.out.println(max2);}
	
}
