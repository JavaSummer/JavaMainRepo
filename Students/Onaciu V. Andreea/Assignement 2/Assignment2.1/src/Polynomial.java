


public class Polynomial {
	private int degree;
	private int[] coefficients;
	
	public Polynomial(int[] c){
		this(c.length,c);
	}
	public Polynomial(int d,int[] c)
	{
		this.degree=d;
		this.coefficients=c;
	}
	
	public int  getDegree(){
	    return degree;	
	}
	
	public int[] getCoefficients(){
		return coefficients;
	}
	
	public String toString(){
		String polynomial = "";
		int length = coefficients.length;
		for (int i = 0; i < length; i++) {
			if (coefficients[i] != 0) {
				if (i == 0)
					polynomial = ((coefficients[i] == 1) ? "" : coefficients[i]) + "x^" + (length - 1 - i);
				else if (i == length - 2) {
					if (coefficients[i] > 0)
						polynomial = polynomial + "+" + ((coefficients[i] == 1) ? "" : coefficients[i]) + "x";
					else
						polynomial = polynomial + ((coefficients[i] == 1) ? "" : coefficients[i]) + "x";
				} else if (i == length - 1) {
					if (coefficients[i] > 0)
						polynomial = polynomial + "+" + coefficients[i];
					else
						polynomial = polynomial + coefficients[i];
				} else if (coefficients[i] > 0)
					polynomial = polynomial + "+" + ((coefficients[i] == 1) ? "" : coefficients[i]) + "x^"
							+ (length - 1 - i);
				else if (coefficients[i] < 0)
					polynomial = polynomial + ((coefficients[i] == 1) ? "" : coefficients[i]) + "x^" + (length - 1 - i);
			}
		}
		return polynomial;
	}

}


