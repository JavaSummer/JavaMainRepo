
public class Test {
	public static void main(String[] args) {
		InputOutput inout = new InputOutput("pol.txt", "output.txt");
		Polynomial p1 = new Polynomial(inout.getP1());
		Polynomial p2 = new Polynomial(inout.getP2());
		Functions function = new Functions();
		Commands.solveCommands(inout, p1, p2, function);
		
	}
}
