import java.util.Scanner;
public class Prime_Spiral {

	public static void main(String[] args)
	{
	
		int u,nr=8,total=13,n=49,j=8;
		//System.out.println(nr+" "+total+" :"+" "+(n+j)+" "+(n+2*j)+" "+(n+3*j)+" "+(n+4*j)+" ");		
		while(nr*10>=total)
		{
			for(u=0;u<=3;u++)
			{
				n+=j;
		
				nr+=prim(n);
			}
			total+=4;
			j+=2;
			
	//System.out.println(nr+" "+total+" :"+" "+(n+j)+" "+(n+2*j)+" "+(n+3*j)+" "+(n+4*j)+" ");
		}
		System.out.println(j-1);/*
		nr=1;
		int i=3;
		while(nr!=200000)
		{
			nr+=prim(i);
			i+=2;
		}
		System.out.println(i-2);*/
	
	}
	public static int prim(int x)
	{
		int i,y=minim(x);
		if(x%2==0)
			return 0;
		for(i=3;i<y;i+=2)
			if(x%i==0)
				return 0;
		return 1;
	}
	public static int minim(int x)
	{
		if(x<36000)
			return x;
		else
			return 36000;
	}
	
}	
	

