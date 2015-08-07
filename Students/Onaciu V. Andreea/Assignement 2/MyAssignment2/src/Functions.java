
public class Functions {

	public int[] add(int[] a, int[] b, int n, int m) {
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
		return s;
	}

	public int[] substract(int[] a, int[] b, int n, int m) {

		int s[] = new int[((n > m) ? n : m)];
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
		return s;
	}

	public int[] multiply(int[] a, int[] b, int n, int m) {
		int multiply[] = new int[n + m - 1];
		int lengthA = n - 1;
		int lengthB = m - 1;
		int length = n + m - 2;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				multiply[length - lengthA + i - lengthB + j] += a[i] * b[j];
		return multiply;
	}

	public int eval(int[] a, int n, int scalar) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += +Math.pow(scalar, n - 1 - i) * a[i];

		}
		return result;
	}

	public int[] mul_scal(int[] a, int n, int scalar) {

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = a[i] * scalar;

		}

		return array;
	}

}
