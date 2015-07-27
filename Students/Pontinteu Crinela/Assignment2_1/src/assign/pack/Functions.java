package assign.pack;

import java.util.Arrays;

public class Functions {
	
	public int computeDegree(Polynomial a) {
		int d = -1;
		for (int i = 0; i < a.coeff.length; i++)
			if (a.coeff[i] != 0)
				d = i;
		return d;
	}
   public void setPoly (int deg){
	   
	   
   }
	public Polynomial ADD(Polynomial a, Polynomial b) {
		Polynomial c = new Polynomial();
		int auxCoeff [] = new int[20];
		for (int i = 0; i <= a.deg; i++)
			auxCoeff[i] = a.coeff[i];
		for (int i = 0; i <= b.deg; i++)
			auxCoeff[i] += b.coeff[i]; 
		c.setCoeff(auxCoeff);
		c.setDegree(computeDegree(c));
		return c;
	}

	public Polynomial SUBTRACT(Polynomial a, Polynomial b) {
		Polynomial c = new Polynomial();
		int auxCoeff [] = new int[20];

		for (int i = 0; i <= a.deg; i++)
			auxCoeff[i] = a.coeff[i];
		for (int i = 0; i <= b.deg; i++)
			auxCoeff[i] -= b.coeff[i];
		c.setCoeff(auxCoeff);
		c.setDegree(computeDegree(c));
		return c;
	}

	public Polynomial MULTIPLY(Polynomial a, Polynomial b) {
		Polynomial c = new Polynomial();
		int auxCoeff [] = new int[40];
		Arrays.fill(auxCoeff, 0);

		for (int i = 0; i <= a.deg; i++)
            for (int j = 0; j <= b.deg; j++)
                auxCoeff[i+j] += (a.coeff[i] * b.coeff[j]);
		c.setCoeff(auxCoeff);
		c.setDegree(computeDegree(c));
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
		int auxCoeff [] = new int[20];
		if (n == 0) {
			System.out.println("You have multiplied the polynomial with 0 ");
			System.out.println("So the result is the null polynomial");
			c.setDegree(0);
			c.setCoeff(null);
		} else {
			for (int i = 0; i <= a.deg; i++)
				auxCoeff[i] = a.coeff[i] * n;
			c.setCoeff(auxCoeff);
			c.setDegree(a.deg);
		}
		return c;
	}

}
