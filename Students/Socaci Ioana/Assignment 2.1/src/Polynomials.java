import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Polynomials {
	public static void main(String[] args) throws FileNotFoundException {

		InputOutput obj = new InputOutput(new Scanner(new File("pol.txt")), new PrintWriter(new File("out.txt")));
		obj.readFromFile();
		obj.printResults();
	}

}
