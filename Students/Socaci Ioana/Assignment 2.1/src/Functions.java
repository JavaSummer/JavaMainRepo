
public class Functions {

	public Polynomial add(Polynomial pol1, Polynomial pol2) {
		int maxDegree, p1 = 0, p2 = 0;
		if (pol1.polyDegree > pol2.polyDegree) {
			maxDegree = pol1.polyDegree;
			p1 = 1;
		} else {
			maxDegree = pol2.polyDegree;
			p2 = 1;
		}
		double[] result = new double[maxDegree + 1];

		for (int i = 0; i <= maxDegree; i++) {
			if (p1 == 1 && maxDegree - i > pol2.polyDegree) {
				result[i] = pol1.coeff[i];
			} else if (p1 == 1 && maxDegree - i <= pol2.polyDegree) {
				result[i] = pol1.coeff[i] + pol2.coeff[pol2.polyDegree - maxDegree + i];
			} else if (p2 == 1 && maxDegree - i > pol1.polyDegree) {
				result[i] = pol2.coeff[i];
			} else if (p2 == 1 && maxDegree - i <= pol1.polyDegree) {
				result[i] = pol2.coeff[i] + pol1.coeff[pol1.polyDegree - maxDegree + i];

			}
		}
		Polynomial finalResult = new Polynomial(result);
		return finalResult;
	}

	public Polynomial subtract(Polynomial pol1, Polynomial pol2) {
		// subtract from the polynomial of maximum degree

		int maxDegree, p1 = 0, p2 = 0;
		if (pol1.polyDegree >= pol2.polyDegree) {
			maxDegree = pol1.polyDegree;
			p1 = 1;
		} else {
			maxDegree = pol2.polyDegree;
			p2 = 1;
		}
		double[] result = new double[maxDegree + 1];

		for (int i = 0; i <= maxDegree; i++) {
			if (p1 == 1 && maxDegree - i > pol2.polyDegree) {
				result[i] = pol1.coeff[i];
			} else if (p1 == 1 && maxDegree - i <= pol2.polyDegree) {
				result[i] = pol1.coeff[i] - pol2.coeff[pol2.polyDegree - maxDegree + i];

			} else if (p2 == 1 && maxDegree - i > pol1.polyDegree) {

				result[i] = pol2.coeff[i];
			} else if (p2 == 1 && maxDegree - i <= pol1.polyDegree) {
				result[i] = pol2.coeff[i] - pol1.coeff[pol1.polyDegree - maxDegree + i];

			}
		}

		Polynomial finalResult = new Polynomial(result);

		while (finalResult.coeff[0] == 0 && finalResult.polyDegree > 0) {
			for (int i = 0; i < finalResult.polyDegree; i++) {
				finalResult.coeff[i] = finalResult.coeff[i + 1];
			}
			finalResult.polyDegree--;
		}
		return finalResult;
	}

	public Polynomial multiplication(Polynomial pol1, Polynomial pol2) {

		double[] result = new double[pol1.polyDegree + pol2.polyDegree + 1];

		for (int i = 0; i <= pol1.polyDegree; i++) {
			for (int j = 0; j <= pol2.polyDegree; j++) {
				result[i + j] += pol1.coeff[i] * pol2.coeff[j];
			}
		}
		Polynomial finalResult = new Polynomial(result);
		return finalResult;
	}

	public Polynomial scalarMultiply(Polynomial pol1, int scalar) {

		double[] coeff = new double[pol1.coeff.length];
		for (int i = 0; i <= pol1.polyDegree; i++) {
			coeff[i] = pol1.coeff[i] * scalar;
		}
		Polynomial result = new Polynomial(coeff);
		return result;

	}

	public double evalPolynomial(Polynomial pol1, int scalar) {
		// use Horner's rule
		double result = 0;
		for (int i = 0; i <= pol1.polyDegree; i++)
			result = pol1.coeff[i] + result * scalar;
		return result;
	}

	public Polynomial[] division(Polynomial pol1, Polynomial pol2) {
		// consider the degree of pol1 is greater than that of pol2
		if (pol2.coeff != null) {
			Polynomial quotient = new Polynomial();
			Polynomial remainder = new Polynomial(pol1.coeff);
			Polynomial[] result = new Polynomial[2];

			while (remainder != null && remainder.polyDegree >= pol2.polyDegree) {

				double[] coeff = new double[remainder.polyDegree - pol2.polyDegree + 1];
				coeff[0] = remainder.coeff[0] / pol2.coeff[0];// divide the
																// leading
																// coefficients
				Polynomial t = new Polynomial(coeff);

				quotient = add(quotient, t);

				remainder = subtract(remainder, multiplication(t, pol2));

			}

			result[0] = quotient;
			result[1] = remainder;
			return result;
		}
		return null;
	}

}
