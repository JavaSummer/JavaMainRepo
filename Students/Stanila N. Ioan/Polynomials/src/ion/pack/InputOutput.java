package ion.pack;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author Ion
 * Class that manages the input and output for the project.
 */
public class InputOutput {
	
	/**
	 * The input file.
	 */
	private String fileIn;
	/**
	 * The output file.
	 */
	private String fileOut;
	/**
	 * File object for the output file.
	 */
	private File fOut;
	/**
	 * ...
	 */
	private FileWriter fw;
	
	/**
	 * Constructs a new object with the specified file name.
	 * @param file the name of the file.
	 * @throws IOException 
	 */
	InputOutput(final String file) throws IOException {
		fileIn = new String();
		fileIn = fileIn.concat(file);
		fileOut = new String();
		fileOut = fileOut.concat("results.dat");
		fOut = new File(fileOut);
		fw = new FileWriter(fOut);
	}
	
	/**
	 * Gives the desired polynomial.
	 * @param n the first => 1 or the second => 2 polynomial.
	 * @return a polynomial.
	 * @throws IOException 
	 */
	public final Polynomial givePoly(final int n) throws IOException {
		String line;
		FileReader fr = new FileReader(fileIn);
		BufferedReader br = new BufferedReader(fr);
		if (n == 1) {
			line = br.readLine();
		} else if (n == 2) {
			br.readLine();
			line = br.readLine();
		} else {
			line = br.readLine();
		}
		br.close();
		String[] coeffs = line.split(new String(" "));
		double[] coeff = new double[coeffs.length];
		int i;
		for (i = 0; i < coeffs.length; i++) {
			coeff[coeffs.length - i - 1] = Double.parseDouble(coeffs[i]);
		}
		Polynomial c = new Polynomial(coeff);
		return c;
	}
	
	/**
	 * Gives the list of commands.
	 * @return the list of commands.
	 * @throws IOException
	 */
	public final ArrayList<String> giveComm() throws IOException {
		FileReader fr = new FileReader(fileIn);
		BufferedReader br = new BufferedReader(fr);
		String line;
		ArrayList<String> comm = new ArrayList<String>();
		line = br.readLine();
		line = br.readLine();
		while ((line = br.readLine()) != null) {
			comm.add(line);
		}
		br.close();
		return comm;
	}
	
	/**
	 * Prints the polynomial to the file.
	 * @param a the polynomial.
	 * @throws IOException 
	 */
	public final void print(final Polynomial a) throws IOException {
		fw.write(a.toString() + "\n");
		fw.flush();
	}
	
	/**
	 * Prints the variable to a file.
	 * @param x the value to print.
	 * @throws IOException 
	 */
	public final void print(final double x) throws IOException {
		fw.write(String.valueOf(x) + "\n");
		fw.flush();
	}
	
	/**
	 * Prints the string to a file.
	 * @param s the string to print.
	 * @throws IOException
	 */
	public final void print(final String s) throws IOException {
		fw.write(s + "\n");
		fw.flush();
	}
	
	/**
	 * Close the writing buffer.
	 * Always close the writing buffer!
	 * @throws IOException
	 */
	public final void closeWBuffer() throws IOException {
		fw.close();
	}
}
