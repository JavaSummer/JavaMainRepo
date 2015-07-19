import java.util.Scanner;

public class Sum_of_Multiples 
{
	
public static void no_twist() 

	{
		long sum=0,i=0;
				
		for (i=1; i<=333; i++)
			{
			if(i<200)sum+=5*i;
			sum+=i*3;
			
			}
		System.out.println(sum);
	}	

public static void twist1() 

{
	Scanner asdf = new Scanner(System.in);
	long nr = asdf.nextLong(),sum=0,i=0;
	asdf.close();
			
	for (i=1; i<=nr/3; i++)
		{
		if(i<nr/5)sum+=5*i;
		sum+=i*3;
		
		}
	System.out.println(sum);
}

public static void twist2_int() 

{
	int nr =1,sum=0;
	int i=1,j=1;
	boolean overflow=false;
			
	while(overflow==false)
		{
		for (i=i; i<=nr/3; i++)
			{
			if(Integer.MAX_VALUE -sum < i*3) overflow=true;
			sum+=i*3;
			}
		for (j=j; j<nr/5; j++)
		{
			if(Integer.MAX_VALUE -sum < j*5) overflow=true;
		sum+=j*5;
		}
		nr++;
		}
	System.out.println(nr-1);
}

public static void twist2_long()

{
	long nr =1,sum=0;
	long i=1,j=1;
	boolean overflow=false;
			
	while(overflow==false)
		{
		for (i=i; i<=nr/3; i++)
			{
			if(Long.MAX_VALUE -sum < i*3) overflow=true;
			sum+=i*3;
			}
		for (j=j; j<nr/5; j++)
		{
			if(Long.MAX_VALUE -sum < j*5) overflow=true;
		sum+=j*5;
		}
		nr++;
		}
	System.out.println(nr-1);
}

public static void main(String[] args) 
	{
		System.out.println("Running program without twist.");
	no_twist();
	System.out.println("Running program with twist 1. User input required.");
	twist1();
	System.out.println("Running program with twist 2 for int.");
	twist2_int();
	System.out.println("Running program with twist 2 for long. This will take around 10-15 seconds.");
	twist2_long();
	}

}
