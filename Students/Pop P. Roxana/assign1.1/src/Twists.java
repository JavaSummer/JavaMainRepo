
public class Twists {

	public long getSumOfMultiples(long upperBound) {

		long nrOf3Multiples = (upperBound - 1) / 3;// number of multiples of 3
		long nrOf5Multiples = (upperBound - 1) / 5;// number of multiples of 5
		long nrOf15Multiples = (upperBound - 1) / 15;// number of multiples of
														// both 3 and 5
		/// The sum of multiples of 3 will be computed
		/// 3(1+2+3+....+nrOf3Multiples)
		/// Similarly for 5
		long sum3 = 3 * ((nrOf3Multiples * (nrOf3Multiples + 1)) / 2);
		long sum5 = 5 * ((nrOf5Multiples * (nrOf5Multiples + 1)) / 2);
		long sum15 = 15 * ((nrOf15Multiples * (nrOf15Multiples + 1)) / 2);
		long sum = sum3 - sum15 + sum5;
		return sum;
	}

	/// twist2

	public long constructMaxLong() {// this function finds the biggest integer
									// for which ovf still doesn't occur
									// I called it construct as it doesn't
									// actually search through all the numbers
									// using the function above until the sum
									// overflows. I think this method is more
									// efficient, though rather complicated
		long overflowNr = 0;
		long nr = 0;
		long i = 0, j = 0;// mainly, j counts the multiples of 5, while i the
							// multiples of 3
		boolean ok = true;

		while (ok) {
			nr += 5 * j;

			if (nr < 0) {// overflow (i don't think I am wrong when assuming
							// that at the first overflow a negative number
							// results)

				ok = false;
				overflowNr = 5 * j;/// overflow occurred due to 5*j. The biggest
									/// number for which 5*j is not added is
									/// actually 5*j. Just as 10 is not part of
									/// its corresponding sum. Therefore, it is
									/// the last nr before ovf
			} else {
				j++;
				i++;
				if (3 * i != 5 * (j - 1)) {/// make sure not to put the same
											/// number twice, for example
											/// 15,30...
					nr += 3 * i;
				}
				if (nr < 0) {// overflow is checked whenever a multiple is added
					ok = false;
					overflowNr = 3 * i;
				} else {
					if (3 * (i + 1) < 5 * j) {// between 2 multiples of 5, there
												// can be(but not necessarily) 2
												// multiples of 3. This
												// condition assures that a
												// greater multiple is never
												// added first
						i++;
						nr += 3 * i;
						if (nr < 0) {
							ok = false;
							overflowNr = 3 * i;
						}
					}
				}
			}
		}
		return overflowNr;
	}

	public int constructMaxInt() {// same as for long

		int overflowNr = 0;
		int nr = 0;
		int i = 0, j = 0;
		boolean ok = true;

		while (ok) {
			nr += 5 * j;

			if (nr < 0) {// overflow
				ok = false;
				overflowNr = 5 * j;
			} else {
				j++;
				i++;
				if (3 * i != 5 * (j - 1)) {
					nr += 3 * i;
				}
				if (nr < 0) {
					ok = false;
					overflowNr = 3 * i;
				} else {
					if (3 * (i + 1) < 5 * j) {
						i++;
						nr += 3 * i;
						if (nr < 0) {
							ok = false;
							overflowNr = 3 * i;
						}
					}
				}
			}
		}
		return overflowNr;
	}

	public long inverse(long sum) {// it is somehow the inverse of the function
									// getSumOfMultiples (given such a sum, it
									// gives the greatest number from which it
									// could have been obtained.
									// That is how I tested the method I used
									// for determining the overflow, but I think
									// it is by itself somehow interesting,
									// somehow, an extra feature :)

		long inv = 0;
		long nr = 0;
		long i = 0, j = 0;
		boolean ok = true;

		while (ok) {
			nr += 5 * j;

			if (nr > sum) {// overflow
				ok = false;
				inv = 5 * j;
			} else {
				j++;
				i++;
				if (3 * i != 5 * (j - 1)) {
					nr += 3 * i;
				}
				if (nr > sum) {
					ok = false;
					inv = 3 * i;
				} else {
					if (3 * (i + 1) < 5 * j) {
						i++;
						nr += 3 * i;
						if (nr > sum) {
							ok = false;
							inv = 3 * i;
						}
					}
				}
			}
		}
		return inv;
	}

}
