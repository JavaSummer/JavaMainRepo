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

		for (int i = 0; i < rf.getTokens().size(); i++) {
			System.out.println(rf.getTokens().get(i));
			switch (rf.getTokens().get(i)) {
			case "ADD":
				System.out.println("The 1st polynomial is: " + rf.getPolinom().get(0));
				System.out.println("The 2nd polynomial is: " + rf.getPolinom().get(1));
				System.out.println("The sum of the two polynomials is: "
						+ Functions.addition(rf.getPolinom().get(0), rf.getPolinom().get(1)));
				break;
			case "SUBTRACT":
				System.out.println("The diff of the two polynomials is: "
						+ Functions.subtraction(rf.getPolinom().get(0), rf.getPolinom().get(1)));
				break;
			case "MULTIPLY":
				System.out.println("The multiplication of the two polynomials is: "
						+ Functions.multiply(rf.getPolinom().get(0), rf.getPolinom().get(1)));
				break;
			case "MUL_SCAL":
				i++;
				System.out.println("The 1st polynomial multiplied with the scalar " + rf.getTokens().get(i) + " is: "
						+ Functions.multipyByScalar(rf.getPolinom().get(0), Integer.parseInt(rf.getTokens().get(i))));
				System.out.println("The 2nd polynomial multiplied with the scalar " + rf.getTokens().get(i) + " is: "
						+ Functions.multipyByScalar(rf.getPolinom().get(1), Integer.parseInt(rf.getTokens().get(i))));
				break;
			case "EVAL":
				i++;
				System.out.println("The 1st polynomial evalueted to " + rf.getTokens().get(i) + " is: "
						+ Functions.evaluate(rf.getPolinom().get(0), Double.parseDouble(rf.getTokens().get(i))));
				System.out.println("The 2nd polynomial evalueted to " + rf.getTokens().get(i) + " is: "
						+ Functions.evaluate(rf.getPolinom().get(1), Double.parseDouble(rf.getTokens().get(i))));
				break;
			default:
				System.out.println("Switch-case done");
				break;
			}
		}
	}
}
