package mainpack;

/**
 * 
 * @author alexh
 *
 */
public final class MainClass {

	/**
	 * Constructor.
	 */
	private MainClass() {
	}
	
	/**
	 * @param args 
	 */
	public static void main(final String[] args) {		
		solve("pol.txt", "output.txt");
	}
	
	/**
	 * @param inPath String
	 * @param outPath String
	 */
	public static void solve(final String inPath, final String outPath) {
		InputOutput in = new InputOutput(inPath, 0);
		InputOutput out = new InputOutput(outPath, 1);
		
		String poly1 = in.getLine();
		String poly2 = in.getLine();	
		
		PolyCalc pc = new PolyCalc(poly1, poly2);
		
		out.putLine(pc.getMathForm1());
		out.putLine(pc.getMathForm2());
		
		String temp = null;
		do {
			temp = in.getLine();
			out.putLine(temp);
			out.putLine(pc.solveLine(temp));
		} while (temp != null);
		
		in.closeIO();
		out.closeIO();
	}

}
