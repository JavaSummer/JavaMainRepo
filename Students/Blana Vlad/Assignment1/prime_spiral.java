package assignment1;

public class prime_spiral {
	public static void main(String args[]){
		int[][] matrix=new int[2000][2000];
		int i,j,val=9;
		double ratio=100;
		int n;
		while(ratio>0.10)
		{
			j=val;
		    i=val;
			n=val*val;
		while(n>=1)
		{
			while(matrix[i][j]==0)
			{
				matrix[i][j]=n;
				n--;
				
				if(j==1){break;}
				
				if(matrix[i][j-1]!=0){break;}
				j--;
			}
			i--;
			while(matrix[i][j]==0)
			{
				matrix[i][j]=n;
				n--;
				
				if(i==1){break;}
				
				if(matrix[i-1][j]!=0){break;}
				i--;
				
			}
			j++;
			while(matrix[i][j]==0)
			{
				matrix[i][j]=n;
				n--;
				
				if(j==val){break;}
			
				if(matrix[i][j+1]!=0){break;}
				j++;
			}
			
			i++;
			
			while(matrix[i][j]==0)
			{
				matrix[i][j]=n;
				n--;
				
				
				if(matrix[i+1][j]!=0){break;}
				i++;
			}
			j--;
		}
		int cntr=0;
		int primcntr=0;
		for(i=1;i<=val;i++)
		{
			for(j=1;j<=val;j++)
			{
				if(i==j || i+j==val+1)
				{
					if(isprime(matrix[i][j]))
					{
						primcntr++;
					}
					cntr++;
				}
				//System.out.print(matrix[i][j]+"\t");
			}
			//System.out.println();
		}
		
		ratio=(double)primcntr/(double)cntr;
		System.out.println(ratio);
		System.out.println(val);
		for(i=1;i<=val;i++)
		{
			for(j=1;j<=val;j++)
			{
				matrix[i][j]=0;
			
			}
		}
		val++;
	}
		
}
	static boolean isprime(int n) {
		if(n==1)return false;
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
}
