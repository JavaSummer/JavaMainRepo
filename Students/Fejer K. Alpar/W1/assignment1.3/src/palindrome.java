
public class palindrome {
	public static void main(String[] args) {
		int a = 999, b, c = 0, p = 1;
		while (c == 0) {
			b = a;
			while (!palind(a * b))
				b--;

			if (a * b > p)
				p = a * b;
			else
				c++;
			a--;
		}
		System.out.println("Largest palindrome made from the product of 2 3-digit numbers is "+p);
	}

	public static boolean palind(int a) {
		int b = 0, c = a;
		while (c != 0) {
			b = b * 10 + c % 10;
			c = c / 10;
		}
		return (a == b);
	}
}