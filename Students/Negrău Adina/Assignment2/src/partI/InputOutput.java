package partI;

import partI.Functions;
import partI.Polynomial;

public class InputOutput {

	public static void main(String[] args) {
		Functions f = new Functions();
		f.openFile();
		Polynomial p = f.createPol();
		Polynomial p2 = f.createPol();
		f.next(p, p2);
		
	}
}
