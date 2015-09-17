import java.io.BufferedWriter;
import java.io.IOException;

public class Functions {
	private double[] p1;
	private double[] p2;

	public Functions(double[] p1, double[] p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public int getDegree(double[] p) {
		int d = 0;
		for (int i = 0; i < p.length; i++) {
			if (i != 0) {
				d = i;
			}
		}
		return d;
	}

	public String toString(double[] v) {
		String rezult = "";
		int deg = getDegree(v);
		for (int i = deg; i >= 0; i--) {
			if (i == 1) {
				rezult += v[i] + "X+";
			} else if (i == 0) {
				rezult += v[i];
			} else {
				rezult += v[i] + "X^" + i + "+";
			}
		}
		return rezult;
	}

	public void add(BufferedWriter f) {
		int deg = Math.max(getDegree(p1), getDegree(p2));
		double[] sum = new double[deg + 1];
		for (int i = 0; i < sum.length; i++) {
			sum[i] = 0;
		}
		for (int i = 0; i < p1.length; i++) {
			sum[i] += p1[i];
		}
		for (int i = 0; i < p2.length; i++) {
			sum[i] += p2[i];
		}
		try {
			f.write(toString(sum));
		} catch (IOException e) {
			System.out.println("An error ocurred");
		}
	}

	public void subtract(BufferedWriter f) {
		int deg = Math.max(getDegree(p1), getDegree(p2));
		double[] sub = new double[deg + 1];
		for (int i = 0; i <= deg; i++) {
			sub[i] = 0;
		}
		for (int i = 0; i <= getDegree(p1); i++) {
			sub[i] = p1[i];
		}
		for (int i = 0; i <= getDegree(p2); i++) {
			sub[i] -= p2[i];
		}
		try {
			f.write(toString(sub));
			f.newLine();

		} catch (IOException e) {
			System.out.println("An error ocurred.");
		}
	}

	public void multiply(BufferedWriter f) {
		int deg = getDegree(p1) + getDegree(p2);
		double[] mul = new double[deg + 1];
		for (int i = 0; i <= deg; i++) {
			mul[i] = 0;
		}
		for (int i = 0; i < getDegree(p1); i++) {
			for (int j = 0; j < getDegree(p2); j++) {
				mul[i + j] += p1[i] * p2[j];
			}
		}
		try {
			f.write(toString(mul));
			f.newLine();
		} catch (IOException e) {
			System.out.println("An error occured.");
		}
	}

	public void scalarMultiplication(BufferedWriter f, int nr) {
		double[] v1 = new double[p1.length];
		double[] v2 = new double[p2.length];
		for (int i = 0; i < v1.length; i++) {
			v1[i] *= nr;
		}
		for (int i = 0; i < v2.length; i++) {
			v2[i] *= nr;
		}
		try {
			f.write(toString(v1));
			f.newLine();
			f.write(toString(v2));
			f.newLine();
		} catch (IOException e) {
			System.out.println("An error ocurred.");
		}
	}

	public void evaluate(BufferedWriter f, int nr) {
		double sum1 = 0, sum2 = 0;
		for (int i = 0; i < p1.length; i++) {
			sum1 += p1[i] * Math.pow(nr, i);
		}
		for (int i = 0; i < p2.length; i++) {
			sum2 += p2[i] * Math.pow(nr, i);
		}
		try {
			f.write(String.valueOf(sum1));
			f.newLine();
			f.write(String.valueOf(sum2));
			f.newLine();
		} catch (IOException e) {
			System.out.println("An error occured.");
		}
	}
}
