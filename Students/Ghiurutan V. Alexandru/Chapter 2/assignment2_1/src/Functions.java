public class Functions {

	public Polynomial add(Polynomial a, Polynomial b) {
		int deg = Math.max(a.getDegree(), b.getDegree());
		double[] sum = new double[deg + 1];
		double[] v1 = a.getCopyCoeffs();
		double[] v2 = b.getCopyCoeffs();
		for (int i = 0; i < sum.length; i++) {
			sum[i] = 0;
		}
		for (int i = 0; i < v1.length; i++) {
			sum[i] += v1[i];
		}
		for (int i = 0; i < v2.length; i++) {
			sum[i] += v2[i];
		}
		return new Polynomial(sum);
	}

	public Polynomial subtract(Polynomial a, Polynomial b) {
		int deg = Math.max(a.getDegree(), b.getDegree());
		double[] sub = new double[deg + 1];
		for (int i = 0; i <= deg; i++) {
			sub[i] = 0;
		}
		double[] v1 = a.getCopyCoeffs();
		double[] v2 = b.getCopyCoeffs();
		for (int i = 0; i < v1.length; i++) {
			sub[i] = v1[i];
		}
		for (int i = 0; i < v2.length; i++) {
			sub[i] -= v2[i];
		}
		return new Polynomial(sub);
	}

	public Polynomial multiply(Polynomial a, Polynomial b) {
		int deg = a.getDegree() + b.getDegree();
		double[] mul = new double[deg + 1];
		for (int i = 0; i <= deg; i++) {
			mul[i] = 0;
		}
		double[] v1 = a.getCopyCoeffs();
		double[] v2 = b.getCopyCoeffs();
		for (int i = 0; i < v1.length; i++) {
			for (int j = 0; j < v2.length; j++) {
				mul[i + j] += v1[i] * v2[j];
			}
		}
		return new Polynomial(mul);
	}

	public Polynomial scalarMultiplication(Polynomial a, int nr) {
		double[] v1 = a.getCopyCoeffs();
		for (int i = 0; i < v1.length; i++) {
			v1[i] *= nr;
		}
		return new Polynomial(v1);
	}

	public double evaluate(Polynomial a, int nr) {
		double[] v = a.getCopyCoeffs();
		double rezult = 0;
		int deg = a.getDegree();
		for (int i = 0; i <= deg; i++) {
			rezult += v[i] * Math.pow(nr, i);
		}
		return rezult;
	}
}
