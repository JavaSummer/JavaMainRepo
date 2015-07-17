package assign3;

public class assign3

{
	public static int checkP(int n) {
		int aux = n, inv = 0;
		while (aux != 0) {
			inv = inv * 10 + aux % 10;
			aux = aux / 10;
		}
		if (n == inv)
			return 1;
		else
			return 0;
	}

	public static void Palindrom() {
		int x, y, max = 0, i, j;
		x = y = 0;
		for (i = 999; i > 100; i--)
			for (j = 999; j > 100; j--)
				if (checkP(i * j) == 1 && i * j > max) {
					max = i * j;
					x = i;
					y = j;
				}
		System.out.print("3 digits palindrom number is " + x + "*" + y + "="
				+ max);
	}

	public static void main(String[] args) {
		Palindrom();
	}
}

// For the twist we simply change the values 999 with 9999 and 100 with 1000 in
// for;