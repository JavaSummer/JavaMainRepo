package myPackage;

import java.util.Scanner;
import java.math.BigDecimal;

public class MatrixOperations {
	public static int n;

	public  void Instantiate(BigDecimal[][] m1) {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				m1[i][j] = new BigDecimal(0.0);
			}
	}

	public void Initialise(BigDecimal[][] m1) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Please introduce the dimension of the matrix:");
		n = scannerObject.nextInt();
		System.out.println("Please introduce the numbers for the matrix");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
			   	double number = scannerObject.nextDouble();
				m1[i][j] = new BigDecimal(number);
			}
		scannerObject.close();
	}

	public void addMatrix(BigDecimal[][] m1, BigDecimal[][] m2) {
		BigDecimal[][] outputMatrix = new BigDecimal[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				outputMatrix[i][j] = new BigDecimal(0.0);
			}
		BigDecimal result;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				result = new BigDecimal(0.0);
				result.add(m1[i][j]);
				result.add(m2[i][j]);
				outputMatrix[i][j].add(result);
			}
	}
}