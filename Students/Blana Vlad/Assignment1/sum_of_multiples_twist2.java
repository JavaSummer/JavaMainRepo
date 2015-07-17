package assignment1;

public class sum_of_multiples_twist2 {
	public static void main(String args[]){
		int sum=0,i;
		//Scanner input = new Scanner(System.in);
		//n=input.nextInt();
		for(i=1;sum<=Integer.MAX_VALUE-i;i++)
		{
			if(i%3==0 || i%5==0)sum=sum+i;
		}
		System.out.println("Overflow occurs for "+i);
		long j,lsum=0;
		for(j=1;lsum<=Long.MAX_VALUE-j;j++)
		{
			if(j%3==0 || j%5==0)lsum=lsum+j;
		}
		System.out.println("Long overflow occurs for "+j);
		
	}
	

}
