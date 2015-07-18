
public class Twist1 {
	public static final int MAX1=4000000;
	public static void main(String[] args){
		int a=1,b=2,c,sum=0;
		 
		c=a+b;
		while(c<MAX1){
			a=b;
			b=c;
			c=a+b;
			if (b%2==0)
				sum=sum+b;
		}
		System.out.println("Even Fibonacci sum is " + sum);
	}

}
