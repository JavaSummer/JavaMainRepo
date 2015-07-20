package source;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int nr = n.nextInt();
		long s = 0;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		s1 = (3*((nr-1)/3)*((nr-1)/3+1))/2;
		s2 = (5*((nr-1)/5)*((nr-1)/5+1))/2;
		s3 = (15*((nr-1)/15)*((nr-1)/15+1))/2;
		s=s1+s2-s3;
		System.out.println("The sum is " + s);
		
		
	}

}
