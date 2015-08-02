import java.util.Scanner;
public class Largest_Palindrome {
public static void main(String[] args)
{
	int max_i=0,max_j=0;
	
	palindrome(3,max_i,max_j);
	palindrome(4,max_i,max_j);

}
public static int pal_ok(int x)
{
	int aux=x,a=0;
	while(aux!=0)
	{
		a=a*10+aux%10;
		aux/=10;
	}
	if(x==a)
		return 1;
	return 0;
	
}
public static void palindrome(int x,int max_i,int max_j)
{
	int u,i=1,j,max=0,t;
	while(x>0)
	{
		i*=10;
		x--;
	}
	j=i;
	u=i-i/10;
	t=i;
	for(i=t;i>u;i--)
	for(j=t;j>u;j--)
		if(pal_ok(i*j)==1&&i*j>max)
			{
				max=i*j;
				max_i=i;
				max_j=j;
			}
System.out.println(max_i+"x"+max_j+"="+max_i*max_j);

}

}
