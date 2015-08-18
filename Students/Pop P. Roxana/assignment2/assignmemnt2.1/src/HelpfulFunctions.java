import java.util.StringTokenizer;

public class HelpfulFunctions {

	private int m, n;
	private int[] firstPoly = new int[50], secPoly = new int[50];

	public void initialize(int m1, int[] a, int n1, int[] b) {

		m = m1;
		n = n1;

		for (int i = 0; i < m; i++) {
			firstPoly[i] = a[i];
		}
		for (int i = 0; i < m; i++) {
			secPoly[i] = b[i];
		}
	}

	public int extractPolyMethod1(int poly[], String line) {

		int i = 0;
		// put the line into an integer array
		StringTokenizer Tok = new StringTokenizer(line);
		while (Tok.hasMoreElements()) {
			poly[i] = Integer.parseInt(Tok.nextToken());
			i++;
		}
		return i;
	}

	public int extractPolyMethod2(int poly[], String line) {

		String[] parts = line.split(" ");
		int n = parts.length;

		for (int i = 0; i < n; i++) {
			poly[n - i - 1] = Integer.parseInt(parts[i].trim());
		}
		return n;
	}

	public int separateNumber(String originalString) {

		String[] parts = originalString.split(" ", 2);
		String part2 = parts[1];
		if (parts.length != 2)
			throw new IllegalArgumentException("String not in correct format");
		int nr = Integer.parseInt(part2.trim());
		return nr;
	}

	public int eval(int[] a, int size, int nr) {

		int result = 0;
		int i, x = 1;
		for (i =0;i<size;i++) {
			result += a[i]*x;
			x *= nr;
		}
		return result;
	}

	public int[] mulScalar(int[] a, int size, int nr) {

		int[] result = new int[50];
		for (int i = 0; i < size; i++) {
			result[i] = nr * a[i];
		}
		return result;
	}

	int[] add(int a[], int sizeA, int b[], int sizeB) {

		int[] result = new int[50];
		int i = 0;
		while (i < sizeA && i < sizeB) {
			result[i] = a[i] + b[i];
			i++;
		}
		while (i < sizeA) {
			result[i] = a[i];
			i++;
		}
		while (i < sizeB) {
			result[i] = b[i];
			i++;
		}
		return result;

	}

	int[] subtract(int a[], int sizeA, int b[], int sizeB) {

		int[] result = new int[50];
		int i = 0;
		while (i < sizeA && i < sizeB) {
			result[i] = a[i] - b[i];
			i++;
		}
		while (i < sizeA) {
			result[i] = a[i];
			i++;
		}
		while (i < sizeB) {
			result[i] = -b[i];
			i++;
		}
		return result;

	}

	int[] multiply(int a[], int sizeA, int b[], int sizeB) {
		
		int[] result = new int[50];
		int l = sizeA + sizeB - 1;//size of the array containing the el of the resulted polynomial

		for (int i = 0; i < l; i++) {
			result[i] = 0;
		}
		
		for (int i = 0; i < sizeA; i++) {
			for (int j = 0; j < sizeB; j++) {
				result[i+j]+=a[i]*b[j];
			}
		}
		return result;

	}

	public String transfPolyToString(int[] a, int size) {

		String s = "";
		for (int i = size - 1; i >= 0; i--) {
			s = s + ((i != size - 1 && a[i] >= 0) ? "+" : "") + a[i] + "x^" + i;
		}
		return s;
	}
	public String transfPolyToString(float[] a, int size) {

		String s = "";
		for (int i = size - 1; i >= 0; i--) {
			s = s + ((i != size - 1 && a[i] >= 0) ? "+" : "") + a[i] + "x^" + i;
		}
		return s;
	}

	public String executeCommand(String line) {

		String s = "";

		if (line.equals("ADD")) {

			int[] result = new int[20];
			result = add(firstPoly, m, secPoly, n);
			int size = Math.max(m, n);
			s = transfPolyToString(result, size);

		}

		if (line.equals("SUBTRACT")) {

			int[] result = new int[50];
			result = subtract(firstPoly, m, secPoly, n);

			int size = Math.max(m, n);
			s = transfPolyToString(result, size);
		}

		if (line.equals("MULTIPLY")) {

			int[] result = new int[50];
			result = multiply(firstPoly, m, secPoly, n);

			int size = m + n - 1;
			s = transfPolyToString(result, size);
		}

		if (line.contains("MUL_SCAL")) {

			int nr = separateNumber(line);
			int[] result1, result2 = new int[50];
			result1 = mulScalar(firstPoly, m, nr);
			result2 = mulScalar(secPoly, n, nr);
			s = transfPolyToString(result1, m) + " and " + transfPolyToString(result2, n);
		}

		if (line.contains("EVAL")) {

			int nr = separateNumber(line);
			int result1, result2;
			result1 = eval(firstPoly, m, nr);
			result2 = eval(secPoly, n, nr);
			s = new String(String.format("%d and %d", result1, result2));
		}
		return s;
	}
}
