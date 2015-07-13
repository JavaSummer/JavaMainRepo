
import java.util.*;

public class SumOfMultiples {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		in.close();
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum+=i;
			}
		}
		System.out.println("The sum is " + sum + ".");
	}
}
