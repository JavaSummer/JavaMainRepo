import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutput {
	private String p1;
	private String p2;
	static Scanner in;

	public InputOutput(String fileName) {
		try {
			in = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("File " + fileName + " not found.");
		}
		p1 = in.nextLine();
		p2 = in.nextLine();
	}

	public String getCommands() {
		return in.nextLine();
	}

	private void swap(double a, double b) {
		double t = a;
		a = b;
		b = t;
	}

	public double[] getP1() {
		String[] v = p1.split(" ");
		double[] a = new double[v.length];
		for (int i = 0; i < v.length; i++) {
			a[i] = Double.parseDouble(v[i]);
		}
		// reverse the array
		int left = 0, right = a.length - 1;
		while (left < right) {
			swap(a[left], a[right]);
			left++;
			right--;
		}
		return a;
	}

	public double[] getP2() {
		String v[] = p2.split(" ");
		double[] a = new double[v.length];
		for (int i = 0; i < v.length; i++) {
			a[i] = Double.parseDouble(v[i]);
		}
		// reverse the array
		for (int left = 0, right = a.length - 1; left < right; left++, right--) {
			swap(a[left], a[right]);
		}
		return a;
	}
}