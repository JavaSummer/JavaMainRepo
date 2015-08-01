package polynomial;

import java.io.*;
import java.util.Scanner;

public class InputOutput {
	private int lines = 0;
	private static Polynomial p1;
	private static Polynomial p2;
	private static Polynomial Result;

	public void readAndWrite(String filename) {
		try {
			FileWriter fileWriter = new FileWriter("D:\\Eclipse Workspace\\Assignment 2\\src\\polynomial\\output.txt",
					false);
			BufferedWriter bufferWritter = new BufferedWriter(fileWriter);
			try {
				File inputsFile = new File(filename);
				Scanner inputs = new Scanner(inputsFile);

				while (inputs.hasNextLine()) {
					lines++;
					String[] split = inputs.nextLine().split(" ");
					int[] polCoeffs = new int[split.length];

					for (int j = 0; j < split.length; j++) {
						polCoeffs[j] = Integer.parseInt(split[j]);
					}
					if (lines == 1) {
						p1 = new Polynomial(polCoeffs, split.length);
						bufferWritter.write("First polynomial: \r\n");
						bufferWritter.write(p1.toString() + "\r\n");
					} else {
						p2 = new Polynomial(polCoeffs, split.length);
						bufferWritter.write("Second polynomial: \r\n");
						bufferWritter.write(p2.toString() + "\r\n");
					}
					System.out.println();
				}
				inputs.close();

			} catch (Exception e) {
				System.out.println("Couldn't find the file.");
			}

			try {
				File inputsFile = new File(filename);
				Scanner inputs = new Scanner(inputsFile);
				for (int i = 0; i < lines; i++) {
					inputs.nextLine();
				}
				while (inputs.hasNextLine()) {
					String[] split = inputs.nextLine().split(" ");
					for (int j = 0; j < split.length; j++) {
						if (split[j].length() == 1) {
							switch (split[j - 1]) {
							case "MUL_SCAL":
								Result = Functions.mul_scal(p1, Integer.parseInt(split[j]));
								bufferWritter.write("Multiplication by scalar " + split[j] + ": \r\n");
								bufferWritter.write(Result.toString() + "\r\n");
								Result = Functions.mul_scal(p2, Integer.parseInt(split[j]));
								bufferWritter.write("Multiplication by scalar " + split[j] + ": \r\n");
								bufferWritter.write(Result.toString() + "\r\n");
								break;
							case "EVAL":
								long value = Functions.eval(p1, Long.parseLong(split[j]));
								bufferWritter.write("Evaluate for " + split[j] + ":\r\nFirst polynomial:\r\n");
								bufferWritter.write(String.valueOf(value) + "\r\n");

								value = Functions.eval(p2, Long.parseLong(split[j]));
								bufferWritter.write("Evaluate for " + split[j] + ":\r\nSecond Polynomial: \r\n");
								bufferWritter.write(String.valueOf(value) + "\r\n");
							}
						} else {
							switch (split[j]) {
							case "ADD":
								Result = Functions.add(p1, p2);
								bufferWritter.write("Addition: \r\n");
								bufferWritter.write(Result.toString() + "\r\n");
								break;
							case "SUBTRACT":
								Result = Functions.subtract(p1, p2);
								bufferWritter.write("Subtract: \r\n");
								bufferWritter.write(Result.toString() + "\r\n");
								break;
							case "MULTIPLY":
								Result = Functions.multiply(p1, p2);
								bufferWritter.write("Multiply: \r\n");
								bufferWritter.write(Result.toString() + "\r\n");
								break;
							case "ROOT":
								double theRoot = Functions.root(p1);
								bufferWritter.write("Root: \r\nFirst polynomial:\r\n");
								bufferWritter.write(String.valueOf(theRoot) + "\r\n");
								
								theRoot = Functions.root(p2);
								bufferWritter.write("Root: \r\nSecond polynomial:\r\n");
								bufferWritter.write(String.valueOf(theRoot) + "\r\n");
								break;
							}
						}
					}
				}
				inputs.close();
				bufferWritter.close();
			} catch (Exception e) {
				System.out.println("Couldn't find the file.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
