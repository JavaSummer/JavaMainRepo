package pack;

public class Palindromes {
	public static void main(String[] args)
	{
		int x = 999, y = 999, max = 0;
		for (int i = 999; i >= 100; i--)
			for (int j = 999; j >= 100; j--)
				if (Palindrome(i * j) > max)
				{
					max = i * j;
					x = i;
					y = j;
				}
		System.out.println(
				"The largest palindrome made from the product of 3 digit numbers is " + max + "=" + x + "*" + y);
	}

	public static int Palindrome(int n) {
		int inv = 0, aux = n;
		while (aux != 0) {
			inv = inv * 10 + aux % 10;
			aux = aux / 10;
		}
		if (inv == n)
			return n;
		else
			return -1;
	}
}
