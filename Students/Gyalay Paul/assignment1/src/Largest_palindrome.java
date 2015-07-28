

public class Largest_palindrome {

public static boolean ispalindrome (long nr)
	{
	long c=nr,i,p=0;
	
	while(c!=0)
		{
		i=c%10;
		c/=10;
		p=p*10+i;
		}
	if(p==nr) return true;
	else return false;
	}

	public static void digit4() 
	{
	int i,j;
	long nmax=0,imax=0,jmax=0;
	for(i=9999; i>=1000; i--)
		for(j=9999; j>=1000; j--)
		{
		if((i*j)>nmax)
			{if(ispalindrome(i*j)==true)
				{
				imax=i;
				jmax=j;
				nmax=i*j;
				}
			}
		}
	System.out.println(imax); System.out.println(jmax); System.out.println(nmax);
	}
	
	public static void digit2()
	{
	int i,j;
	long nmax=0,imax=0,jmax=0;
	for(i=99; i>=10; i--)
		for(j=99; j>=10; j--)
		{
		if((i*j)>nmax)
			{if(ispalindrome(i*j)==true)
				{
				imax=i;
				jmax=j;
				nmax=i*j;
				}
			}
		}
	System.out.println(imax); System.out.println(jmax); System.out.println(nmax);
	}

public static void main(String[] args) 
{
System.out.println("Running for 2 digits");
digit2();
System.out.println("Running for 4 digits");
digit4();
}
}
