public class Palindrom {
	public boolean verify(int i,int j)
	{
		int n,p,o=0;
		n=i*j;
		p=n;
		if(n%10==0)
		{
			return false;
		}
		while(p>0)
		{
			o*=10;
			o+=p%10;
			p/=10;
		}
		if(n==o)
		{return true;}
		else
		{return false;}
	}
}