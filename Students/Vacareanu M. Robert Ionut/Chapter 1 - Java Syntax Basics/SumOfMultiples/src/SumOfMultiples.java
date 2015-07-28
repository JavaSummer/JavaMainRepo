import java.util.*;


public class SumOfMultiples {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Number: ");
		int number = keyboardInput.nextInt();
		int sum=0, firstQuotient=0, secondQuotient=0, thirdQuotient=0;
		
		firstQuotient = (int) Math.ceil((number/3d));
		secondQuotient = (int) Math.ceil((number/5d));
		thirdQuotient = (int) Math.ceil((number/15d));
		sum = (3*firstQuotient*(firstQuotient-1))/2 + (5*secondQuotient*(secondQuotient-1))/2 - (15*thirdQuotient*(thirdQuotient-1))/2;
		
		keyboardInput.close();
		System.out.println("Result: " +sum);
		System.out.println("Overflow for int: " + Integer.MAX_VALUE);
		System.out.println("Overflow for long: " + Long.MAX_VALUE);
	}
}
