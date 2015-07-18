
public class FibonacciEvenSum {
	public static void main(String[] args) {
		int i = 0;
		int sum1 = 0;
	
		while (fibonacci(i) < 4000000 && fibonacci(i) != -1) {
			int n = fibonacci(i);
			if (n % 2 == 0) sum1+=n;
			i++;
		}
		System.out.println("O(n) algorith result: " + sum1 + ".");
		
		i = 0;
		int sum2 = 0;
		while (fibonacciTwist(i) < 4000000) {
			int n = fibonacciTwist(i);
			if (n % 2 == 0) sum2+=n;
			i++;
		}
		System.out.println("O(log n) algorithm result: " + sum2 + ".");
	}

	//O(n) time algorithm
	public static int fibonacci(int n) {
		// as the limit is 4_000_000 the members with index >34 should never be
		// requested
		if (n < 35) {
			int[] a = new int[35];
			a[0] = 1;
			a[1] = 1;
			a[2] = 2;

			for (int i = 3; i <= n; i++) {
				a[i] = a[i - 1] + a[i - 2];
			}

			return a[n];
		}
		else return -1;
	}
	
	//O(log n) time algorithm
	public static int[][] multMat(int[][] m, int [][] n) {
	    int a = m[0][0] * n[0][0] +  m[0][1] * n[1][0];
	    int b = m[0][0] * n[0][1] +  m[0][1] * n[1][1];
	    int c = m[1][0] * n[0][0] +  m[1][1] * n[1][0];
	    int d = m[1][0] * n[0][1] +  m[1][1] * n[1][1];
	    int[][] ret = {
	        {a, b},
	        {c, d}};
	    return ret;
	}
	
	public static int fibonacciTwist(int n) {

        int[][] result = {{1, 0}, 
        				  {0, 1}}; // identity matrix.
        int[][] fibonacciMatrix = {{1, 1}, 
        						   {1, 0}};

        while (n > 0) {
            if (n%2 == 1) {
                result = multMat(result, fibonacciMatrix);
            }
            n /= 2;
            fibonacciMatrix = multMat(fibonacciMatrix, fibonacciMatrix);
        }

        return result[1][0];
    }
}
