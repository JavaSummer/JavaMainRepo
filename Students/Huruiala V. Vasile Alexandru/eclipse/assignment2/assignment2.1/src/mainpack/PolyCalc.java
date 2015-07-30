package mainpack;

/**
 * 
 * @author alexh
 *
 */
public class PolyCalc {
	/** First poly. */
	private Polynomial poly1;
	/** Second poly. */
	private Polynomial poly2;
	/** All of the functions it performs. */
	private static final String[] INSTRUCTIONS = {"", "ADD", "SUBTRACT"
												, "MULTIPLY", "MUL_SCAL"
												, "EVAL", "DIVIDE", "ROOTS"};
	/** No operation. */
	private static final int NOP = 0;
	/** Addition. */
	private static final int ADD = 1;
	/** Subtraction. */
	private static final int SUBTRACT = 2;
	/** Multiplication. */
	private static final int MULTIPLY = 3;
	/** Multiplication by scalar. */
	private static final int MUL_SCAL = 4;
	/** Evaluation. */
	private static final int EVAL = 5;
	/** Division. */
	private static final int DIVIDE = 6;
	/** Root approximation. */
	private static final int ROOTS = 7;
	
	/**
	 * Constructor taking 2 Strings.
	 * @param polStr1 String
	 * @param polStr2 String
	 */
	public PolyCalc(final String polStr1, final String polStr2) {
		this.poly1 = new Polynomial(polStr1);
		this.poly2 = new Polynomial(polStr2);
	}
	
	/**
	 * Searches the location of the instruction in the instructions array.
	 * @param instr String
	 * @return int
	 */
	private static double[] searchInstruction(final String instr) {
		//It will be split since it may contain a parameter
		double[] result = new double[2];
		result[0] = -1;
		String[] words = instr.split(" ");
		if (words.length > 1) {
			result[1] = Double.parseDouble(words[1]);
		}
		
		for (int i = 0; i < INSTRUCTIONS.length && result[0] == -1; i++) {
			if (words[0].equals(INSTRUCTIONS[i])) {
				result[0] = (double) i;
			}
		}
		
		return result;
	}
	
	/**
	 * Evaluates the instruction and returns the appropriate String.
	 * @param line String
	 * @return String
	 */
	public final String solveLine(final String line) {
		if (line == null) {
			return "NULL";
		}
		
		String result = null;
		double[] searched = searchInstruction(line);
		
		switch((int) searched[0]) {
		case NOP:
			result = "";
			break;
		case ADD:
			result = Polynomial.add(this.poly1, this.poly2).mathematicalForm();
			break;
		case SUBTRACT:
			result = Polynomial.subtract(this.poly1, 
					this.poly2).mathematicalForm();
			break;
		case MULTIPLY:
			result = Polynomial.multiply(this.poly1,
					this.poly2).mathematicalForm();
			break;
		case MUL_SCAL:
			result = Polynomial.multiplyByScalar(this.poly1, 
					searched[1]).mathematicalForm()
			+ "|" + Polynomial.multiplyByScalar(this.poly2, 
					searched[1]).mathematicalForm();
			break;
		case EVAL:
			result = Polynomial.evaluate(this.poly1, searched[1])
			+ "|" + Polynomial.evaluate(this.poly2, searched[1]);
			break;
		case DIVIDE:
			Polynomial[] temp = Polynomial.divide(this.poly1, this.poly2);
			result = temp[0].mathematicalForm() + "|" 
			+ temp[1].mathematicalForm();
			break;
		case ROOTS:
			BisectionAprox ba1 = new BisectionAprox(this.poly1);
			BisectionAprox ba2 = new BisectionAprox(this.poly2);
			
			double[] d1 = ba1.refinedRoots();
			double[] d2 = ba2.refinedRoots();
			
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			
			for (int i = 0; i < d1.length; i++) {
				sb1.append(d1[i]);
				if (i < d1.length - 1) {
					sb1.append(",");
				}
			}
			for (int i = 0; i < d2.length; i++) {
				sb2.append(d2[i]);
				if (i < d2.length - 1) {
					sb2.append(",");
				}
			}
			
			result = sb1.toString() + "|" + sb2.toString();
			break;
		default:
			result = "Invalid Operation.";
			break;
		}
		
		return result;
	}
	
	/**
	 * Returns the mathematical form of the first poly.
	 * @return String
	 */
	public final String getMathForm1() {
		return this.poly1.mathematicalForm();
	}
	
	/**
	 * Returns the mathematical form of the second poly.
	 * @return String
	 */
	public final String getMathForm2() {
		return this.poly2.mathematicalForm();
	}
}
