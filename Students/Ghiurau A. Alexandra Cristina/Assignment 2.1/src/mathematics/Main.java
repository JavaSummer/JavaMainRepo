package mathematics;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Alexa
 *
 */
public class Main {
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		ReadFile rf = new ReadFile();
		rf.init();

		String fileName = "C:/Users/Alexa/Desktop/JavaSummerCourse/MyRepo/JavaMainRepo/Students/Ghiurau A. Alexandra Cristina/Assignment 2.1/outputPol.txt";
		WriteFile data = new WriteFile(fileName, true);

		for (int i = 0; i < rf.getTokens().size(); i++) {
			System.out.println(rf.getTokens().get(i));
			switch (rf.getTokens().get(i)) {
			case "ADD":
				data.WriteToFile("The 1st polynomial is: " + rf.getPolinom().get(0));
				data.WriteToFile("The 2nd polynomial is: " + rf.getPolinom().get(1));
				data.WriteToFile("The sum of the two polynomials is: "
						+ Functions.addition(rf.getPolinom().get(0), rf.getPolinom().get(1)));
				break;
			case "SUBTRACT":
				data.WriteToFile("The diff of the two polynomials is: "
						+ Functions.subtraction(rf.getPolinom().get(0), rf.getPolinom().get(1)));
				break;
			case "MULTIPLY":
				data.WriteToFile("The multiplication of the two polynomials is: "
						+ Functions.multiply(rf.getPolinom().get(0), rf.getPolinom().get(1)));
				System.out.println("The multiplication of the two polynomials is: "
						+ Functions.multiply(rf.getPolinom().get(0), rf.getPolinom().get(1)));
				break;
			case "MUL_SCAL":
				i++;
				data.WriteToFile("The 1st polynomial multiplied with the scalar " + rf.getTokens().get(i) + " is: "
						+ Functions.multipyByScalar(rf.getPolinom().get(0), Integer.parseInt(rf.getTokens().get(i))));
				data.WriteToFile("The 2nd polynomial multiplied with the scalar " + rf.getTokens().get(i) + " is: "
						+ Functions.multipyByScalar(rf.getPolinom().get(1), Integer.parseInt(rf.getTokens().get(i))));
				break;
			case "EVAL":
				i++;
				data.WriteToFile("The 1st polynomial evalueted to " + rf.getTokens().get(i) + " is: "
						+ Functions.evaluate(rf.getPolinom().get(0), Double.parseDouble(rf.getTokens().get(i))));
				data.WriteToFile("The 2nd polynomial evalueted to " + rf.getTokens().get(i) + " is: "
						+ Functions.evaluate(rf.getPolinom().get(1), Double.parseDouble(rf.getTokens().get(i))));
				break;
			default:
				data.WriteToFile("Switch-case done");
				break;
			}
		}
	}
}
