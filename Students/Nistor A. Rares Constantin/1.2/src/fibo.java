
public class fibo {
	public static void main(String[] args) {
		int a,b,c,sum=2;
		a=1;
		b=2;
		c=a+b;
		while(c<=4000000){
			if(c%2==0)
				sum=sum+c;
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println(sum);;
	}
}
