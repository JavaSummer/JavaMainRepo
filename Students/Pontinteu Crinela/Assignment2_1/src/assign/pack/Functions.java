package assign.pack;

import java.util.Arrays;

public class Functions {
	
	public Polynomial ADD(Polynomial a, Polynomial b) {
		Polynomial c = new Polynomial();
	    c.coeff = new int [Math.max(a.deg, b.deg)+1];
		for (int i = 0; i <= a.deg; i++)
			c.coeff [i] = a.coeff[i];
		for (int i = 0; i <= b.deg; i++)
			c.coeff [i] += b.coeff[i]; 
		c.setDegree();
		return c;
	}

	public Polynomial SUBTRACT(Polynomial a, Polynomial b) {
		Polynomial c = new Polynomial();
	    c.coeff = new int [Math.max(a.deg, b.deg)+1];
		for (int i = 0; i <= a.deg; i++)
			c.coeff[i] = a.coeff[i];
		for (int i = 0; i <= b.deg; i++)
			c.coeff[i] -= b.coeff[i];
		c.setDegree();
		return c;
	}

	public Polynomial MULTIPLY(Polynomial a, Polynomial b) {
		Polynomial c = new Polynomial();
		 c.coeff = new int [a.deg+b.deg+1];
		Arrays.fill(c.coeff, 0);

		for (int i = 0; i <= a.deg; i++)
            for (int j = 0; j <= b.deg; j++)
            	c.coeff[i+j] += (a.coeff[i] * b.coeff[j]);
		c.setDegree();
		return c;
	}

	public long EVAL(Polynomial a, int n) {
		long p = 0;
		for (int i = a.deg; i >= 0; i--)
			p = a.coeff[i] + (n * p);
		return p;
	}

	public Polynomial MUL_SCAL(Polynomial a, int n) {
		Polynomial c = new Polynomial();
		 c.coeff = new int [a.deg + 1];
		if (n == 0) {
			System.out.println("You have multiplied the polynomial with 0 ");
			System.out.println("So the result is the null polynomial");
			Arrays.fill(c.coeff, 0);
			c.setDegree();	
		} else {
			for (int i = 0; i <= a.deg; i++)
				 c.coeff[i] = a.coeff[i] * n;
			c.setDegree();
		}
		return c;
	}

}
