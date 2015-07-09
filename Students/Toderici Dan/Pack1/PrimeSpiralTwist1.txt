package Pack1;
/**
 * .
 */
import java.util.Scanner;
/**
 * .
 * @author T
 *
 */
public class PrimeSpiral {
	public static void main(String args[]) {
		double ratio = 100;
		int n = 7;
		int i = n;
		int j = n;
		int primeNumbersOnDiagonals = 0;
		int numbersOnDiagonals = 0;
		int value = i * j;
		int[][] spiralMatrix = new int[n+1][n+1];
		while (value >= 1) {
			while (spiralMatrix[i][j] == 0) {
				spiralMatrix[i][j] = value;
				value--;

				if (j == 1) {
					break;
				}

				if (spiralMatrix[i][j - 1] != 0) {
					break;
				}
				j--;
			}
			i--;
			while (spiralMatrix[i][j] == 0) {
				spiralMatrix[i][j] = value;
				value--;

				if (i == 1) {
					break;
				}

				if (spiralMatrix[i - 1][j] != 0) {
					break;
				}
				i--;

			}
			j++;
			while (spiralMatrix[i][j] == 0) {
				spiralMatrix[i][j] = value;
				value--;

				if (j == n) {
					break;
				}

				if (spiralMatrix[i][j + 1] != 0) {
					break;
				}
				j++;
			}

			i++;

			while (spiralMatrix[i][j] == 0) {
				spiralMatrix[i][j] = value;
				value--;

				if (spiralMatrix[i + 1][j] != 0) {
					break;
				}
				i++;
			}
			j--;
		}
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1) {
					double  aux=( double ) spiralMatrix[i][j];
					if (Prime( aux )) {
						System.out.println(aux);
						primeNumbersOnDiagonals++;
					}
					numbersOnDiagonals++;
				}

				//System.out.print(spiralMatrix[i][j] + "\t");
			}
			//System.out.println();
		}
		primeNumbersOnDiagonals *=100;
		ratio = (double)primeNumbersOnDiagonals / (double) numbersOnDiagonals ;
		System.out.println("The ratio is : "+ratio);
		
	}
	

	static boolean Prime(double a) {
		if (a == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}