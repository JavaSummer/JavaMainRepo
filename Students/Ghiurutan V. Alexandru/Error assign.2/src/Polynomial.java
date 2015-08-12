import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Polynomial {
	private static double[] p1;
	private static double[] p2;

	public static void main(String[] args) {
		InputOutput inout = new InputOutput("pol.txt");
		p1 = inout.getP1();
		p2 = inout.getP2();
		Functions function = new Functions(p1, p2);
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter("output.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An error occured.");
		}
		String command = inout.getCommands();
		while (!command.isEmpty()) {
			String[] part = command.split(" ");
			switch (part[0]) {
			case "ADD":
				function.add(bufferedWriter);
				break;
			case "SUBTRACT":
				function.subtract(bufferedWriter);
				break;
			case "MULTIPLY":
				function.multiply(bufferedWriter);
				break;
			case "MUL_SCAL":
				function.scalarMultiplication(bufferedWriter, Integer.parseInt(part[1]));
				break;
			case "EVAL":
				function.evaluate(bufferedWriter, Integer.parseInt(part[1]));
				break;
			default:
				System.out.println("Unknown command " + command + ".");
				break;
			}
			command = inout.getCommands();
		}

	}
}
