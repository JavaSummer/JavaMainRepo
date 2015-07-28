
public class primeSpiral {
	public static void main(String[] args) {
		int topRight = 3, topLeft = 5, bottomLeft = 7, bottomRight = 9, primes = 3, n = 3, k = 8;
		double ratio , percent = 0.1 , num = 2*n-1;
		ratio=primes/num;
		while (ratio>=percent) {
			k += 2;
			topRight += k;
			if (prime(topRight))
				primes++;
			k += 2;
			topLeft += k;
			if (prime(topLeft))
				primes++;
			k += 2;
			bottomLeft += k;
			if (prime(bottomLeft))
				primes++;
			k += 2;
			bottomRight += k;
			if (prime(bottomRight))
				primes++;
			n += 2;
			num=2*n-1;
			ratio = primes / num;
		}

		System.out.println("The ratio is below 10% for side length " + n);

	}

	public static boolean prime(int a) {
		int j = 3, k = 0;
		if (a == 1)
			return false;
		else if (a == 2)
			return true;
		else {
			while ((k == 0) && (j <= Math.sqrt(a))) {
				if (a % j == 0)
					k++;
				else
					j += 2;
			}
			return (k == 0);
		}
	}
}
