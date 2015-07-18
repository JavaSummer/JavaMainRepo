import java.util.Scanner;
import java.lang.Boolean;
import java.util.concurrent.TimeUnit;

public class palindrom {

	static boolean pal(long n) {
		String st;
		st = String.valueOf(n);
		String rev = new StringBuffer(st).reverse().toString();
		if (st.equals(rev))
			return true;
		else
			return false;
	}

	// /This one is not a very efficient method...It takes twice the time to
	// solve the problem for 4 digits numbers than "palnew"

	// / The palindrome function
	static boolean palnew(long n) {
		String st;
		int i = 0, ok = 1;
		st = String.valueOf(n);
		int len = st.length();
		while (ok == 1 && i <= st.length() / 2) { /*
												 * I verify if the first digit =
												 * last digit,second = last - 1
												 * and so on. It reduce the time
												 * of exection by half. I used
												 * "ok" because if it founds a
												 * different digit, it will stop
												 * the verification, saving time
												 */
			if (st.charAt(i) == st.charAt(len - i - 1))
				ok = 1;
			else
				ok = 0;
			i++;
		}
		if (ok == 1)
			return true;
		else
			return false;
	}

	// //////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// /The 4 digit version//////////////////////
	static void sol4() {
		int i = 0;
		int j = 0;
		long number = 0;
		long nr1 = 0, nr2 = 0;
		long max = 0;
		for (i = 9999; i >= 1000; i--)
			for (j = i; j >= 1000; j--) {
				number = i * j;
				if (palnew(number))
					if (number > max) {
						nr1 = i;
						nr2 = j;
						max = number;
					}
			}
		System.out.println("The biggest palindrome  is " + max
				+ " determinated by the numbers " + nr1 + " and " + nr2);
	}

	// //////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// /The 3 digits version/////////////////////
	static void sol3() {
		int i = 0;
		int j = 0;
		long number = 0;
		long nr1 = 0, nr2 = 0;
		long max = 0;
		for (i = 999; i >= 100; i--)
			for (j = i; j >= 100; j--) {
				number = i * j;
				if (palnew(number))
					if (number > max) {
						nr1 = i;
						nr2 = j;
						max = number;
					}
			}
		System.out.println("The biggest palindrome  is " + max
				+ " determinated by the numbers " + nr1 + " and " + nr2);
	}

	// //////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// /Main
	public static void main(String arg[]) {
		long startTime = System.nanoTime();
		sol3();
		sol4();
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Time " + duration / 1000000 + " ms");
	}
	/*
	 * The best method was transforming the number to a string.It's way more
	 * efficient and is more simple than reconstructing a number as reverse. As
	 * result: The biggest palindrome is not always the first palindrom found Eg
	 * : 3 digits
	 * "The biggest palindrome  is 580085 determinated by the numbers 995 and 583"
	 * - X The biggest palindrome is 906609 determinated by the numbers 993 and
	 * 913 The biggest palindrome is 99000099 determinated by the numbers 9999
	 * and 9901 Time 2877 ms (the time may vary)
	 */
}