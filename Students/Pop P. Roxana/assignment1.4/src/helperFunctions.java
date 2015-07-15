
public class helperFunctions {
	public boolean isPrime(int nr) {// a simple algorithm for checking if a
									// number is prime or not

		boolean ok = true;
		if ((nr % 2 == 0 && nr != 2) || (nr == 1)) {
			ok = false;
		}
		int div = 3;
		while (ok == true && div <= Math.sqrt(nr)) {

			if (nr % div == 0) {
				ok = false;
			}
			div += 2;
		}

		return ok;
	}
}
