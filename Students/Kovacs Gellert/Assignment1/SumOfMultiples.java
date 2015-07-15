
import java.util.*;

public class SumOfMultiples {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		in.close();
		
		int sum = inefficientSum(n);
		System.out.println("The sum is [O(n) time algorithm]: " + sum + ".");
		
		sum = efficientSum(n);
		System.out.println("The sum is [constant time algorithm]: " + sum + ".");
	}
	
	//O(n) time algorithm
	public static int inefficientSum(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum+=i;
			}
		}
		return sum; 
	}
	
	//constant time algorithm
	public static int efficientSum(int n) {
		int nThree = n / 3;
		int nFive = n/ 5;
		int nFifteen = n /15;
		
		int threeSum = 3*(nThree*(nThree + 1))/2;
		int fiveSum = 5*(nFive*(nFive+1))/2;
		int fifteenSum = 15*(nFifteen*(nFifteen+1))/2;
		
		return threeSum + fiveSum - fifteenSum;
	}
}
