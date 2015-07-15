import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		helperFunctions objHelp = new helperFunctions();
		
		System.out.println("Choose the number of digits");
		int nrOfDigits=input.nextInt();
		objHelp.method1(nrOfDigits);
	}

}
