 public class Twist{
	 public static void main(String[] args){
		 int [] f = new int[50]; //There are 32 fibonacci terms <= 4_000_000 
		 long sum=0;
		 int i;
		 f[0]=1;
		 f[1]=2;
		 for(i=1;f[i]<=4_000_000;i++){
			 if ( f[i] % 2 == 0 ) sum += f[i];
			 f[i+1]=f[i]+f[i-1];
			 
		 }
		 System.out.println("The sum is " + sum);
	 }
 }