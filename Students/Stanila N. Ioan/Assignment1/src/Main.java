
/**
 * 
 * @author Ion
 *
 */
public final class Main {
	/**
	 * The main constructor. It is useless.
	 */
	private Main() { };

	/**
	 * The main method.
	 * @param args - this is the default parameter.
	 */
	public static void main(final String[] args) {
		showResults();
	}
	
	/**
	 * Check the results in the console.
	 */
	private static void showResults() {
		System.out.println("1. The sum of multiples");
		SumOfMultiples a = new SumOfMultiples(3, 5);
		System.out.print("The original sum of multiples: ");
		System.out.print(a.original());
		System.out.println();
		System.out.println("The twisted sum...");
		System.out.print(a.twist1());
		System.out.println();
		a.twist2();
		System.out.println();
		
		System.out.println("2. The Fibonacci sum");
		Fibonacci b = new Fibonacci(10000);
		System.out.print("The sum in exponential time: ");
		System.out.print(b.exponential());
		System.out.println();
		System.out.print("The sum in polynomial time: ");
		System.out.print(b.polynomialN());
		System.out.println();
		System.out.print("The sum in logarithmic time: ");
		System.out.print(b.logarithmic());
		System.out.println();
		System.out.println();
		
		System.out.println("3. The largest palindrome");
		Palindrome c = new Palindrome();
		System.out.print("The largest palindrome of six digits + condition: ");
		System.out.print(c.threeDigits());
		System.out.println();
		System.out.print("The largest palindrome of eight digits + "
				+ "condition: ");
		System.out.print(c.fourDigits());
		System.out.println();
		System.out.println();
		
		System.out.println("4. The spiral");
		Spiral d = new Spiral();
		System.out.print("The maximum length of the spiral: ");
		System.out.print(d.maximumSideLengthEfficient());
		System.out.println();
		System.out.println();
	}
}
