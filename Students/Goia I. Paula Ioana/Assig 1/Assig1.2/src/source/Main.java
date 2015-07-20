package source;

public class Main {
	
	public static void main(String[] args) {
	
		long a = 1;
		long b = 1 ;
		long c = a+b;
		long s = 0;
		while(c < 4000000){
			if(c % 2 == 0){
				s+= c;
				System.out.print(c +",");
			}
			
			a = b;
			b = c;
			c = a+b;
		}
		System.out.println("");
		System.out.println("The sum of the terms from above is : " +s);
	}

}
