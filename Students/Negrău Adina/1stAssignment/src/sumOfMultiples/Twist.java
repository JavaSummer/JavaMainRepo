package sumOfMultiples;
import java.util.Scanner;
/**
 * 
 * @author Adina
 *
 */
public final class Twist {
	/**
	 * Private constructor.
	 */
	private Twist() {
		
	}
	/**
	 * 
	 * @param args for main
	 */
	public static void main(final String[] args) { 
		System.out.println("Note:");
		System.out.println("Overflow for float variable will occur for numbers greater than 3.4028235E38.");
		System.out.println("Overflow for int variables will occur for numbers greater than 2147483647.");
		System.out.println("Give max:");
		Scanner maxS = new Scanner(System.in);
		int max =  maxS.nextInt();
		maxS.close();
		System.out.println("The sum of all multiples of 5 or 3 below max is:");
		int i;
		int sum = 0;
		for (i = 0; i < max; ++i) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
				
			}
		}
		System.out.println(sum);

		
	}
	
}
