package polynomial;

public class Functions {
	private static Polynomial Result;

	public static Polynomial add(Polynomial p1, Polynomial p2) {
		int resultLength = Math.max(p1.getDegree(), p2.getDegree());
		int[] resultCoeffs = new int[resultLength];

		for (int i = 0; i < resultLength; i++) {
			int k = resultLength - 1;
			if (i > p1.getDegree() - 1) {
				resultCoeffs[k - i] = p2.getCoeffs()[k - i];
			} else if (i > p2.getDegree() - 1) {
				resultCoeffs[k - i] = p1.getCoeffs()[k - i];
			} else {
				resultCoeffs[k - i] = p2.getCoeffs()[p2.getDegree() - 1 - i] + p1.getCoeffs()[p1.getDegree() - 1 - i];
			}
		}

		Result = new Polynomial(resultCoeffs, Math.max(p1.getDegree(), p2.getDegree()));
		return Result;
	}

	public static Polynomial subtract(Polynomial p1, Polynomial p2) {
		int resultLength = Math.max(p1.getDegree(), p2.getDegree());
		int[] resultCoeffs = new int[resultLength];

		for (int i = 0; i < resultLength; i++) {
			int k = resultLength - 1;
			if (i > p1.getDegree() - 1) {
				resultCoeffs[k - i] = p2.getCoeffs()[k - i];
			} else if (i > p2.getDegree() - 1) {
				resultCoeffs[k - i] = p1.getCoeffs()[k - i];
			} else {
				resultCoeffs[k - i] = p1.getCoeffs()[p1.getDegree() - 1 - i] - p2.getCoeffs()[p2.getDegree() - 1 - i];
			}
		}

		Result = new Polynomial(resultCoeffs, Math.max(p1.getDegree(), p2.getDegree()));
		return Result;
	}

	public static Polynomial multiply(Polynomial p1, Polynomial p2) {
		int length = p1.getDegree() + p2.getDegree();
		int[] resultCoeffs = new int[length - 1];

		for (int i = 0; i < length - 1; i++) {
			resultCoeffs[i] = 0;
		}
		for (int i = 0; i < p1.getDegree(); i++) {
			for (int j = 0; j < p2.getDegree(); j++) {
				resultCoeffs[i + j] += p1.getCoeffs()[i] * p2.getCoeffs()[j];
			}
		}
		Result = new Polynomial(resultCoeffs, length);
		return Result;
	}

	public static Polynomial mul_scal(Polynomial p, int scalar) {

		int[] resultCoeffs = new int[p.getDegree()];
		int[] pCoeffs = p.getCoeffs();
		for (int i = 0; i < p.getDegree(); i++) {
			resultCoeffs[i] = pCoeffs[i] * scalar;
		}
		Result = new Polynomial(resultCoeffs, p.getDegree());
		return Result;
	}

	public static long eval(Polynomial p, double scalar) {

		int[] pCoeffs = p.getCoeffs();
		long result = 0;
		for (int j = 0; j < p.getDegree(); j++) {
			result = (long) (result + (pCoeffs[j] * Math.pow(scalar, p.getDegree() - 1 - j)));
		}
		return result;
	}

	// bisection method
	public static double root(Polynomial p) {
		double theRoot = 0;
		double del = 1e-2;
		double a = 0, b = 2;
		double groot = b - a;
		int i = 0;
		while ((Math.abs(groot) > del) && (i < 10) && (eval(p, theRoot) != 0)) {
			theRoot = ((a + b) / 2);
			if ((eval(p, a) * eval(p, theRoot)) < 0) {
				b = theRoot;
				groot = b - a;
			} else {
				a = theRoot;
				groot = b - a;
			}
			i++;
		}
		return theRoot;
	}
}
