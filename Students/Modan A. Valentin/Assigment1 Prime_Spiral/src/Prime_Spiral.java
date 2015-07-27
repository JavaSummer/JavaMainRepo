import java.util.Scanner;
public class Prime_Spiral {

	public static void main(String[] args)
	{
		int mare=10000;
		int a[]=new int [100000];
		int i,k;
		for(i=3;i<=mare;i++)
			if(i%2==1)
			a[i]=1;
			else
				a[i]=0;
		for(i=3;i<=mare/3;i+=2)
			if(a[i]==1)
				for(k=i*3;k<=mare;k+=i*2)
					a[k]=0;
		
		
		
		
		int u,nr=8,total=13,n=49,j=8;
		i=7;
		//System.out.println(nr+" "+total+" :"+n+"+ "+(n+j)+" +"+(n+3*j));
		while(nr*10>total)
		{
			for(u=0;u<=3;u++)
			{
				n+=j;
				nr+=a[n];
			}
			total+=4;
			j+=2;
			i++;
			//System.out.println(nr+" "+total+" :"+n+" +"+(n+j)+" +"+(n+3*j));
		}
		System.out.println(j-1);
	}
	
}	
	

