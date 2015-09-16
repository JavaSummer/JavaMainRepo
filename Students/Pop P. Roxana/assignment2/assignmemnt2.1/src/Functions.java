
public class Functions {

	// method for evaluating a polynomial
	public static double eval(Polynomial poly, int nr) {

		double result = 0;
		int i, x = 1;
		for (i = 0; i <= poly.getDegree(); i++) {
			result += poly.getCoefficient(i) * x;
			x *= nr;
		}
		return result;
	}

	// method for multiplying a polynomial with a scalar
	public static Polynomial mulScalar(Polynomial poly, double nr) {

		int deg = poly.getDegree();
		double[] result = new double[deg+1];
		for (int i = 0; i <= deg; i++) {
			result[i] = nr * poly.getCoefficient(i);
		}
		return new Polynomial(result, deg);
	}

	// method for adding two polynomials
	public static Polynomial add(Polynomial poly1, Polynomial poly2) {

		int deg1 = poly1.getDegree(), deg2 = poly2.getDegree();
		int maxDeg = Math.max(deg1, deg2);
		double[] result = new double[maxDeg+1];
		int i = 0;

		while (i <= deg1 && i <= deg2) {
			result[i] = poly1.getCoefficient(i) + poly2.getCoefficient(i);
			i++;
		}
		while (i <= deg1) {
			result[i] = poly1.getCoefficient(i);
			i++;
		}
		while (i <= deg2) {
			result[i] = poly2.getCoefficient(i);
			i++;
		}

		return new Polynomial(result, HelpfulFunctions.degree(result));

	}

	// method for subtracting two polynomials
	public static Polynomial subtract(Polynomial poly1, Polynomial poly2) {

		int deg1 = poly1.getDegree(), deg2 = poly2.getDegree();
		int maxDeg = Math.max(deg1, deg2);
		double[] result = new double[maxDeg+1];
		int i = 0;

		while (i <= deg1 && i <= deg2) {
			result[i] = poly1.getCoefficient(i) - poly2.getCoefficient(i);
			i++;
		}
		while (i <= deg1) {
			result[i] = poly1.getCoefficient(i);
			i++;
		}
		while (i <= deg2) {
			result[i] = -poly2.getCoefficient(i);
			i++;
		}
		return new Polynomial(result, HelpfulFunctions.degree(result));

	}

	public static Polynomial multiply(Polynomial poly1, Polynomial poly2) {

		int deg1 = poly1.getDegree(), deg2 = poly2.getDegree();
		int resultedDeg = deg1 + deg2;
		double[] result = new double[resultedDeg+1];

		for (int i = 0; i <= resultedDeg; i++) {
			result[i] = 0;
		}

		for (int i = 0; i <= deg1; i++) {
			for (int j = 0; j <= deg2; j++) {
				result[i + j] += poly1.getCoefficient(i) * poly2.getCoefficient(j);
			}
		}
		return new Polynomial(result, HelpfulFunctions.degree(result));

	}

}
