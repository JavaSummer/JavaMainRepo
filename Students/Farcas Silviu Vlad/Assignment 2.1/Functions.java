import java.lang.Math;

public class Functions {

	public Polynomial add(Polynomial poliM, Polynomial poliN) {
		Polynomial poliAdd = new Polynomial();
		int coeffLength;
		if (poliM.degree < poliN.degree) {
			coeffLength = poliN.degree;
		} else {
			coeffLength = poliM.degree;
		}
		int[] coeff = new int[coeffLength];
		int i;
		for (i = 0; i < coeffLength; i++) {
			if (i > poliM.degree - 1) {
				coeff[coeffLength - 1 - i] = poliN.coefficients[coeffLength - 1 - i];
			} else if (i > poliN.degree - 1) {
				coeff[coeffLength - 1 - i] = poliM.coefficients[coeffLength - 1 - i];
			} else {
				coeff[coeffLength - 1 - i] = poliN.coefficients[poliN.degree - 1 - i] + poliM.coefficients[poliM.degree - 1 - i];
			}
		}
		poliAdd.construct(coeff);
		return poliAdd;
	}

	public Polynomial subtract(Polynomial poliM, Polynomial poliN) {
		Polynomial poliSub = new Polynomial();
		int coeffLength;
		if (poliM.degree < poliN.degree) {
			coeffLength = poliN.degree;
		} else {
			coeffLength = poliM.degree;
		}
		int[] coeff = new int[coeffLength];
		int i;
		for (i = 0; i < coeffLength; i++) {
			if (i > poliM.degree - 1) {
				coeff[coeffLength - 1 - i] = -poliN.coefficients[coeffLength - 1 - i];
			} else if (i > poliN.degree - 1) {
				coeff[coeffLength - 1 - i] = poliM.coefficients[coeffLength - 1 - i];
			} else {
				coeff[coeffLength - 1 - i] = poliM.coefficients[poliM.degree - 1 - i] - poliN.coefficients[poliN.degree - 1 - i];
			}
		}
		poliSub.construct(coeff);
		return poliSub;
	}

	public Polynomial mulScal(int n, Polynomial poli) {
		Polynomial poliMulScal = new Polynomial();
		int[] coeffMul = new int[poli.degree];
		int i;
		for (i = 0; i < poli.degree; i++) {
			coeffMul[i] = poli.coefficients[i] * n;
		}
		poliMulScal.construct(coeffMul);
		return poliMulScal;
	}

	public Polynomial multiply(Polynomial poliM, Polynomial poliN) {
		Polynomial poliMul = new Polynomial();
		int i, j;
		int[] coeff = new int[poliM.degree + poliN.degree - 1];
		for (i = 0; i < coeff.length; i++) {
			coeff[i] = 0;
			for (j = i; j >= 0; j--) {
				if (j < poliM.degree && (i - j) < poliN.degree) {
					coeff[i] = coeff[i] + poliM.coefficients[j] * poliN.coefficients[i - j];
				}
			}
		}
		poliMul.construct(coeff);
		return poliMul;
	}

	public double eval(double n, Polynomial poli) {
		int i;
		double nn = 0;
		for (i = 0; i < poli.degree; i++) {
			nn = nn + poli.coefficients[i] * Math.pow(n, poli.degree - 1 - i);
		}
		return nn;
	}

	public double root(Polynomial poli) {
		double a = 1, b = -1, c, fa, fb, fc, tol = 0.001;
		fa = eval(a, poli);
		fb = eval(-a, poli);
		while (fa * fb > 0 && a < 1_000_000) {
			a++;
			fa = eval(a, poli);
			fb = eval(-a, poli);
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
		fc = eval(c, poli);
		while (fc != 0 && Math.abs((b - a) * 0.5) > tol) {
			if (fc * fa > 0) {
				a = c;
			} else {
				b = c;
			}
			c = 0.5 * (a + b);
			fc = eval(c, poli);
			fa = eval(a, poli);
		}
		return c;
	}

}