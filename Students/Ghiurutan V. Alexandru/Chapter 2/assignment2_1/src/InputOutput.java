import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class InputOutput {
	private String p1;
	private String p2;
	static FileWriter fileWriter;
	static BufferedWriter bufferedWriter;
	static FileReader fileReader;
	static BufferedReader bufferedReader;

	public InputOutput(String inputFileName, String outputFileName) {
		try {
			fileReader = new FileReader(inputFileName);
			bufferedReader = new BufferedReader(fileReader);
			p1 = bufferedReader.readLine();
			p2 = bufferedReader.readLine();
			fileWriter = new FileWriter(outputFileName);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("An error occured.");
		}
	}

	public String getCommands() {
		String s = "";
		try {
			s = bufferedReader.readLine();
		} catch (IOException e) {
			System.out.println("Error!");
		}
		String verify = s;
		while (s != null && (verify.trim().length() == 0)) {
			try {
				s = bufferedReader.readLine();
			} catch (IOException e) {
				System.out.println("Error!");
			}
			verify = s;
		}
		return s;
	}

	private void swap(int a, int b, double[] arr) {
		double t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}

	private double[] reverseArray(double[] a) {
		int left = 0, right = a.length - 1;
		while (left < right) {
			swap(left, right, a);
			left++;
			right--;
		}
		return a;
	}

	public double[] getP1() {
		String[] v = p1.split(" ");
		double[] a = new double[v.length];
		for (int i = 0; i < v.length; i++) {
			a[i] = Double.parseDouble(v[i]);
		}
		// reverse the array
		return reverseArray(a);
	}

	public double[] getP2() {
		String v[] = p2.split(" ");
		double[] a = new double[v.length];
		for (int i = 0; i < v.length; i++) {
			a[i] = Double.parseDouble(v[i]);
		}
		// reverse the array
		return reverseArray(a);
	}

	public void print(String p) {
		try {
			bufferedWriter = new BufferedWriter(new FileWriter("output.txt", true));
			bufferedWriter.write(p);
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch (IOException e) {
			System.out.println("An error occured.");
		}
	}

	public void print(double p) {
		try {
			fileWriter = new FileWriter("output.txt", true);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(String.valueOf(p));
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch (IOException e) {
			System.out.println("An error occured.");
		}
	}
}