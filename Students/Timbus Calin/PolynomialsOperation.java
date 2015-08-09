package myPackage;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Polynomials {
	@SuppressWarnings("unchecked")

	public static void main(String[] args) {
		Polynomial p1 = new Polynomial(0, 0);
		Polynomial p2 = new Polynomial(0, 0);
		Polynomial pp = new Polynomial(0, 0);
		System.out.println("Reading File from Java code");
		int i = 1;
		// Name of the file
		File newfile = new File("pol.txt");
		try {
			Scanner fileScanner = new Scanner(newfile);
			// Read file line by line using one scanner
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				// System.out.println(line);
				// Here we construct a new scanner object to manipulate the
				// lines
				Scanner lineScanner = new Scanner(line);
				if (i == 1) {
					@SuppressWarnings("rawtypes")
					Vector v = new Vector(5, line.length());
					while (lineScanner.hasNext()) {
						// do whatever needs to be done with token
						String token = lineScanner.next();
						if (token != " ") {
							v.add(token);
						}
					}
					v.trimToSize();
					String[] str = new String[v.size()];
					v.copyInto(str);
					int greater = v.size();
					for (int j = 0; j < v.size(); j++) {
						int coeff = Integer.parseInt(str[j]);
						Polynomial p = new Polynomial(coeff, --greater);
						p1 = p1.plus(p);
					}
					System.out.println("The first polynomial is: " + p1.toString());
					i++;
					lineScanner.close();
				} else if (i == 2) {

					@SuppressWarnings("rawtypes")
					Vector v = new Vector(5, line.length());
					while (lineScanner.hasNext()) {
						// do whatever needs to be done with token
						String token = lineScanner.next();
						if (token != " ") {
							v.add(token);
						}
					}
					v.trimToSize();
					String[] str = new String[v.size()];
					v.copyInto(str);
					int greater = v.size();
					for (int j = 0; j < v.size(); j++) {
						int coeff = Integer.parseInt(str[j]);
						Polynomial p = new Polynomial(coeff, --greater);
						p2 = p2.plus(p);
					}
					System.out.println("The second polynomial is: " + p2.toString());
					i++;
					lineScanner.close();
				} else {
					line.trim();
					switch (line) {
					case "ADD":
						System.out.println("The sum of the polynomials is: " + p1.plus(p2));
						break;

					case "SUBTRACT":
						System.out.println("The difference of the polynomials is: " + p1.minus(p2));
						break;
					}
					if (line.contains("MUL_SCAL")) {
						char c = line.charAt(line.length() - 1);
						int k = Character.getNumericValue(c);
						System.out.println("The first polynomial multiplied by " + k + " is: ");
						System.out.println(pp.Mul_Scalar(p1, k));
						System.out.println("The second polynomial multiplied by " + k + " is: ");
						System.out.println(pp.Mul_Scalar(p2, k));
					}
					if (line.contains("EVAL")) {
						char c = line.charAt(line.length() - 1);
						int k = Character.getNumericValue(c);
						System.out.println("The value of the first polynomial at point " + k + " is: ");
						System.out.println(p1.evaluate(k));
						System.out.println("The value of the second polynomial at point " + k + " is: ");
						System.out.println(p2.evaluate(k));

					}

				}

			}
			fileScanner.close();
		}

		catch (Exception e) {
			System.out.println("Error while reading file line by line:" + e.getMessage());
			e.printStackTrace();
		}
	}
}
