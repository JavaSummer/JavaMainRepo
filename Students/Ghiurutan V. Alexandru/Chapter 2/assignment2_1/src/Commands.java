
public class Commands {
	public Commands() {
	}

	public static void solveCommands(InputOutput inout, Polynomial p1, Polynomial p2, Functions function) {
		String c = inout.getCommands();
		while (c != null) {
			String[] com = c.split(" ");
			switch (com[0]) {
			case "ADD":
				Polynomial p = function.add(p1, p2);
				inout.print(p.toString());
				break;
			case "SUBTRACT":
				Polynomial p3 = function.subtract(p1, p2);
				inout.print(p3.toString());
				break;
			case "MULTIPLY":
				Polynomial p4 = function.multiply(p1, p2);
				inout.print(p4.toString());
				break;
			case "MUL_SCAL":
				Polynomial p5 = function.scalarMultiplication(p1, Integer.parseInt(com[1]));
				inout.print(p5.toString());
				Polynomial p6 = function.scalarMultiplication(p2, Integer.parseInt(com[1]));
				inout.print(p6.toString());
				break;
			case "EVAL":
				double a = function.evaluate(p1, Integer.parseInt(com[1]));
				inout.print(a);
				double b = function.evaluate(p2, Integer.parseInt(com[1]));
				inout.print(b);
				break;
			default:
				System.out.println("An error occured.");
				break;
			}
			c = inout.getCommands();
		}
	}
}
