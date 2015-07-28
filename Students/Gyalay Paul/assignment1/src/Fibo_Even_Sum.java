

public class Fibo_Even_Sum 
{
		
	public static void fibo3()
		{
		long a=1,b=1,aux=0,sum=0;
		
		while(b<4000000)
			{
			if(b%2==0) sum+=b;
			aux=a;
			a=b;
			b+=aux;
			}
		System.out.println(sum);
		}
		
	public static void fibo2() 
	{
	long[] v; long sum=0;
	int i=3;
	v = new long[40];
	v[1]=1; v[2]=1; v[3]=0;
	while(  v[i-1]+v [i-2] <4000000 )
		{
		
		v[i]=v[i-1]+v[i-2];
		if(v[i]%2==0) sum+=v[i];
		i++; 
		}
	System.out.println(sum);
	
	}
	public static long fiborec(long n)
		{
		if(n<2) return 1;
		else return (fiborec(n-1)+fiborec(n-2));
		}
	
	public static void fibo1()
		{
		long i=1,sum=0,n=0;
		while(n<4000000)
			{
			n=fiborec(i);
			if(n%2==0) sum+=n;
			i++;
			}
		System.out.println(sum);
		}
	

	public static int fib(int n)
	{
	int F[][] = {{1,1},{1,0}};
	if (n == 0)
	return 0;
	power(F, n-1);
	return F[0][0];
	}

	public static void power(int F[][], int n)
	{
	if( n == 0 || n == 1)
	return;
	int M[][] = {{1,1},{1,0}};

	power(F, n/2);
	multiply(F, F);

	if (n%2 != 0)
	multiply(F, M);
	}

	public static void multiply(int F[][], int M[][])
	{
	int x = F[0][0]*M[0][0] + F[0][1]*M[1][0];
	int y = F[0][0]*M[0][1] + F[0][1]*M[1][1];
	int z = F[1][0]*M[0][0] + F[1][1]*M[1][0];
	int w = F[1][0]*M[0][1] + F[1][1]*M[1][1];

	F[0][0] = x;
	F[0][1] = y;
	F[1][0] = z;
	F[1][1] = w;
	}

	public static void fibo4 ()
	{
		int i=1,sum=0,n=0;
		while(n<4000000)
			{
			n=fib(i);
			if(n%2==0) sum+=n;
			i++;
			}
		System.out.println(sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
	System.out.println("O(Logn):");
	fibo4();
	System.out.println("O(n):");
	fibo3();
	System.out.println("Recursive:");
	fibo1();
	}
}
