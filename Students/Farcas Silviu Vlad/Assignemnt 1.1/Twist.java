import java.util.Scanner;

public class Twist {
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i, sum = 0;
		for( i = 1 ; i <= num ; i++) {
			if( i % 3 == 0 || i % 5 == 0)sum += i;
		}
		System.out.println("The sum is " + sum);
	}
}