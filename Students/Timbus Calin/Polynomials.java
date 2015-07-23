package myPackage;

import java.io.*;
import java.util.Scanner;

public class Polynomials {
	public static void main(String[] args) {

		Operations op = new Operations();
		int i = 1;
		int m = 0; // nr of elements in the first array
		int n = 0; // nr of elements in the second array
		int a[] = new int[100];
		int b[] = new int[100];
		int cc1 = 1;
		int cc2 = 1;
		int cc3 = 1;
		System.out.println("Reading File from Java code");

		// Name of the file
		File newfile = new File("pol.txt");
		try {
			Scanner fileScanner = new Scanner(newfile);

			// Read file line by line using one scanner
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				System.out.println(line);
				// Here we construct a new scanner object to manipulate the
				// lines
				Scanner lineScanner = new Scanner(line);
				while (lineScanner.hasNext()) {
					String token = lineScanner.next();
					// do whatever needs to be done with token
					if (i == 1) {
						int k = Integer.parseInt(token);
						a[m] = k;
						m++;
					} else if (i == 2) {
						int j = Integer.parseInt(token);
						b[n] = j;
						n++;
					} else if ((i == 8) && (cc1 == 1)) {
						int K = Integer.parseInt(lineScanner.next());
						op.EVAL(a, b, m, n, K);
						cc1++;
					} else if ((i == 9) && (cc2 == 1)) {
						int K = Integer.parseInt(lineScanner.next());
						op.EVAL(a, b, m, n, K);
						cc2++;
					} else if ((i == 10) && (cc3 == 1)) {
						int K = Integer.parseInt(lineScanner.next());
						op.EVAL(a, b, m, n, K);
						cc3++;
					} else
						switch (token) {
						case "ADD":
							op.ADD(a, b, m, n);
							break;

						case "SUBTRACT":
							op.SUBTRACT(a, b, m, n);
							break;

						case "MULTIPLY":
							op.MULTIPLY(a, b, m, n);
							break;

						case "MUL_SCALAR":
							int K = Integer.parseInt(lineScanner.next());
							op.MUL_SCALAR(a, b, m, n, K);
							System.out.println();
							break;
						default:
							System.out.println("Nothing to compute...");
							break;
						}

				}
				lineScanner.close();
				// you're at the end of the line here. Do what you have to do.
				i++;
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error while reading file line by line:" + e.getMessage());
			e.printStackTrace();
		}
		/**
		 * for(int z=0;z<m;z++) { System.out.print(a[z]+ " "); }
		 */
	}
}
