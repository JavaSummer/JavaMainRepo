package polynomial;

import java.io.File;

public class Main {
	public static void main(String[] args) {

		InputOutput read = new InputOutput();
		read.readAndWrite("D:\\Eclipse Workspace\\Assignment 2\\src\\polynomial\\pol.txt");

		try {
			File file = new File("D:\\Eclipse Workspace\\Assignment 2\\src\\polynomial\\output.txt");
			if (file.createNewFile()) {
				System.out.println("File created.");
			} else {
				System.out.println("The file exists already.");
			}
		} catch (Exception e) {
			System.out.println("Failed.");
		}
	}
}
