package homework;
//the naive method :)) 
public class fibonacci {
	
	
 public static void main(String[] args) {
	int a=1,b=0,c=0,s=0;
	while(c < 4000000)
	{
		c=b+a;
		b=a;
		a=c;
		System.out.print(c);
		System.out.println(" ;");
		if(c%2==0)
			if(c < 4000000)
				s=s+c;
	}
	System.out.print("the sum is: ");
	System.out.println(s);

}
}
