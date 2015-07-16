
public class Palindrom {
public boolean palindrom(int c,int i)
{
	int o,p,n;
	n=c*i;
	p=n;
	o=0;
	if(n%10==0)
	{
		return false;
	}
	while(p>0)
	{
		o*=10;
		o=o+p%10;
		p=p/10;
	}
	if(n==o)
	{
		return true;
	}
	else
		{return false;}}
	
}

