package homework;

import java.util.Scanner;
public class sum {
	public static long castToLong(Object o) {
	    Number n = (Number) o;
	    return n.longValue();
	}
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int a,s=0,s2=0,b,c;
		for(a=3;a<=1000;a++)
			if(a%3==0||a%5==0)
				s=s+a;
		System.out.print("the first sum is:");
		System.out.println(s);
		//
		b= x.nextInt();
		for(a=3;a<=b;a++)
			if(a%3==0||a%5==0)
				s2=s2+a;
			System.out.print("the second sum is:");
			System.out.println(s2);
			c= Integer.MAX_VALUE;
			
		long sum=0;
		for(a=3;a<c;a++)
			if(a%3==0||a%5==0)
				sum=sum+ castToLong(a);
		
		System.out.print("the third sum is:");
		System.out.println(s);
		
	}

}
