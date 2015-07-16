import java.lang.Math;

public class Functions {

	public String add(int[] coeffM, int[] coeffN) {
		Polynomial poliAdd = new Polynomial();
		int coeffLength;
		if (coeffM.length < coeffN.length) {
			coeffLength = coeffN.length;
		} else {
			coeffLength = coeffM.length;
		}
		int[] coeff = new int[coeffLength];
		int i;
		for (i = 0; i < coeffLength; i++) {
			if (i > coeffM.length - 1) {
				coeff[coeffLength - 1 - i] = coeffN[coeffLength - 1 - i];
			} else if (i > coeffN.length - 1) {
				coeff[coeffLength - 1 - i] = coeffM[coeffLength - 1 - i];
			} else {
				coeff[coeffLength - 1 - i] = coeffN[coeffN.length - 1 - i] + coeffM[coeffM.length - 1 - i];
			}
		}
		poliAdd.construct(coeff);
		return poliAdd.getPoly();
	}

	public String subtract(int[] coeffM, int[] coeffN) {
		Polynomial poliSub = new Polynomial();
		int coeffLength;
		if (coeffM.length < coeffN.length) {
			coeffLength = coeffN.length;
		} else {
			coeffLength = coeffM.length;
		}
		int[] coeff = new int[coeffLength];
		int i;
		for (i = 0; i < coeffLength; i++) {
			if (i > coeffM.length - 1) {
				coeff[coeffLength - 1 - i] = -coeffN[coeffLength - 1 - i];
			} else if (i > coeffN.length - 1) {
				coeff[coeffLength - 1 - i] = coeffM[coeffLength - 1 - i];
			} else {
				coeff[coeffLength - 1 - i] = coeffM[coeffM.length - 1 - i] - coeffN[coeffN.length - 1 - i];
			}
		}
		poliSub.construct(coeff);
		return poliSub.getPoly();
	}

	public String mulScal(int n, int[] coeff) {
		Polynomial poliMulScal = new Polynomial();
		int[] coeffMul = new int[coeff.length];
		int i;
		for (i = 0; i < coeff.length; i++) {
			coeffMul[i] = coeff[i] * n;
		}
		poliMulScal.construct(coeffMul);
		return poliMulScal.getPoly();
	}

	public String multiply(int[] coeffM, int[] coeffN) {
		Polynomial poliMul = new Polynomial();
		int i, j;
		int[] coeff = new int[coeffM.length + coeffN.length - 1];
		for (i = 0; i < coeff.length; i++) {
			coeff[i] = 0;
			for (j = i; j >= 0; j--) {
				if (j < coeffM.length && (i - j) < coeffN.length) {
					coeff[i] = coeff[i] + coeffM[j] * coeffN[i - j];
				}
			}
		}
		poliMul.construct(coeff);
		return poliMul.getPoly();
	}

	public double eval(double n, int[] coeff) {
		int i;
		double nn = 0;
		for (i = 0; i < coeff.length; i++) {
			nn = nn + coeff[i] * Math.pow(n, coeff.length - 1 - i);
		}
		return nn;
	}

	public double root(int[] coeff) {
		double a = 1, b = -1, c, fa, fb, fc, tol = 0.001;
		fa = eval(a, coeff);
		fb = eval(-a, coeff);
		while (fa * fb > 0 && a < 1_000_000) {
			a++;
			fa = eval(a, coeff);
			fb = eval(-a, coeff);
		}
		if (fa == 0)
			return a;
		if (fb == 0)
			return -a;
		if (a >= 1_000_000) {
			return 0;
		}
		b = -a;
		c = 0.5 * (a + b);
		fc = eval(c, coeff);
		while (fc != 0 && Math.abs((b - a) * 0.5) > tol) {
			if (fc * fa > 0) {
				a = c;
			} else {
				b = c;
			}
			c = 0.5 * (a + b);
			fc = eval(c, coeff);
			fa = eval(a, coeff);
		}
		return c;
	}
	

}
