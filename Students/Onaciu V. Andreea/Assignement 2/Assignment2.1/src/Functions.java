

public class Functions {

	public static Polynomial add(Polynomial x, Polynomial y) {
		    int n=x.getDegree();
	        int m=y.getDegree();
	        int[] a=x.getCoefficients();
	        int[] b=y.getCoefficients();
		int s[] = new int[((n > m) ? n : m)];
		int length = ((n > m) ? n : m) - 1;
		int lengthA = n - 1;
		int lengthB = m - 1;
		while (lengthA >= 0 && lengthB >= 0) {
			s[length] = a[lengthA] + b[lengthB];
			length--;
			lengthA--;
			lengthB--;
		}
		for (int i = 0; i <= length; i++) {
			s[i] = ((n > m) ? a[i] : b[i]);
		}
		Polynomial result=new Polynomial(s.length,s);
		return result;
	}

	public static Polynomial substract(Polynomial x, Polynomial y) {
        int n=x.getDegree();
        int m=y.getDegree();
        int[] a=x.getCoefficients();
        int[] b=y.getCoefficients();
		int[] s = new int[((n > m) ? n : m)];
		int length = ((n > m) ? n : m) - 1;
		int lengthA = n - 1;
		int lengthB = m - 1;
		while (lengthA >= 0 && lengthB >= 0) {
			s[length] = a[lengthA] - b[lengthB];
			length--;
			lengthA--;
			lengthB--;
		}
		for (int i = 0; i <= length; i++) {
			s[i] = ((n > m) ? a[i] : -b[i]);
		}
		Polynomial result=new Polynomial(s.length,s);
		return result;
	}

	public static Polynomial multiply(Polynomial x, Polynomial y) {
		int n=x.getDegree();
        int m=y.getDegree();
        int[] a=x.getCoefficients();
        int[] b=y.getCoefficients();
		int multiply[] = new int[n + m - 1];
		int lengthA = n - 1;
		int lengthB = m - 1;
		int length = n + m - 2;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				multiply[length - lengthA + i - lengthB + j] += a[i] * b[j];
		Polynomial result=new Polynomial(multiply.length,multiply);
		return result;
	}

	public static int eval(Polynomial x, int scalar) {
		int n=x.getDegree();
        int[] a=x.getCoefficients();
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += +Math.pow(scalar, n - 1 - i) * a[i];

		}
		return result;
	}

	public static Polynomial mul_scal(Polynomial x, int scalar) {
		int n=x.getDegree();
        int[] a=x.getCoefficients();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = a[i] * scalar;

		}
		
		Polynomial result=new Polynomial(array.length,array);
		return result;
		
	}

}
