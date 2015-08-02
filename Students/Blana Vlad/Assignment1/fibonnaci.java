package assignment1;

public class fibonnaci {
	public static void main(String args[]){
		int sum=1,prev=1,curr=2,interm;
		
		while(curr<4000000)
		{
			if(curr % 2 == 0)
			{
				sum=sum+curr;
			}
			interm=prev;
			prev=curr;
			curr=curr+interm;
			System.out.println(sum);
		}
		
		
	}
	
}
