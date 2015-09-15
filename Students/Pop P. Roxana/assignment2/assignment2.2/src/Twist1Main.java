import java.math.BigDecimal;

public class Twist1Main {

	public static void main(String[] args) {

		SystemOfEquations obj = new SystemOfEquations();

		BigDecimal a[][] = { { new BigDecimal(2), new BigDecimal(-1) }, { new BigDecimal(-2), new BigDecimal(-3) } };
		BigDecimal[] freeTerms = { new BigDecimal(4), new BigDecimal(2) };
		BigDecimal[] solutions = obj.solveEquationsSystem(a, freeTerms);
		obj.printSolution(solutions);
	}

}
